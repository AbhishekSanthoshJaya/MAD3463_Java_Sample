package com.noknowledge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

enum Gender
{
    MALE,
    FEMALE,
    OTHER
}
public class Student {


    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId,
            String firstName,
            String lastName,
            LocalDate birthDate,
            Gender gender,
            float totalMarks){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }

    public void printData(){
        System.out.println("Student id: " + studentId);
        System.out.println("First Name " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Total Marks: " + totalMarks);
    }

    public void getAge(){
        long age =  this.birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
        System.out.println("The student ID is " + this.studentId + " and my age is " + age);
    }

    public void getFormattedBirthdate(){
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = formatted.format(this.birthDate);
        System.out.println("Formatted Birthdate is " + formattedDate);
    }
}


