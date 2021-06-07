/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.util.*;
/**
 *
 * @author Zaka
 */
public class Patient extends Person {
    private String desease;

    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }

    public Patient(String desease) {
        this.desease = desease;
    }

    public Patient(String desease, String id, String name, String Address, String Phone, int age, String Sex) {
        super(id, name, Address, Phone, age, Sex);
        this.desease = desease;
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
    System.out.println("Enter Patient Id");
    id = input.nextLine();
    System.out.println("Enter Patient Name");
    name = input.nextLine();
    System.out.println("Enter Patient Address");
    Address = input.nextLine();
    System.out.println("Enter Patient Phone");
    Phone = input.nextLine();
    System.out.println("Age");
    age = in.nextInt();
    System.out.println("Enter Patient Sex");
    Sex = input.nextLine();
    System.out.println("Enter Patient Disease");
    disease = input.nextLine();
    dbConnectivity db = new dbConnectivity();
    
    int ret = db.insertPatient(id, name, Address, Phone, age, Sex, disease);
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
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Login Id for Patient");
    user_id = input.nextLine();
    Pass = input.nextLine();
    
    dbConnectivity db = new dbConnectivity();
    int ret = db.LoginPatient(user_id, Pass);
    int input1;
    if(ret == 1)
    {
        System.out.println("1.See List of Doctors\n2.Book an Appointment\n3.See All Appointements\n4.Check Report Result");
        input1=input.nextInt();
        if(input1==1)
        {
            db.ListOfDoctors();
        }
        
        else if (input1==2) 
        {
            //Book an Appointment
            String pid = ""; 
            String did= ""; 
            String aid= "";
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Patient Id");
            pid = input.next();
            System.out.println("Enter Doctor Id");
            did = input.next();
            System.out.println("Enter Appointment Id");
            aid = input.next();
            db.BookAppointment(pid, did, aid);
        }
        else if (input1==3)
        {
            db.SeeAppointments(user_id);
        }
        else if (input1==4)
        {
            db.ViewReport(user_id);
        }
    }
    }
    Patient(){}
    
}
