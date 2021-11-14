package com.bridgelabz;

public class MainUserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.checkFirstNameIsCorrect();
        System.out.println("-----------------------------------");
        userRegistration.checkLastNameIsCorrect();
        System.out.println("-----------------------------------");
        userRegistration.checkEmailIsCorrect();
        System.out.println("-----------------------------------");
        userRegistration.checkMobileNumberFormatIsCorrect();
        System.out.println("-----------------------------------");
        userRegistration.checkPasswordHave8MinimumCharacter();
    }
}
