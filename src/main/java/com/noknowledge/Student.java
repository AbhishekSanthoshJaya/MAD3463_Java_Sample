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

    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private long ageInYears;
    private float[] marks;
    private float totalMarks;
    private float percentage;
    private Gender gender;
    private String result;

    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, float[] marks, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ageInYears = getAge();
        this.marks = marks;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;

    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.ageInYears = getAge();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
    }

    public void printData(){
        System.out.println("Student id: " + studentId);
        System.out.println("First Name " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("BirthDate: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.print("Subject marks are:");
        for(int i =0; i<marks.length; i++){
            System.out.print(" " + marks[i]);
        }
        System.out.println();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Age: " + ageInYears);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Result: " + result);
    }

    private long getAge(){
        long age =  this.birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
        //System.out.println("The student ID is " + this.studentId + " and my age is " + age);
        return age;
    }

    public String getFormattedBirthDate(){
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = formatted.format(this.birthDate);
        System.out.println("Formatted BirthDate is " + formattedDate);
        return formattedDate;
    }

    public void getTotal(float[] marks){
        float total =0;
        for (int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        this.totalMarks = total;
    }

    public void calcPercentage(){
        this.percentage = (this.totalMarks)/ 5f;
    }

    public void calcResult(){
        if(this.percentage > 50)
        this.result = "PASS";
        else
            this.result = "FAIL";
    }
}


