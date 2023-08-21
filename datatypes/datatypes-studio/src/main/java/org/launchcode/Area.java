package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius = 0;
            do{
            System.out.println("Enter a radius: ");
            if (input.hasNextDouble() ){
                radius = input.nextDouble();
                if (radius > 0){
                    double areaFunction = Circle.getArea(radius);
                    System.out.println("The area of a circle with a radius of " + radius + " is: " + areaFunction);
                }else{
                    System.out.println("Not a valid number");
                }
            }
            else{
                System.out.println("Not a valid number");
                break;
            }
            }while(radius < 0);
        input.close();
    }
}
