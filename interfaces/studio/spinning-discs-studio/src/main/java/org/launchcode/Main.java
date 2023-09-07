package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
            BaseDisc cd = new CD("Linkin Park","music");
            BaseDisc dvd = new DVD("Jurassic Park", "movie");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        ((CD) cd).spinDisc();
        cd.storeData();
        cd.writeData();
        ((CD) cd).readData();


        ((DVD) dvd).spinDisc();
        dvd.storeData();
        dvd.writeData();
        ((DVD) dvd).spinDisc();

        System.out.println(((DVD) dvd).destroyMicrowave());


    }
}