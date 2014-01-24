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
//    public  void main(String[] args) {
//        //SaveCust();
//        //AddPackage(12,"tt","mm","zz",33);
//        System.out.println(orderV.elementAt(0).PackageObj.getPackageNo());
//    }
    
//    public  void AddOrder(double Amount, int IC, int OrderNo, double Weight, String custName,String SName,String SAdd,String CName, String CAdd){
//        fileCheck();
//        retrieveData();
//        orderV.addElement(new Order(Amount, IC, OrderNo, Weight, custName,SName,SAdd,CName,CAdd)); 
//        save();
//    }
//    
//    public  void EditOrder(double Amount, int IC, int OrderNo, double Weight, String custName,String SName,String SAdd,String CName, String CAdd){
//        retrieveData();
//        for (int i = 0; i <orderV.size(); i++) {
//            if (orderV.elementAt(i).getOrderNo()==OrderNo) {
//                orderV.setElementAt(new Order(Amount, IC, OrderNo, Weight, custName,SName,SAdd,CName,CAdd), i);
//            }  
//        }
//        save();
//    }
    
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
                    if (orders.getOrderNo() == orderV.elementAt(i).getOrderNo()) {
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
