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
public class Doctor extends Person {
    private String Specialization;

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public Doctor(String Specialization) {
        this.Specialization = Specialization;
    }

    public Doctor(String Specialization, String id, String name, String Address, String Phone, int age, String Sex) {
        super(id, name, Address, Phone, age, Sex);
        this.Specialization = Specialization;
    }
    
    public Doctor(){}
     
   @Override
    public void Signup(){
    String Specialization = ""; 
    String id= ""; 
    String name= "";
    String Address= ""; 
    String Phone= ""; 
    int age= 0; 
    String Sex= "";
    Scanner input = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    System.out.println("Enter doctor Id");
    id = input.nextLine();
    System.out.println("Enter doctor Name");
    name = input.nextLine();
    System.out.println("Enter doctor Address");
    Address = input.nextLine();
    System.out.println("Enter doctor Phone");
    Phone = input.nextLine();
    System.out.println("Age");
    age = in.nextInt();
    System.out.println("Enter doctor Sex");
    Sex = input.nextLine();
    System.out.println("Enter doctor Specialization");
    Specialization = input.nextLine();
    dbConnectivity db = new dbConnectivity();
    
    int ret = db.insertDoctor(id, name, Address, Phone, age, Sex, Specialization);
    if(ret == 1)
    {
        System.out.println("Signup Successful");
        
    }
    if(ret == 0){
    System.out.println("Signup Failed");
    }    
    }
    
     @Override
    public void Login(){
    String user_id;
    String Pass;
    String pid;
    String report;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Login Id for doctor");
    user_id = input.nextLine();
    Pass = input.nextLine();
    
    dbConnectivity db = new dbConnectivity();
    int ret=db.LoginDoctor(user_id, Pass);
    int input1;
    if(ret == 1)
    {
        System.out.println("1.See List of Appointments\n2.Cancel Appointment\n3 Add report");
        input1=input.nextInt();
        if(input1==1)
        {
            db.SeeAppointments1(user_id);
        }
        
        else if (input1==2){
            String aid;
            System.out.println("Enter Appointment Id");
            aid = input.next();
            db.CacelAppointment(aid);
        }
        else if (input1==3)
        {
            System.out.println("Enter patient id");
            pid=input.next();
            System.out.println("Enter the report");
            report=input.next();
            db.insertReport(user_id,pid , report);
        }
        else{
            System.out.println("Wrong input");
        }
      
    }
    }
}
