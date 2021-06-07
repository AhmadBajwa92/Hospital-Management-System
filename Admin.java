/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.util.Scanner;

/**
 *
 * @author Zaka
 */
public class Admin extends Person {

    public Admin() {
    }

    public Admin(String id, String name, String Address, String Phone, int age, String Sex) {
        super(id, name, Address, Phone, age, Sex);
    }
    
   @Override
    public void Signup(){
    String disease = ""; 
    String id= ""; 
    String name= "";
    String Address= ""; 
    String Phone= ""; 
    int age= 0; 
    String Sex= "";
    Scanner input = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    System.out.println("Enter admin Id");
    id = input.nextLine();
    System.out.println("Enter admin Name");
    name = input.nextLine();
    System.out.println("Enter admin Address");
    Address = input.nextLine();
    System.out.println("Enter admin Phone");
    Phone = input.nextLine();
    System.out.println("Age");
    age = in.nextInt();
    System.out.println("Enter admin Sex");
    Sex = input.nextLine();
    dbConnectivity db = new dbConnectivity();
    
    
    }
    
    @Override
    public void Login(){
    String user_id;
    int in;
    String patient_id;
    String doctor_id;
    String Pass;
    String pid;
    String report;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Login Id for Admin");
    user_id = input.nextLine();
    Pass = input.nextLine();
    
    dbConnectivity db = new dbConnectivity();
    int ret=db.LoginAdmin(user_id, Pass);
    int input1;
    if(ret == 1)
    {
        System.out.println("1.Remove Account");
        input1=input.nextInt();
        if(input1==1)
        {
            System.out.println("Enter 1 to remove Patient. 2 to remove Doctor.");
            in=input.nextInt();
            if (in==1)
            {
            System.out.println("Enter the patient id you want to remove");
            patient_id=input.next();
            db.RemovePatient(patient_id);
            }
            else if (in==2)
            {
            System.out.println("Enter the patient id you want to remove");
            doctor_id=input.next();
            db.RemoveDoctor(doctor_id);
            }
            
        }
       
        else{
            System.out.println("Wrong input");
        }
      
    }
    
}}
