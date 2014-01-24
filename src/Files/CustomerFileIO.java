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
//    public static void main(String[] args) {
//        //SaveCust();
//        //AddPackage(12,"tt","mm","zz",33);
//        System.out.println(custV.elementAt(0).PackageObj.getPackageNo());
//    }
    
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

      
      
//    @Override
//      public void Add(){
//        FileCheck();
//        RetrieveData();
//        custV.addElement(new Customer(CIC,CName,SName,SAdd,Pno)); 
//        Save();
//    }
      @Override
      public void edit(Object customer){
          Customer cust = new Customer();
          cust = (Customer) customer;
         
          if(customer instanceof Customer)
            {
                retrieveData();
                for (int i = 0; i <custV.size(); i++) {
                    if (cust.getCustIC() == custV.elementAt(i).getCustIC()) {
                        custV.setElementAt((Customer) customer, i);
                    } 
                }
                save();
            }
      }
//    public void Edit(int CIC, String CName, String SName, String SAdd,int PNo){
//        RetrieveData();
//        for (int i = 0; i <custV.size(); i++) {
//            if (custV.elementAt(i).getCustIC()==CIC) {
//                custV.setElementAt(new Customer(CIC,CName,SName,SAdd,PNo), i);
//            }  
//        }
//        Save();
//    }
    
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
            //ois.close();
            
        } catch (Exception e) {
            //System.out.println("No Record");
        }
    }
    
    @Override
    public void save(){
        //FILE INPUT
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


//    @Override
//    public void Edit() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
