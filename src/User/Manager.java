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
public class Manager extends Staff{
    
    public Manager(){}
    @Override
    public boolean loginCheck(){
        boolean chkStatus = false;
            if (getUserName().equals("manager")&& getPassword().equals("manager")) {
            chkStatus = true;
            System.out.println(getUserName());
        }
        return chkStatus;
    }

}
