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
        System.out.println("Enter the lastName : ");
        lastName = ln.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}+$", lastName);
        if (check)
            System.out.println("LastName is correct");
        else
            System.out.println("Please Enter a Valid Last name\n LastName should have Start with only one Capital\n");
    }

    //check email is correct
    public void checkEmailIsCorrect(){
        Scanner em = new Scanner(System.in);
        System.out.print("Enter Email of User: " );
        String eMailId = "^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*";
        eMailId = em.next();
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMailId);
        if (check)
            System.out.println("Email is correct!!");
        else
            System.out.println("Please Enter a Valid Last name\n EmailId should be like abc@bl.co.in\n");
    }

    //check the mobile number format is correct
    public void checkMobileNumberFormatIsCorrect(){
        Scanner mb = new Scanner(System.in);
        System.out.print("Enter the Mobile number with country code(91): " );
        String mobileNumber = "^91\\s[6789][0-9]{9}";
        mobileNumber = mb.nextLine();
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNumber);
        if (check)
            System.out.println("Mobile Number format is correct");
        else
            System.out.println("Please Enter a Valid Mobile Num\nMobile number format should be 91 9533182605");
    }

    //check the password is minimum 8 character
    public void checkPasswordHave8MinimumCharacter(){
        Scanner pw = new Scanner(System.in);
        System.out.print("Enter password :  ");
        String passWord = "[a-zA-Z]{7,}";
        passWord = pw.nextLine();
        boolean check = Pattern.matches("[a-zA-Z]{7,}", passWord);
        if (check)
            System.out.println("Password is correct");
        else
            System.out.println("Please Enter a Valid password\npassword should have minimum 8 characters");
    }

    public void checkPasswordHaveOneUpperCase(){
        Scanner pw1 = new Scanner(System.in);
        System.out.print("Enter password with one uppercase :  ");
        String passWord = "^[a-z+A-Z]{7,}";
        passWord = pw1.nextLine();
        boolean check = Pattern.matches("^[a-z+A-Z]{7,}", passWord);
        if (check)
            System.out.println("Password is correct");
        else
            System.out.println("Please Enter a Valid password\npassword should have minimum 8 characters\npassword should have one uppercase");
    }

    public void checkPasswordHaveOneNumericValue(){
        Scanner pw2 = new Scanner(System.in);
        System.out.print("Enter password with one Numeric :  ");
        String passWord = "^(?=.*[a-z])"+"(?=.*[A-Z]).{8,}$";
        passWord = pw2.nextLine();
        boolean check = Pattern.matches("^(?=.*[a-z])"+"(?=.*[A-Z]).{8,}$", passWord);
        if (check)
            System.out.println("Password is correct");
        else
            System.out.println("Please Enter a Valid password\npassword should have minimum 8 characters\npassword should have one uppercase\npassword should have one Numeric value");
    }

    public void checkPasswordHaveOneSpecialCharacter(){
        Scanner pw3 = new Scanner(System.in);
        System.out.print("Enter password with one Special Character :  ");
        String passWord = "^(?=.*[a-z])"+"(?=.*[A-Z]).{8,}$";
        passWord = pw3.nextLine();
        boolean check = Pattern.matches("^(?=.*[a-z])"+"(?=.*[!@#$%^&*_+-~;:|/`.=]{1})"+"(?=.*[A-Z]{1}).{8,}$", passWord);
        if (check)
            System.out.println("Password is correct");
        else
            System.out.println("Please Enter a Valid password\npassword should have minimum 8 characters\npassword should have one uppercase\npassword should have one Numeric value\npassword should have one Special character");
    }

    public void checkTheEmailIsCorrect(){
        Scanner email = new Scanner(System.in);
        System.out.print("Enter your EmailID :  ");
        String emailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+.-]+$";
        emailId = email.nextLine();
        boolean check = Pattern.matches("^[a-zA-Z0-9+@#$%^&*';:~`!_.-]+@[a-zA-Z0-9+.-]+.[com]$", emailId);
        if (check)
            System.out.println("EmailId is valid!!");
        else
            System.out.println("Please Enter a Valid EmailId");
    }
}