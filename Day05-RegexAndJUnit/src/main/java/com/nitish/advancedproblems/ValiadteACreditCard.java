package com.nitish.advancedproblems;

public class ValiadteACreditCard {
    public static boolean isValidVisa(String cardNumber){
        return cardNumber.matches("^4\\d{15}$");
    }
    public static boolean isValidMasterCard(String cardNumber){
        return cardNumber.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {

        String  VisaNumber = "4123456789012345";
        String masterCard = "5123456789012345";
        String invalidCard = "6123456789012345";

        System.out.println("Visa card details : " + isValidVisa(VisaNumber));
        System.out.println("Is valid master Card : " + isValidMasterCard(masterCard));
        System.out.println("is invaild card details :" + isValidVisa(invalidCard));

    }
}
