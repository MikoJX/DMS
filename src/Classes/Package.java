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
    
    private double Rate;
    private String Title;
    private int PackageNo,Min,Max;

    public Package(){
        this.Rate = 0;
        this.Title = "empty";
        this.PackageNo = 0;
        this.Min = 0;
        this.Max = 0;
    }
        
    public Package(double Rate, String Title, int PackageNo, int Min, int Max) {
        this.Rate = Rate;
        this.Title = Title;
        this.PackageNo = PackageNo;
        this.Min = Min;
        this.Max = Max;
    }
    
    public double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getPackageNo() {
        return PackageNo;
    }

    public void setPackageNo(int PackageNo) {
        this.PackageNo = PackageNo;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int Min) {
        this.Min = Min;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int Max) {
        this.Max = Max;
    }
}
