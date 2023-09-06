package org.launchcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor a : flavors){
            System.out.println(a.getName());
        }
        System.out.print("\n");
        for (Cone a : cones){
            System.out.println(a.getName() + " $" + df.format(a.getCost()));
        }


    }
}