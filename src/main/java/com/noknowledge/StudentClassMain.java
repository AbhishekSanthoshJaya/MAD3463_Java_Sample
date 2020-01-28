package com.noknowledge;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain {

    public static void main(String[] args) {

        float[] marks1 = new float[]{77,76,77,77,89};
        float[] marks2 = new float[]{15,24,55,12,1};

        //Details of first student
        Student s1 = new Student(1, "Abhishek","Santhosh Jaya", LocalDate.of(1995,04,18), marks1, Gender.MALE);
        s1.getTotal(marks1);
        s1.calcPercentage();
        s1.calcResult();
        s1.printData();

        System.out.println();
        System.out.println("**********************************");
        System.out.println();

        //Details of second student
        Student s2 = new Student(2, "Brandon", "Stark", LocalDate.of(1996,03,12), marks2, Gender.MALE);
        s2.getTotal(marks2);
        s2.calcPercentage();
        s2.calcResult();
        s2.printData();

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.sum
    }
}
