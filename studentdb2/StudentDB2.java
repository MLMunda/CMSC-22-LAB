/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author MarcLeo
 */
import java.io.*;
import java.util.*;

public class StudentDB2 {
    static List<Student> studentDirectory = new ArrayList();

    static Scanner sc = new Scanner(System.in);  
    static Scanner sc2 = new Scanner(System.in);
    
    private static final String FILE_NAME = "list.txt";
    
    public static void menu() {
        System.out.println("Choose your action: \n"
                + "1. Register\n"
                + "2. Get Info\n"
                + "3. Delete a student\n"
                + "4. Edit\n"
                + "5. Exit\n");
        switch(sc.nextInt()) {
            case 1: register();
                    break;
            case 2: getInfo();
                    break;
            case 3: delete();
                    break;
            case 4: edit();
                    break;
            default: //donothing
        }
    }
    
    public static int finder(String studentNumber) {
        for(Student stud: studentDirectory) {
            if(stud.getStudentNumber().equals(studentNumber)) {
                return studentDirectory.indexOf(stud);
            }
        }
        return -1;
    }
    
    public static void register() {
        String studentNumber = "";
        String firstName;
        char middleInitial;
        String lastName;
        Course course;
        int yearLevel;
        String crushName;
        Course faveSubject;
        String courseCode1;
        String courseDescription1;
        String courseCode2;
        String courseDescription2;
        
        Student b;
        String tempSN;
        
        System.out.println("Input Student Number: ");
        tempSN = sc.next();
        if(finder(tempSN) == -1) {
            studentNumber = tempSN;
        } else {
            System.out.println("Student number is already taken!");
            register();
        }
        System.out.println("Input First Name: ");
        firstName = sc2.nextLine();
        System.out.println("Input Middle Initial: ");
        middleInitial = sc.next().charAt(0);
        System.out.println("Input Last Name: ");
        lastName = sc2.nextLine();
        System.out.println("Input Course: "
                + "\nInput Course Code: ");
        courseCode1 = sc2.nextLine();
        System.out.println("Input Course Description: ");
        courseDescription1 = sc2.nextLine();
        System.out.println("Input Year Level: ");
        yearLevel = sc.nextInt();
        System.out.println("Input Crush Name: ");
        crushName = sc2.nextLine();
        System.out.println("Input Favourite Subject: "
                + "\nInput Course Code: ");
        courseCode2 = sc2.nextLine();
        System.out.println("Input Course Description: ");
        courseDescription2 = sc2.nextLine();
        
        course = new Course(courseCode1, courseDescription1);
        faveSubject = new Course(courseCode2, courseDescription2);
        
            
        b = new Student(studentNumber, firstName, middleInitial, lastName, course, yearLevel, crushName, faveSubject);
        studentDirectory.add(b);
        System.out.println("Student Added!!!");
        menu();
        
    }
    
    public static void getInfo() {
        System.out.println("Enter Student Number: ");
        String tempSN = sc.next();
        if(finder(tempSN) == -1) {
            System.out.println("Student number not found!");
        } else {
            System.out.println(studentDirectory.get(finder(tempSN)));
        }
        menu();
    }
    
    public static void delete() {
        System.out.println("Enter Student Number: ");
        String tempSN = sc.next();
        if(finder(tempSN) == -1) {
            System.out.println("Student number not found!");
        } else {
            studentDirectory.remove(finder(tempSN));
            System.out.println("Student " + tempSN + " deleted!");
        }
        menu();
    }
    
    public static void edit() {
        System.out.println("Enter Student Number: ");
        String tempSN = sc.next();
        if(finder(tempSN) == -1) {
            System.out.println("Student number not found!");
        } else {
            mainEdit(finder(tempSN));
        }
        menu();
    }
    
    public static void mainEdit(int index) {
        System.out.println("Which would you like to edit?"
                + "\n1. First Name"
                + "\n2. Middle Initial"
                + "\n3. Last Name"
                + "\n4. Program"
                + "\n5. Year Level"
                + "\n6. Crush Name"
                + "\n7. Favourite Subject");
        switch(sc.nextInt()) {
            case 1: System.out.println("Input first name: ");
                    studentDirectory.get(index).setFirstName(sc2.nextLine());
                    System.out.println("First name edited!");
                    break;
            case 2: System.out.println("Input middle initial: ");
                    studentDirectory.get(index).setMiddleInitial(sc.next().charAt(0));
                    System.out.println("Middle Initial edited!");
                    break;
            case 3: System.out.println("Input last name: ");
                    studentDirectory.get(index).setLastName(sc2.nextLine());
                    System.out.println("Last name edited!");
                    break;
            case 4: System.out.println("Input program: ");
                    studentDirectory.get(index).getCourse().setCourseCode(sc2.nextLine());
                    System.out.println("Input description: ");
                    studentDirectory.get(index).getCourse().setCourseDescription(sc2.nextLine());
                    System.out.println("Program edited!");
                    break;
            case 5: System.out.println("Input year level: ");
                    studentDirectory.get(index).setYearLevel(sc.nextInt());
                    System.out.println("Year level edited!");
                    break;
            case 6: System.out.println("Input crush name: ");
                    studentDirectory.get(index).setCrushName(sc2.nextLine());
                    System.out.println("Crush name edited!");
                    break;
            case 7: System.out.println("Input favourite subject: ");
                    studentDirectory.get(index).getCourse().setCourseCode(sc2.nextLine());
                    System.out.println("Input description: ");
                    studentDirectory.get(index).getCourse().setCourseDescription(sc2.nextLine());
                    System.out.println("Favourite subject edited!");
                    break;
            default://donothing
        }
        System.out.println("Would you like to edit more?"
                    + "yes or no?");
        if("yes".equals(sc.next())) {
            mainEdit(index);
        }
        else {
            menu();
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            Student a;
            
            fis = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fis);
            
            if(ois.read() != 0) {
                studentDirectory = (List<Student>) ois.readObject();
            }
            
            fis.close();
            ois.close();
        } catch (IOException e) {
        }
        
        menu();
        try {
            
            fos = new FileOutputStream(FILE_NAME);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(studentDirectory);
            fos.close();
            oos.close();
            
        } catch (IOException e) {
        } 
        
        System.out.println("Thank You! Please come again!");    
    }
}

