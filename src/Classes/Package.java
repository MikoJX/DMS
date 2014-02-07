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
public class Package implements java.io.Serializable {
    
    private double rate;
    private String title;
    private int packageNo,min,max;

    public Package(){
        this.rate = 0;
        this.title = "empty";
        this.packageNo = 0;
        this.min = 0;
        this.max = 0;
    }
        
    public Package(double rate, String title, int packageNo, int min, int max) {
        this.rate = rate;
        this.title = title;
        this.packageNo = packageNo;
        this.min = min;
        this.max = max;
    }
    
    public double getrate() {
        return rate;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getpackageNo() {
        return packageNo;
    }

    public void setpackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    public int getmin() {
        return min;
    }

    public void setmin(int min) {
        this.min = min;
    }

    public int getmax() {
        return max;
    }

    public void setmax(int max) {
        this.max = max;
    }
}
