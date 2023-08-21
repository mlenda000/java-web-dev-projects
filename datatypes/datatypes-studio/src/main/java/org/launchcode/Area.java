package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
        double radius =0; //= input.nextDouble();
        System.out.println("Enter a radius: ");
                if (input.hasNextDouble()) {
                    radius = input.nextDouble();
                    while (radius <= 0) {
                        System.out.println("The number entered can not be less than or equal to Zero.");
                        System.out.println("Enter a radius: ");
                        radius = input.nextDouble();
                    }
                } else {
                    System.out.println("This is not a valid input! Please enter a number.");
                }

            double areaFunction = Circle.getArea(radius);
            System.out.println("The area of a circle with a radius of " + radius + " is: " + areaFunction);
//        double pi = 3.14;
//        double area = pi * userInput * userInput;
        input.close();

    }
}
