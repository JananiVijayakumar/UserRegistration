package com.bridgelabz;
/*
author : JananiVijayaKumar
Date : 13/11/2021
Desc : Check User Registeration
*/
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
    //Create method to check the first is correct
    public static void checkFirstNameIsCorrect() {
        String firstName = "^[a-zA-Z][a-zA-Z ]*$";
        Scanner fn = new Scanner(System.in);
        System.out.println("Enter the FirstName : ");
        firstName = fn.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}+$", firstName);
        if (check)
            System.out.println("FirstName is correct");
        else
            System.out.println("Please Enter a Valid First name\n FirstName should have Start with only one Capital\n");
    }

    //Create method to check the last is correct
    public static void checkLastNameIsCorrect() {
        String lastName = "^[a-zA-Z][a-zA-Z ]*$";
        Scanner ln = new Scanner(System.in);
        System.out.println("Enter the FirstName : ");
        lastName = ln.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}+$", lastName);
        if (check)
            System.out.println("LastName is correct");
        else
            System.out.println("Please Enter a Valid Last name\n LastName should have Start with only one Capital\n");
    }
}