/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;
import java.io.*;
import Classes.Payment;
import java.util.Vector;

/**
 *
 * @author Miko
 */
public class PaymentFileIO extends FileHandler{
    public  Vector<Payment> payV=new Vector<Payment>(); 
    
    @Override
    public void add(Object payment){
        if(payment instanceof Payment)
            {
                fileCheck();
                retrieveData();
                payV.addElement((Payment) payment);
                save();
            }
    }
    
    @Override
    public void edit(Object payment){
    
    }
    
    @Override
    public void retrieveData(){
        if (payV.isEmpty()==false) {payV.removeAllElements();}
        
        //Retrieving Package Record
        try {
            FileInputStream fis = new FileInputStream("payRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while (true) {
               payV.addElement((Payment)ois.readObject());              
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
            FileOutputStream fos = new FileOutputStream("payRecord.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < payV.size(); i++) {
                oos.writeObject(payV.elementAt(i));
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
            FileInputStream fis = new FileInputStream("payRecord.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.close();
        } catch (Exception e) {
//            FileOutputStream fos = new FileOutputStream("packRecord.txt");
//            ObjectOutputStream obj = new ObjectOutputStream(fos);
//            obj.close();
        }
    }
}
