/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.Serializable;

/**
 *
 * @author MarcLeo
 */
public class Student implements Serializable{
    private String studentNumber;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private Course course;
    private int yearLevel;
    private String crushName;
    private Course faveSubject;
    
    public Student() {
        
    }
    
    public Student(String studentNumber, String firstName, char middleInitial, String lastName, Course course, int yearLevel, String crushName, Course faveSubject) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.crushName = crushName;
        this.faveSubject = faveSubject;
    }
    
    public String getStudentNumber() {
        return studentNumber;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
    
    public char getMiddleInitial() {
        return middleInitial;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    
    public int getYearLevel() {
        return yearLevel;
    }
    
    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }
    
    public String getCrushName() {
        return crushName;
    }
    
    public void setFaveSubject(Course faveSubject) {
        this.faveSubject = faveSubject;
    }
    
    public String toString() {
        return "Student Number: " + studentNumber +
               "\nName: " + firstName + " " + middleInitial + " " + lastName +
               "\nProgram: " + course +
               "\nYear Level: " + yearLevel +
               "\nCrush Name: " + crushName +
               "\nFavourite Subject: " + faveSubject;
    }
}
