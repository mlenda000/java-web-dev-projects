package org.launchcode;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuItem chicken = new MenuItem(18.00, "Chicken Pot Pie", "Main Course", true);
        MenuItem turkey = new MenuItem(17.00, "Roast Turkey", "Main Course", false);
        MenuItem fries = new MenuItem(5.00,"Cheesy Fries","Side dishes", true);
        MenuItem burger = new MenuItem(12.00,"Wagyu Burger","Sandwiches", true);
        MenuItem cheeseSteak = new MenuItem(16.00, "Ribeye CheeseSteak", "Sandwiches", false);
        ArrayList<MenuItem> lunch = new ArrayList<>(Arrays.asList(chicken,turkey,fries,burger,cheeseSteak));
        Menu lunchMenu = new Menu(new Date(), lunch);

        MenuItem burrito = new MenuItem(18.00, "Breakfast Burrito", "Main Course", true);
        MenuItem eggs = new MenuItem(17.00, "Eggs and bacon", "Main Course", false);
        MenuItem waffles = new MenuItem(5.00,"Waffles","Main Course", true);
        MenuItem pancakes = new MenuItem(12.00,"Pancakes","Main Course", true);
        MenuItem lox = new MenuItem(16.00, "Lox and Bagel", "Starters", false);
        ArrayList<MenuItem> breakfast = new ArrayList<>(Arrays.asList(burrito,eggs,waffles,pancakes,lox));
        Menu breakfastMenu = new Menu(new Date(), breakfast);

        System.out.println("\nCurrent Items on the Breakfast Menu:");
        Menu.fullMenu(breakfastMenu.getItems());
        System.out.println("\nCurrent Items on the Lunch Menu:");
        Menu.fullMenu(lunchMenu.getItems());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat would you like to eat? ");
        String a = sc.nextLine();
        Menu.singleMenuItem(a, breakfast);

        System.out.println("\nWhat would you like to remove from the Lunch Menu?");
        String b = sc.nextLine();
        Menu.removeItem(b,lunch);
    }


}
