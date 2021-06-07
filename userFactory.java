/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/**
 *
 * @author Zaka
 */
public class userFactory {
    
        Person get_user(String user)
        {
            if(user.equalsIgnoreCase(""))
            {
                return null;
            }
    
            if(user.equalsIgnoreCase("Patient"))
            {
                return new Patient();
            }
        
            if(user.equalsIgnoreCase("Nurse"))
            {
                return new Nurse();
            }

            if(user.equalsIgnoreCase("Doctor"))
            {
                return new Doctor();
            }        

            if(user.equalsIgnoreCase("Admin"))
            {
                return new Admin();
            }
        
            return null;
        } 
}
