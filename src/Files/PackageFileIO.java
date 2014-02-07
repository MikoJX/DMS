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
public class PackageFileIO extends FileHandler {
    public static Vector<Package> packV=new Vector<Package>(); 
    
//    public static void main(String[] args) {
//               
//        //packV.clear();
//        retrieveData();
//        
//        //AddPackage(222,200,2,2.6,"Bla");
////        SavePackage();
//        //EditPackage();
//        //EditPackage(222,300,2,2.6,"Bla");
//        
//        //System.out.println(packV.elementAt(0).getMax());
//    }
    
//    public static void AddPackage(int pno,int max,int min,double rate,String title){
//        FileCheck();
//        retrieveData();
//        packV.addElement(new Package(rate,title,pno,min,max)); 
//        SavePackage();
//    }
    
    @Override
    public void add(Object pack){
         if(pack instanceof Package)
            {
                fileCheck();
                retrieveData();
                packV.addElement((Package) pack);
                save();
            }
    }
    
    @Override
    public void edit(Object pack){
        
         Package packs = new Package();
         packs = (Package) pack;
         
          if(pack instanceof Package)
            {
                retrieveData();
                for (int i = 0; i <packV.size(); i++) {
                    if (packs.getpackageNo() == packV.elementAt(i).getpackageNo()) {
                        packV.setElementAt((Package) packs, i);
                    } 
                }
                save();
            }
    }
    
//    public static void EditPackage(int pno,int max,int min,double rate,String title){
//        retrieveData();
//        for (int i = 0; i <packV.size(); i++) {
//            if (packV.elementAt(i).getPackageNo()==pno) {
//                packV.setElementAt(new Package(rate,title,pno,min,max), i);
//            }  
//        }
//        SavePackage();
//    }
    
    @Override
    public void retrieveData(){
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
    
    @Override
    public void save(){    

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
    
    @Override
    public void fileCheck() {
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
