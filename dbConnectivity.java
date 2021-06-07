/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.sql.ResultSet;
import java.util.Scanner;


/**
 *
 * @author Farwa
 */
public class dbConnectivity 
{
    Connection con;
    Statement stmt;
    
    dbConnectivity() //cons
    {
        try
        {
             String s = "jdbc:mysql://localhost:3306/hms?characterEncoding=latin1&useConfigs=maxPerformance";
             con=DriverManager.getConnection(s,"root","123456");


            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAll()
    {
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from login");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public int insertPatient(String Patient_id , String patient_name, String patient_address, String patient_phone, int patient_age  , String patient_sex , String patient_disease)
    {
        try{
            String query = " insert into Patient (Patient_id, patient_name ,patient_address, patient_phone, patient_age, patient_sex, patient_disease)"
        + " values (?,?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, Patient_id);
      preparedStmt.setString (2, patient_name);
      preparedStmt.setString (3, patient_address);
      preparedStmt.setString (4, patient_phone);
      preparedStmt.setInt (5, patient_age);
      preparedStmt.setString (6, patient_sex);
      preparedStmt.setString (7, patient_disease);
      
            // execute the preparedstatement
            preparedStmt.execute();
        }
        catch(Exception e){
        System.out.println(e);
        }
      String Password;
      String Confirm;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Password to Create Account");
      Password = input.nextLine();
      System.out.println("Confirm Password");
      Confirm = input.nextLine();
      
      
      while(!Password.equals(Confirm))
      {
        System.out.println("Enter Password to Create Account");
        Password = input.nextLine();
        System.out.println("Confirm Password");
        Confirm = input.nextLine();
      }
      
      
      
      String queryLogin = "insert into Patientlogin (user_id , Password)"+ "values (?,?)";
      
      if(Password.equals(Confirm))
      {
          try{
          PreparedStatement ps = con.prepareStatement(queryLogin);
          ps.setString(1, Patient_id);
          ps.setString(2, Password);
          ps.execute();
          return 1;
          }
          catch (Exception e){
          System.out.println(e);
          }
      }
      return 0;
          

        }
    
    public int insertDoctor(String doctor_id , String doctor_name, String doctor_address, String doctor_phone, int doctor_age  , String doctor_sex , String specialization)
    {
        try{
            String query = " insert into Doctor (doctor_id, doctor_name ,doctor_address, doctor_phone, doctor_age, doctor_sex, specialization)"
        + " values (?,?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, doctor_id);
      preparedStmt.setString (2, doctor_name);
      preparedStmt.setString (3, doctor_address);
      preparedStmt.setString (4, doctor_phone);
      preparedStmt.setInt (5, doctor_age);
      preparedStmt.setString (6, doctor_sex);
      preparedStmt.setString (7, specialization);


      // execute the preparedstatement
      preparedStmt.execute();
            }
        catch(Exception e){
        System.out.println(e);
        }
        
         String Password;
      String Confirm;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Password to Create Account");
      Password = input.nextLine();
      System.out.println("Confirm Password");
      Confirm = input.nextLine();
      
      
      while(!Password.equals(Confirm))
      {
        System.out.println("Enter Password to Create Account");
        Password = input.nextLine();
        System.out.println("Confirm Password");
        Confirm = input.nextLine();
      }
      
      
      
      String queryLogin = "insert into doctorlogin (user_id , Password)"+ "values (?,?)";
      
      if(Password.equals(Confirm))
      {
          try{
          PreparedStatement ps = con.prepareStatement(queryLogin);
          ps.setString(1, doctor_id);
          ps.setString(2, Password);
          ps.execute();
          return 1;
          }
          catch (Exception e){
          System.out.println(e);
          }
      }
      return 0;
    }
   

    
    public int insertNurse(String nurse_id , String nurse_name, String nurse_address, String nurse_phone, int nurse_age  , String nurse_sex )
    {
        try{
            String query = " insert into Nurse (nurse_id, nurse_name ,nurse_address, nurse_phone, nurse_age, nurse_sex)"
        + " values (?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, nurse_id);
      preparedStmt.setString (2, nurse_name);
      preparedStmt.setString (3, nurse_address);
      preparedStmt.setString (4, nurse_phone);
      preparedStmt.setInt (5, nurse_age);
      preparedStmt.setString (6, nurse_sex);
      


      // execute the preparedstatement
      preparedStmt.execute();
            }
        catch(Exception e){
        System.out.println(e);
        }
        
        String Password;
      String Confirm;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Password to Create Account");
      Password = input.nextLine();
      System.out.println("Confirm Password");
      Confirm = input.nextLine();
      
      
      while(!Password.equals(Confirm))
      {
        System.out.println("Enter Password to Create Account");
        Password = input.nextLine();
        System.out.println("Confirm Password");
        Confirm = input.nextLine();
      }
      
      
      
      String queryLogin = "insert into nurselogin (user_id , Password)"+ "values (?,?)";
      
      if(Password.equals(Confirm))
      {
          try{
          PreparedStatement ps = con.prepareStatement(queryLogin);
          ps.setString(1, nurse_id);
          ps.setString(2, Password);
          ps.execute();
          return 1;
          }
          catch (Exception e){
          System.out.println(e);
          }
      }
        return 0;
    }
    
    
    public int insertAdmin(String admin_id , String admin_name, String admin_address, String admin_phone, int admin_age  , String admin_sex )
    {
        try{
            String query = " insert into Admin (admin_id, admin_name ,admin_address, admin_phone, admin_age, admin_sex)"
        + " values (?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, admin_id);
      preparedStmt.setString (2, admin_name);
      preparedStmt.setString (3, admin_address);
      preparedStmt.setString (4, admin_phone);
      preparedStmt.setInt (5, admin_age);
      preparedStmt.setString (6, admin_sex);
      


      // execute the preparedstatement
      preparedStmt.execute();
            }
        catch(Exception e){
        System.out.println(e);
        }
        
         String Password;
      String Confirm;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Password to Create Account");
      Password = input.nextLine();
      System.out.println("Confirm Password");
      Confirm = input.nextLine();
      
      
      while(!Password.equals(Confirm))
      {
        System.out.println("Enter Password to Create Account");
        Password = input.nextLine();
        System.out.println("Confirm Password");
        Confirm = input.nextLine();
      }
      
      
      
      String queryLogin = "insert into Patientlogin (user_id , Password)"+ "values (?,?)";
      
      if(Password.equals(Confirm))
      {
          try{
          PreparedStatement ps = con.prepareStatement(queryLogin);
          ps.setString(1, admin_id);
          ps.setString(2, Password);
          ps.execute();
          return 1;
          }
          catch (Exception e){
          System.out.println(e);
          }
      }
      return 0;
    }
    
    
    public int insertReceptionist(String receptionist_id , String receptionist_name, String receptionist_address, String receptionist_phone, int receptionist_age  , String receptionist_sex )
    {
        try{
            String query = " insert into Receptionist (receptionist_id, receptionist_name , receptionist_address, receptionist_phone, receptionist_age, receptionist_sex)"
        + " values (?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, receptionist_id);
      preparedStmt.setString (2, receptionist_name);
      preparedStmt.setString (3, receptionist_address);
      preparedStmt.setString (4, receptionist_phone);
      preparedStmt.setInt (5, receptionist_age);
      preparedStmt.setString (6, receptionist_sex);
      


      // execute the preparedstatement
      preparedStmt.execute();
            }
        catch(Exception e){
        System.out.println(e);
        }
        
         String Password;
      String Confirm;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Password to Create Account");
      Password = input.nextLine();
      System.out.println("Confirm Password");
      Confirm = input.nextLine();
      
      
      while(!Password.equals(Confirm))
      {
        System.out.println("Enter Password to Create Account");
        Password = input.nextLine();
        System.out.println("Confirm Password");
        Confirm = input.nextLine();
      }
      
      
      
      String queryLogin = "insert into Patientlogin (user_id , Password)"+ "values (?,?)";
      
      if(Password.equals(Confirm))
      {
          try{
          PreparedStatement ps = con.prepareStatement(queryLogin);
          ps.setString(1, receptionist_id);
          ps.setString(2, Password);
          ps.execute();
          return 1;
          }
          catch (Exception e){
          System.out.println(e);
          }
      }
      return 0;
    }
    
    
    public void BookAppointment(String patient_id , String Doctor_id , String Appointment_id)
    {
        try{
            String query = " insert into appointment (appointment_id, patient_id , doctor_id)"
        + " values (?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, Appointment_id);
      preparedStmt.setString (2, patient_id);
      preparedStmt.setString (3, Doctor_id);
      
      


      // execute the preparedstatement
      preparedStmt.execute();
            }
        catch(Exception e){
        System.out.println(e);
        }
        
    }
    
    
    public int LoginPatient(String user_id , String Password)
    {
        String query = "Select * from patientlogin"; 
        String Local_userid = new String();
        String Local_Password = new String();
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             Local_userid=rs.getString("user_id");
             Local_Password=rs.getString("Password");
             if (user_id.equalsIgnoreCase(Local_userid) && Password.equalsIgnoreCase(Local_Password))
             {
                 System.out.println("Login successful");
                 return 1;
             }
            
        }
        System.out.println("Userid or Password is incorrect or doesnot exist");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    
    public int LoginAdmin(String user_id , String Password)
    {
        String query = "Select * from adminLogin"; 
        String Local_userid = new String();
        String Local_Password = new String();
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             Local_userid=rs.getString("user_id");
             Local_Password=rs.getString("Password");
             if (user_id.equalsIgnoreCase(Local_userid) && Password.equalsIgnoreCase(Local_Password))
             {
                 System.out.println("Login successful");
                 return 1;
             }
            
        }
        System.out.println("Userid or Password is incorrect or doesnot exist");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    public void insertReport(String Patient_id,String Doctor_id,String report)
    {
        try{
            String query = " insert into Report (result, patient_id,doctor_id)" + " values (?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, report);
      preparedStmt.setString (2, Patient_id);
      preparedStmt.setString (3, Doctor_id);

            // execute the preparedstatement
            preparedStmt.execute();
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
    public void ViewReport(String user_id){
        String query = "Select * from report"; 
        String patient_id = new String();
        String doctor_id = new String();
        String report=new String();
        
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             patient_id=rs.getString("patient_id");
             doctor_id=rs.getString("doctor_id");
             report=rs.getString("result");
             if (user_id.equalsIgnoreCase(patient_id) )
             {
                 System.out.println("Doctor: "+doctor_id);
                 System.out.println("Patient: "+patient_id);
                 System.out.println("Report: "+report);
                
             }
            
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public void ListOfDoctors()
    {
        String query = "Select * from doctor"; 
        String Local_userid = new String();
        String Local_Password = new String();
        String Local_Address=new String();
        String Local_Name = new String();
        String Local_Specialization = new String();
        String sex=new String();
        String phone = new String ();
        int age;
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            Local_userid=rs.getString("doctor_id");
            Local_Name = rs.getString("doctor_name");
            Local_Address=rs.getString("doctor_address");
            Local_Specialization = rs.getString("Specialization");
            sex=rs.getString("doctor_sex");
            age=rs.getInt("doctor_age");
            phone=rs.getString("doctor_phone");

            System.out.println("Doctor ID: "+Local_userid);
            System.out.println("Name: "+Local_Name);
            System.out.println("Address: "+Local_Address);
            System.out.println("Specialization: "+Local_Specialization);
            System.out.println("Gender: "+sex);
            System.out.println("Age: "+age);
            System.out.println("Phone: "+phone);
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public int LoginNurse(String user_id , String Password)
    {
        String query = "Select * from nurseLogin"; 
        String Local_userid = new String();
        String Local_Password = new String();
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             Local_userid=rs.getString("user_id");
             Local_Password=rs.getString("Password");
             if (user_id.equalsIgnoreCase(Local_userid) && Password.equalsIgnoreCase(Local_Password))
             {
                 System.out.println("Login successful");
                 return 1;
             }
            
        }
        System.out.println("Userid or Password is incorrect or doesnot exist");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    
    
    
    public void SeeAppointments(String user_id)
    {
        String query = "Select * from Appointment";     
        String Patient_id, Apointment_id, Doctor_id; 
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                 Patient_id=rs.getString("patient_id");
                 Apointment_id=rs.getString("appointment_id");
                 Doctor_id=rs.getString("doctor_id");
                if (user_id.equalsIgnoreCase(Patient_id) )
                {
                System.out.println("Patient ID: "+Patient_id);
                System.out.println("Appointment ID: "+Apointment_id);
                System.out.println("Doctor ID: "+Doctor_id);

            }}
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
     public void SeeAppointments1(String user_id)
    {
        String query = "Select * from Appointment";     
        String Patient_id, Apointment_id, Doctor_id; 
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                 Patient_id=rs.getString("patient_id");
                 Apointment_id=rs.getString("appointment_id");
                 Doctor_id=rs.getString("doctor_id");
                if (user_id.equalsIgnoreCase(Doctor_id) )
                {
                System.out.println("Patient ID: "+Patient_id);
                System.out.println("Appointment ID: "+Apointment_id);
                System.out.println("Doctor ID: "+Doctor_id);

            }}
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
     
     public void RemovePatient(String user_id)
    {
        try{
       String query = "delete from patient where patient_id=?"; 
     
        PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, user_id);

      // execute the preparedstatement
      preparedStmt.execute();
      
     
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }
     public void RemoveDoctor(String user_id)
    {
        try{
       String query = "delete from doctor where doctor_id=?"; 
     
        PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, user_id);

      // execute the preparedstatement
      preparedStmt.execute();
      
     
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }
     
    public void CacelAppointment(String App_id)
    {
        try{
       String query = "delete from appointment where Appointment_id=?"; 
     
        PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, App_id);

      // execute the preparedstatement
      preparedStmt.execute();
      
     
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }
    
    public int LoginReceptionist(String user_id , String Password)
    {
        String query = "Select * from receptionistLogin"; 
        String Local_userid = new String();
        String Local_Password = new String();
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             Local_userid=rs.getString("user_id");
             Local_Password=rs.getString("Password");
             if (user_id.equalsIgnoreCase(Local_userid) && Password.equalsIgnoreCase(Local_Password))
             {
                 System.out.println("Login successful");
                 return 1;
             }
            
        }
        System.out.println("Userid or Password is incorrect or doesnot exist");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    
    public int LoginDoctor(String user_id , String Password)
    {
        String query = "Select * from doctorLogin"; 
        String Local_userid = new String();
        String Local_Password = new String();
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             Local_userid=rs.getString("user_id");
             Local_Password=rs.getString("Password");
             if (user_id.equalsIgnoreCase(Local_userid) && Password.equalsIgnoreCase(Local_Password))
             {
                 System.out.println("Login successful");
                 return 1;
             }
            
        }
        System.out.println("Userid or Password is incorrect or doesnot exist");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    }
    

