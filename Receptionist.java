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
public class Receptionist extends Person{

    public Receptionist() {
    }

    public Receptionist(String id, String name, String Address, String Phone, int age, String Sex) {
        super(id, name, Address, Phone, age, Sex);
    }
    
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
    System.out.println("Enter Receptionist Id");
    id = input.nextLine();
    System.out.println("Enter Receptionist Name");
    name = input.nextLine();
    System.out.println("Enter Receptionist Address");
    Address = input.nextLine();
    System.out.println("Enter Receptionist Phone");
    Phone = input.nextLine();
    System.out.println("Age");
    age = in.nextInt();
    System.out.println("Enter Receptionist Sex");
    Sex = input.nextLine();
    dbConnectivity db = new dbConnectivity();
    
    int ret = db.insertReceptionist(id, name, Address, Phone, age, Sex);
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
    System.out.println("Enter Login Id for receptionist");
    user_id = input.nextLine();
    Pass = input.nextLine();
    
    dbConnectivity db = new dbConnectivity();
    db.LoginPatient(user_id, Pass);
    }
}
