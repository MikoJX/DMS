/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import java.util.Vector;
import Classes.Package;
/**
 *
 * @author Miko
 */
public class PackageFileIO {
    public static Vector<Package> packV=new Vector<Package>(); 
    
//    public static void main(String[] args) {
//               
//        //packV.clear();
//        RetrievePackage();
//        
//        //AddPackage(222,200,2,2.6,"Bla");
////        SavePackage();
//        //EditPackage();
//        //EditPackage(222,300,2,2.6,"Bla");
//        
//        //System.out.println(packV.elementAt(0).getMax());
//    }
    
    public static void AddPackage(int pno,int max,int min,double rate,String title){
        FileCheck();
        RetrievePackage();
        packV.addElement(new Package(rate,title,pno,min,max)); 
        SavePackage();
    }
    
    public static void EditPackage(int pno,int max,int min,double rate,String title){
        RetrievePackage();
        for (int i = 0; i <packV.size(); i++) {
            if (packV.elementAt(i).getPackageNo()==pno) {
                packV.setElementAt(new Package(rate,title,pno,min,max), i);
            }  
        }
        SavePackage();
    }
    
    public static void RetrievePackage(){
        if (packV.isEmpty()==false) {packV.removeAllElements();}
           
         //Retrieving Package Record
            try {
                FileInputStream fis = new FileInputStream("packRecord.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                   packV.addElement((Package)ois.readObject());              
                 }      
            } catch (Exception e) {
                //System.out.println("No Record");
            }      
    }
    
    public static void SavePackage(){    

        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream fis = new FileOutputStream("packRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            
            for (int i = 0; i < packV.size(); i++) {
                oos.writeObject(packV.elementAt(i));
            }
            
            oos.close();
         
         } catch (Exception ex) {
            System.out.println("Invalid !");
         } 
         
    }
    
    public static void FileCheck() {
        try {
            FileInputStream fis = new FileInputStream("packRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.close();
        } catch (Exception e) {
//            FileOutputStream fos = new FileOutputStream("packRecord.txt");
//            ObjectOutputStream obj = new ObjectOutputStream(fos);
//            obj.close();
        }
    
    }
}
