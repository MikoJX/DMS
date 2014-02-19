/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import java.util.Vector;
import Classes.Order;
/**
 *
 * @author Miko
 */
public class OrderFileIO extends FileHandler{
    public  Vector<Order> orderV=new Vector<Order>(); 

     @Override
     public void add(Object order){
         if(order instanceof Order)
            {
                fileCheck();
                retrieveData();
                orderV.addElement((Order) order);
                save();
            }
    }
     
    @Override
    public void edit(Object order){
          Order orders = new Order();
          orders = (Order) order;
         
          if(order instanceof Order)
            {
                retrieveData();
                for (int i = 0; i <orderV.size(); i++) {
                    if (orders.getorderNo() == orderV.elementAt(i).getorderNo()) {
                        orderV.setElementAt((Order) order, i);
                    }                 
                }
                save();
            }
    }
    
    
    @Override
    public void retrieveData(){
        if (orderV.isEmpty()==false) {orderV.removeAllElements();}
        
        //Retrieving Package Record
        try {
            FileInputStream fis = new FileInputStream("orderRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while (true) {
               orderV.addElement((Order)ois.readObject());              
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
            FileOutputStream fos = new FileOutputStream("orderRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < orderV.size(); i++) {
                oos.writeObject(orderV.elementAt(i));
            }
            oos.close();
//            System.out.println(packV.elementAt(0).getTitle());
         
         } catch (Exception ex) {
            System.out.println("Invalid !");
         } 
    
    }
    
    @Override
    public void fileCheck(){
         try {
            FileInputStream fis = new FileInputStream("orderRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.close();
        } catch (Exception e) {
//            FileOutputStream fos = new FileOutputStream("packRecord.txt");
//            ObjectOutputStream obj = new ObjectOutputStream(fos);
//            obj.close();
        }
    }
    
}
