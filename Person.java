/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Date;

/**
 *
 * @author Qasim Ejaz
 */
public class Person {
    private String name;
    private String id;
    private String password;
    private int age;
    private String address;
    private int phoneNo;
    private Date dob;
    
    public Person(){
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
    
        this.name = name;
    }
    
    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public Date getDob(){
        return dob;
    }
    
    public void setDob(Date dob){
        this.dob = dob;
    }
    
    public int getNumber(){
        return phoneNo;
    }
    
    public void setNumber(int no){
        this.phoneNo = no;
    }
}
