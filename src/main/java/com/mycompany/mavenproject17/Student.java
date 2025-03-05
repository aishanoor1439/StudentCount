package com.mycompany.mavenproject17;

//Class Definition
public class Student {
    
//    Attributes
    String name;
    private static String university = "Bahria";
    private static int semester = 2;
    private static int rollNo;

//  Methods
//  Constructors
    Student(String name) {
        this.name = name;
        rollNo++;
    }
    
    void display(){
        System.out.println("Name: " + name);
    }
    
    static void displayStatic(){
        System.out.println("Semester:" + semester);
        System.out.println("University:" + university);
        System.out.println("Roll no:" + rollNo);
    }
    
    static void changeSemester(){
        semester = 3;
    }

}
