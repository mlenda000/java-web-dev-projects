package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    private String name;
    private static int capacity = 700;
    private String contents;
    private final static String discType = "CD";

    private final static int maxSpin = 500;
    private final static int minSpin = 200;

    private int usedCapacity;
    private int remainingCapacity;

    public CD(String name, String contents) {
        super(name, contents);

    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " +minSpin +" - " +maxSpin+ "rpm.");;
    }

    public void storeData(){
        System.out.println("The CD stores data.");
    }

    public void writeData(){
        System.out.println("The CD can have data written to it.");
    }

    public void readData(){
        System.out.println("The CD can read data.");
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setContents(String contents) {
        this.contents = contents;
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
