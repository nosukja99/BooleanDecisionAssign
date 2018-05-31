package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        char grade = 'F';//I'm not hopeful
        int lastDigit = score%10;
        //System.out.println("last digit"+lastDigit);
        String gradeMark;

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 69)
            grade = 'C';
        else if (score > 59)
            grade = 'D';
        else
            grade = 'F';

        if (lastDigit > 2 && lastDigit < 7)
            gradeMark ="";
        else if (lastDigit > 6)
            gradeMark = "+";
        else
            gradeMark = "-";

        if (score > 59) {
            System.out.println("Your letter grade is " + grade + gradeMark);
            System.out.println("Very good! You don't have to retake the exam!");
        }
        else {
            System.out.println("Your letter grade is " + grade);
            System.out.println("Did you even look at the book?");
        }
    }
}
