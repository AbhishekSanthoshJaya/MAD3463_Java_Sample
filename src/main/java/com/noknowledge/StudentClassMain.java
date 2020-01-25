package com.noknowledge;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        Date d1 = new Date(2020, 1, 24);
        s1.setData(1, "Abhishek", "Santhosh Jaya", LocalDate.of (1995, 04, 18), Gender.MALE, 60);
        s1.printData();
        s1.getAge();
        s1.getFormattedBirthdate();

    }

}
