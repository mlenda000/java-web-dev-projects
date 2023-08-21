package org.launchcode;

import java.util.Scanner;

    public class MilesPerGallon {
        public static void main(String[] args){
    double miles;
    double gallons;
    double mpg;
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles driven:");
    miles =input.nextDouble();
        System.out.println("Please enter the gallons used:");
    gallons =input.nextDouble();
    input.close();
    mpg =miles/gallons;

    System.out.println("Your miles per gallon is "+mpg);
}
}
