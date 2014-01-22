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
public class Admin extends Manager{
    protected Package PackageObj;
    
   
    public int SearchID(){
        int ID=0;
        // NOT YET CODE
        
        
        return ID;
    }
    
    public void setPackageRecord(String Title,int Max,int Min,float Rate){
        PackageObj.setPackageNo(SearchID());
        PackageObj.setTitle(Title);
        PackageObj.setMax(Max);
        PackageObj.setMin(Min);
        PackageObj.setRate(Rate);
    }
    
    public void AddNewPackage(String Title,int Max,int Min,float Rate){
        setPackageRecord(Title,Max,Min,Rate);
        //PackageObj.FileIOObj.RetrievePackage();
    }
    
    public void UpdatePackage(String Title,int Max,int Min,float Rate){
        setPackageRecord(Title,Max,Min,Rate);
    }
}
