/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package User;

/**
 *
 * @author Miko
 */
public class Staff{
    
    private String userName,password;
   
    public Staff(){
        this.userName = "";
        this.password = "";
    }

    public boolean loginCheck(){
        boolean chkStatus = false;
        if (userName.equals("staff")&& password.equals("staff")) {
            chkStatus = true;
            System.out.println(userName);
        }
        return chkStatus;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
