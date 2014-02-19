/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import java.util.Vector;
import Classes.Customer;
/**
 *
 * @author Miko
 */
public class CustomerFileIO extends FileHandler{
    public Vector<Customer> custV=new Vector<Customer>(); 
    
    @Override
    public void add(Object customer){
            if(customer instanceof Customer)
            {
                fileCheck();
                retrieveData();
                custV.addElement((Customer) customer);
                save();
            }
    }
    @Override
    public void edit(Object customer){
          Customer cust = new Customer();
          cust = (Customer) customer;
         
          if(customer instanceof Customer)
            {
                retrieveData();
                for (int i = 0; i <custV.size(); i++) {
                    if (cust.getcustIC() == custV.elementAt(i).getcustIC()) {
                        custV.setElementAt((Customer) customer, i);
                    } 
                }
                save();
            }
    }
    @Override
    public void retrieveData(){
        if (custV.isEmpty()==false) {custV.removeAllElements();}
        
        //Retrieving Package Record
        try {
            FileInputStream fis = new FileInputStream("custRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
               custV.addElement((Customer)ois.readObject());              
             }            
        } catch (Exception e) {
        }
    }
    @Override
    public void save(){
        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream fos = new FileOutputStream("custRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < custV.size(); i++) {
                oos.writeObject(custV.elementAt(i));
            }
            oos.close();
         
         } catch (Exception ex) {
            System.out.println("Invalid !");
         } 
    }
    
    @Override
    public void fileCheck(){
         try {
            FileInputStream fis = new FileInputStream("custRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.close();
        } catch (Exception e) {
//            FileOutputStream fos = new FileOutputStream("packRecord.txt");
//            ObjectOutputStream obj = new ObjectOutputStream(fos);
//            obj.close();
        }
    }
}
