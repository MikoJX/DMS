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
    private double amount,weight;
    public Customer custObj=new Customer();
    private int orderNo;
    private String oStatus,cName,cAdd;

    public Order(){
        this.amount = 0;
        this.orderNo = 0;
        this.weight = 0;
        this.oStatus = "empty";
        this.cName = "empty";
        this.cAdd = "empty";
    }
    
    public Order(double amount, int IC, int orderNo, double weight, String custName,String SName,String SAdd,String cName, String cAdd,String oStatus) {
        this.amount = amount;
        this.orderNo = orderNo;
        this.weight = weight;
        this.oStatus = oStatus;
        this.cName = cName;
        this.cAdd = cAdd;
        this.custObj.setcustIC(IC);
        this.custObj.setcustName(custName);
        this.custObj.setshipperName(SName);
        this.custObj.setshipperAdd(SAdd); 
    }
    
    public double getamount() {
        return amount;
    }

    public void setamount(float amount) {
        this.amount = amount;
    }

    public int getorderNo() {
        return orderNo;
    }

    public void setorderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setOrderStatus(String oStatus) {
        this.oStatus = oStatus;
    }

    public String getcName() {
        return cName;
    }

    public void setCame(String cName) {
        this.cName = cName;
    }

    public String getcAdd() {
        return cAdd;
    }

    public void setcAdd(String cAdd) {
        this.cAdd = cAdd;
    }
    
    
    
    
}
