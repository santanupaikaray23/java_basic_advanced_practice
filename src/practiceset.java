package com.company;
import java.util.Scanner;

public class practiceset {
    public static void main(String[] args){
        //Question 1:
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark in physics");
        m1 = sc.nextByte();
        System.out.println("Enter your mark in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your mark in Mathematics");
        m3 = sc.nextByte();
     float avg  = (m1+m2+m3)/3.0f;
     if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
         System.out.println("Congratutain, You have been Promoted");
     }
    }
}
