package com.nitish.replaceandmodifystrings;

public class ReplaceSpaceWithSingleSpace {
    public static void main(String[] args) {
        String input = "This   is an   example with   multiple   spaces.";
        
        String output = input.replaceAll("\\s+"," ");

        System.out.println("input with multiple space : " + input);
        System.out.println("output with single space : " + output);

    }
}
