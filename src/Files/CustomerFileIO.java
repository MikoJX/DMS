/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import java.util.Vector;
import Classes.Customer;
//import Classes.Package;
/**
 *
 * @author Miko
 */
public class CustomerFileIO {
    public static Vector<Customer> custV=new Vector<Customer>(); 
//    public static void main(String[] args) {
//        //SaveCust();
//        //AddPackage(12,"tt","mm","zz",33);
//        System.out.println(custV.elementAt(0).PackageObj.getPackageNo());
//    }
    
    public static void AddCust(int CIC, String CName, String SName, String SAdd, int Pno){
        FileCheck();
        RetrieveCust();
        custV.addElement(new Customer(CIC,CName,SName,SAdd,Pno)); 
        SaveCust();
    }
    
    public static void EditCust(int CIC, String CName, String SName, String SAdd,int PNo){
        RetrieveCust();
        for (int i = 0; i <custV.size(); i++) {
            if (custV.elementAt(i).getCustIC()==CIC) {
                custV.setElementAt(new Customer(CIC,CName,SName,SAdd,PNo), i);
            }  
        }
        SaveCust();
    }
    
    public static void RetrieveCust(){
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
    
    public static void SaveCust(){
        //FILE INPUT
        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream fos = new FileOutputStream("custRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < custV.size(); i++) {
                oos.writeObject(custV.elementAt(i));
            }
            oos.close();
//            System.out.println(packV.elementAt(0).getTitle());
         
         } catch (Exception ex) {
            System.out.println("Invalid !");
         } 
    
    }
    
    public static void FileCheck(){
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
