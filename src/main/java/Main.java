/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int length= input.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width= input.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);

        int area= length*width;
        double m2 = area * 0.09290304;

        System.out.printf("The area is %d square feet%n", area);

        System.out.println(m2 + " square meters");

    }
}
