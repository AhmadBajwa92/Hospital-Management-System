/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
/**
 *
 * @author Zaka
 */
public class HMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       dbConnectivity db = new dbConnectivity();
       userFactory Users = new userFactory();
       
       String username = "NULL";
       Scanner input_user = new Scanner(System.in);
       Person user;
       System.out.println("Welcome To Hospital Management System");
       System.out.println("1.Login\n2.(Don't have an account)Signup");
       int option;
       Scanner in= new Scanner(System.in);
       option = in.nextInt();
       if(option==1)
       {
        System.out.println("Enter Type of User:\n->Doctor\n->Patient\n->Admin");
        username = input_user.nextLine();
        user = Users.get_user(username);
        user.Login();
       }
       
       if(option==2)
       {
           System.out.println("Enter Type of User:\n->Doctor\n->Patient");
           username = input_user.nextLine();
           user = Users.get_user(username);
           user.Signup();
       }
       
    }
    
}
