/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Qasim Ejaz
 */
public class Class {
    private String name;
    private int semester;
    List<Student> students = new ArrayList<Student>();
    List<Course> classCourses = new ArrayList<Course>();
    
    public void addStudent(Student s){
        students.add(s);
    }
    
    private int searchStudent(String number)
    {
        int index = -1;
         for(int i = 0 ; i  < students.size(); i++)
         {
             if(students.get(i).getName().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Student getStudent(String number)
    {
        int index = searchStudent(number);
        return students.get(index);
    }
    
     public boolean updateStudent(String number ,Student s){
       int index = searchStudent(number);
       
       if(index == -1)
           return false;
       else {
           students.set(index, s);
           return true;
       }
    }
    
     
    public boolean deleteStudent(String number){
       int index = searchStudent(number);
       
       if(index == -1)
           return false;
       else {
           students.remove(index);
           return true;
       }
    }
    
    public List<Student> getAllStudents(){
        return students;
    }
}
