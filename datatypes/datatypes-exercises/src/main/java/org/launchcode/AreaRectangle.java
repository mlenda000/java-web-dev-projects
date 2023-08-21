package org.launchcode;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of rectangle:");
        length = input.nextInt();
        System.out.println("Please enter width of rectangle:");
        width = input.nextInt();
        input.close();
        area = length * width;

        System.out.println("The area of the rectangle is "+area);



    }
}