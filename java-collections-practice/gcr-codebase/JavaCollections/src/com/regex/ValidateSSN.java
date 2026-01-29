package com.regex;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        String[] tests = {"123-45-6789", "123456789"};

        for(String ssn : tests){
            Matcher matcher = pattern.matcher(ssn);

            if(matcher.matches()){
                System.out.println("\"" + ssn + "\" is valid");
            } else {
                System.out.println("\"" + ssn + "\" is invalid");
            }
        }
    }
}
