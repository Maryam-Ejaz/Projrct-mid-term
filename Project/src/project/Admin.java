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
public class Admin extends Person {
    List<Teacher> teachers = new ArrayList<Teacher>();
    List<Student> students = new ArrayList<Student>();
    List<Class> classes = new ArrayList<Class>();
    List<Course> courses = new ArrayList<Course>();
    
    public void addTeacher(Teacher t){
        teachers.add(t);
    }
    
    private int searchTeacher(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < teachers.size(); i++)
         {
             if(teachers.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Teacher getTeacher(String name)
    {
        int index = searchTeacher(name);
        return teachers.get(index);
    }
    
     public boolean updateTeacher(String name ,Teacher t){
       int index = searchTeacher(name);
       
       if(index == -1)
           return false;
       else {
           teachers.set(index, t);
           return true;
       }
    }
    
     
    public boolean deleteTeacher(String name){
       int index = searchTeacher(name);
       
       if(index == -1)
           return false;
       else {
           teachers.remove(index);
           return true;
       }
    }
    
    public List<Teacher> getAllTeachers(){
        return teachers;
    }
    
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
