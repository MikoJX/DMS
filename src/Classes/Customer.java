/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
import Files.CustomerFileIO;
/**
 *
 * @author Miko
 */
public class Customer implements java.io.Serializable {
    private int CustIC;
    private String CustName,ShipperName,ShipperAdd;
    public CustomerFileIO FileIOObj;  
    public Package PackageObj= new Package();
    
    public Customer(){
        this.CustIC = 0;
        this.CustName = "empty";
        this.ShipperName = "empty";
        this.ShipperAdd = "empty";
    }
    
    public Customer(int CustIC, String CustName, String ShipperName, String ShipperAdd,int Pno) {
        this.CustIC = CustIC;
        this.CustName = CustName;
        this.ShipperName = ShipperName;
        this.ShipperAdd = ShipperAdd;
        this.PackageObj.setPackageNo(Pno);
    }
     
    public int getCustIC() {
        return CustIC;
    }

    public void setCustIC(int CustIC) {
        this.CustIC = CustIC;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    public String getShipperAdd() {
        return ShipperAdd;
    }

    public void setShipperAdd(String ShipperAdd) {
        this.ShipperAdd = ShipperAdd;
    }
    
}
