package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "SANTANU";
//int value = name.length();
//System.out.println(value);
//String lstring = name.toLowerCase();
//System.out.println(lstring);

//String ustring = name.toUpperCase();
//System.out.println(name.substring(1,5));
//System.out.println(name.startsWith("SAn"));
// System.out.println(name.charAt(2));
        String modifiedName = "Santanu";
        System.out.println(name.indexOf("S"));
        System.out.println(modifiedName.indexOf("Sant",4));
        System.out.println(modifiedName.lastIndexOf("t"));
        System.out.println(name.equals("SANTANu"));
        System.out.println("I am escape sequence \" double quote");
    }
}