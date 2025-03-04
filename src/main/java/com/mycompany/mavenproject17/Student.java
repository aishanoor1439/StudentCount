package com.mycompany.mavenproject17;

//Class Definition
public class Student {
//    Attributes

    String name = "Sana";
    private static String university = "Bahria";
    private static int semester = 2;
    private static int totStudents = 0;

//  Methods
//  Constructors
    Student(String name) {
        this.name = name;
        totStudents++;
    }
    
    void display(){
        System.out.println("Name: " + name);
    }
    
    static void displayStatic(){
        System.out.println("Semester:" + semester);
        System.out.println("University:" + university);
        System.out.println("Total Students:" + totStudents);
    }
    
    static void changeSemester(){
        semester = 3;
    }

}
