package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    private String name;
    private static final double capacity = 4.7;
    private String contents;
    private static final String discType = "DVD";
    private final static int maxSpin = 1600;
    private final static int minSpin = 570;

    private int usedCapacity;
    private int remainingCapacity;

    public DVD(String name, String contents) {
        super(name, contents);

    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " +minSpin +" - " +maxSpin+ "rpm.");;
    }

    public void storeData(){
        System.out.println("The DVD stores data.");
    }

    public void writeData(){
        System.out.println("The DVD can have data written to it.");
    }

    public void readData(){
        System.out.println("The DVD can read data.");
    }


    public String getName() {
        return name;
    }

    public double getCapacity() {
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
