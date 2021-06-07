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
public abstract class Person {
    private String id;
    private String name;
    private String Address;
    private String Phone;
    private int age;
    private String Sex;
    public Person(){}
    
    public Person(String id, String name, String Address, String Phone, int age, String Sex) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.Phone = Phone;
        this.age = age;
        this.Sex = Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }
    
    public abstract void Signup();
    
    public abstract void Login();
}
