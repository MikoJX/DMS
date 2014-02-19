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
public class Administrator extends Manager{
    
    public Administrator(){}
    @Override
    public boolean loginCheck(){
        boolean chkStatus = false;
        if (getUserName().equals("admin")&& getPassword().equals("admin")) {
            chkStatus = true;
            System.out.println(getUserName());
        }
        return chkStatus;
    }
}
