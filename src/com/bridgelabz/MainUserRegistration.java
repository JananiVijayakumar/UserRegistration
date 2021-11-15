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
        System.out.println("-----------------------------------");
        userRegistration.checkPasswordHaveOneUpperCase();
        System.out.println("-----------------------------------");
        userRegistration.checkPasswordHaveOneNumericValue();
        System.out.println("-----------------------------------");
        userRegistration.checkPasswordHaveOneSpecialCharacter();
        System.out.println("-----------------------------------");
        userRegistration.checkTheEmailIsCorrect("abc@yahoo.com");
        userRegistration.checkTheEmailIsCorrect("abc-100@yahoo.com");
        userRegistration.checkTheEmailIsCorrect("abc.100@yahoo.com");
        userRegistration.checkTheEmailIsCorrect("abc111@abc.com");
        userRegistration.checkTheEmailIsCorrect("abc-100@abc.net");
        userRegistration.checkTheEmailIsCorrect("abc.100@abc.com.au");
        userRegistration.checkTheEmailIsCorrect("abc@1.com");
        userRegistration.checkTheEmailIsCorrect("abc@gmail.com.com");
        userRegistration.checkTheEmailIsCorrect("abc+100@gmail.com.com");
    }
}
