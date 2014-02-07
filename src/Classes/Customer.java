/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
/**
 *
 * @author Miko
 */
public class Customer implements java.io.Serializable {
    private int custIC;
    private String custName,shipperName,shipperAdd;
    public Package packageObj= new Package();
    
    public Customer(){
        this.custIC = 0;
        this.custName = "empty";
        this.shipperName = "empty";
        this.shipperAdd = "empty";
    }
    
    public Customer(int custIC, String custName, String shipperName, String shipperAdd,int Pno) {
        this.custIC = custIC;
        this.custName = custName;
        this.shipperName = shipperName;
        this.shipperAdd = shipperAdd;
        this.packageObj.setpackageNo(Pno);
    }
     
    public int getcustIC() {
        return custIC;
    }

    public void setcustIC(int custIC) {
        this.custIC = custIC;
    }

    public String getcustName() {
        return custName;
    }

    public void setcustName(String custName) {
        this.custName = custName;
    }

    public String getshipperName() {
        return shipperName;
    }

    public void setshipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getshipperAdd() {
        return shipperAdd;
    }

    public void setshipperAdd(String shipperAdd) {
        this.shipperAdd = shipperAdd;
    }
    
}
