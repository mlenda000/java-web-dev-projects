package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }
    public static void fullMenu(ArrayList<MenuItem> plate) {
        for (MenuItem item : plate) {
            System.out.println(item.getCategory() + ": $" + item.getPrice() + " " + item.getDescription());
        }
    }
    public static void singleMenuItem(String d, ArrayList<MenuItem> plate){
        for (MenuItem item : plate){
            if (item.getDescription().toLowerCase().contains(d.toLowerCase())){
                System.out.println("\nIs this what you were looking for?");
                System.out.println(item.getCategory() + ": $" + item.getPrice() + " " + item.getDescription());
            }
        }
    }
    public static void removeItem(String d, ArrayList<MenuItem> plate){
        plate.removeIf(item -> item.getDescription().toLowerCase().contains(d.toLowerCase()));
        System.out.println("\nUpdated Lunch Menu:");
        Menu.fullMenu(plate);
    }
}

