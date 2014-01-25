/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import Classes.Invoice;
import java.util.Vector;

/**
 *
 * @author Miko
 */
public class InvoiceFileIO extends FileHandler{
    
     public  Vector<Invoice> invoiceV=new Vector<Invoice>(); 
    
    @Override
    public void add(Object invoice){
         if(invoice instanceof Invoice)
            {
                fileCheck();
                retrieveData();
                invoiceV.addElement((Invoice) invoice);
                save();
            }
    }
    
    @Override
    public void edit(Object payment){}
    
    @Override
    public void retrieveData(){
        if (invoiceV.isEmpty()==false) {invoiceV.removeAllElements();}
        
        //Retrieving Package Record
        try {
            FileInputStream fis = new FileInputStream("invRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while (true) {
               invoiceV.addElement((Invoice)ois.readObject());              
             }
            //ois.close();
            
        } catch (Exception e) {
            //System.out.println("No Record");
        }
    }
    
    @Override
    public void save(){
         try {
            // create a new file with an ObjectOutputStream
            FileOutputStream fos = new FileOutputStream("invRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < invoiceV.size(); i++) {
                oos.writeObject(invoiceV.elementAt(i));
            }
            oos.close();
//            System.out.println(packV.elementAt(0).getTitle());
         
         } catch (Exception ex) {
            System.out.println("Invalid !");
         } 
    }
    
    @Override
    public void fileCheck() {
        try {
            FileInputStream fis = new FileInputStream("invRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.close();
        } catch (Exception e) {
//            FileOutputStream fos = new FileOutputStream("packRecord.txt");
//            ObjectOutputStream obj = new ObjectOutputStream(fos);
//            obj.close();
        }
    }
}
