package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
            BaseDisc cd = new CD("Linkin Park","music");
            BaseDisc dvd = new DVD("Jurassic Park", "movie");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        cd.storeData();
        cd.writeData();
        cd.readData();


        dvd.spinDisc();
        dvd.storeData();
        dvd.writeData();
        dvd.readData();

        System.out.println(OpticalDisc.destroyMicrowave());


    }
}