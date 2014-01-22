/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import java.util.Vector;
import Classes.Customer;
import Classes.Package;
import Classes.Order;
/**
 *
 * @author Miko
 */
public class OrderFileIO {
    
    public static Vector<Order> orderV=new Vector<Order>(); 
//    public static void main(String[] args) {
//        //SaveCust();
//        //AddPackage(12,"tt","mm","zz",33);
//        System.out.println(orderV.elementAt(0).PackageObj.getPackageNo());
//    }
    
    public static void AddOrder(double Amount, int IC, int OrderNo, double Weight, String custName,String SName,String SAdd,String CName, String CAdd){
        FileCheck();
        RetrieveOrder();
        orderV.addElement(new Order(Amount, IC, OrderNo, Weight, custName,SName,SAdd,CName,CAdd)); 
        SaveOrder();
    }
    
    public static void EditOrder(double Amount, int IC, int OrderNo, double Weight, String custName,String SName,String SAdd,String CName, String CAdd){
        RetrieveOrder();
        for (int i = 0; i <orderV.size(); i++) {
            if (orderV.elementAt(i).getOrderNo()==OrderNo) {
                orderV.setElementAt(new Order(Amount, IC, OrderNo, Weight, custName,SName,SAdd,CName,CAdd), i);
            }  
        }
        SaveOrder();
    }
    
    public static void RetrieveOrder(){
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
    
    public static void SaveOrder(){
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
    
    public static void FileCheck(){
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
