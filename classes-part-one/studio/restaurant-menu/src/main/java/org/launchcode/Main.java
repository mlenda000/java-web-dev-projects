package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuItem chicken = new MenuItem(10.00, "Chicken", "Main Course", true);
        MenuItem turkey = new MenuItem(10.00, "Turkey", "Side Course", true);
        ArrayList<MenuItem> plate = new ArrayList<>(Arrays.asList(chicken,turkey));
        Menu chickenMenu = new Menu(new Date(), plate);

    }
}
