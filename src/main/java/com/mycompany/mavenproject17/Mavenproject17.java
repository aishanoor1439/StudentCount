/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject17;

/**
 *
 * @author ABC
 */
public class Mavenproject17 {

    public static void main(String[] args) {
        Student s01 = new Student("Aisha Noor");
        s01.display();
        Student.displayStatic();
        Student s02 = new Student("Hafsa Noor");
        Student.changeSemester();
        s02.display();
        Student.displayStatic();
        
    }
}
