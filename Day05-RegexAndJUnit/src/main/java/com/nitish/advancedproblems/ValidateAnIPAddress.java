package com.nitish.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {
    //ipv4 add : 192.0.2.146

    public static void main(String[] args) {
        String regex = "^[0-9]{1,4}+\\.[0-9]{1,4}+\\.[0-9]{1,4}+\\.[0-9]{1,4}";
        String ipAddress = "1954.06.2.146";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        boolean found = false;
        while (matcher.find()){
            System.out.println("Valid IP : " + matcher.group());
            found = true;
        }
        if(!found){
            System.out.println("Invalid IP");
        }
    }

}
