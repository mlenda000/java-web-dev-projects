package org.launchcode;

public interface OpticalDisc {
    void spinDisc();

    default String destroyMicrowave(){
        return "Disc sparked pretty colors and is now destroyed!";
    }

    void readData();
}
