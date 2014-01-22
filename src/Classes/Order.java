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
public class Order implements java.io.Serializable{
    private double Amount,Weight;
    public Customer CustObj=new Customer();
    private int OrderNo;
    private String OStatus,CName,CAdd;

    public Order(){
        this.Amount = 0;
        this.OrderNo = 0;
        this.Weight = 0;
        this.OStatus = "pending";
        this.CName = "empty";
        this.CAdd = "empty";
    }
    
    public Order(double Amount, int IC, int OrderNo, double Weight, String custName,String SName,String SAdd,String CName, String CAdd) {
        this.Amount = Amount;
        this.OrderNo = OrderNo;
        this.Weight = Weight;
        this.OStatus = "pending";
        this.CName = CName;
        this.CAdd = CAdd;
        this.CustObj.setCustIC(IC);
        this.CustObj.setCustName(custName);
        this.CustObj.setShipperName(SName);
        this.CustObj.setShipperAdd(SAdd); 
    }
    
    public double getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getOStatus() {
        return OStatus;
    }

    public void setOrderStatus(String OStatus) {
        this.OStatus = OStatus;
    }

    public String getCName() {
        return CName;
    }

    public void setCame(String CName) {
        this.CName = CName;
    }

    public String getCAdd() {
        return CAdd;
    }

    public void setCAdd(String CAdd) {
        this.CAdd = CAdd;
    }
    
    
    
    
}
