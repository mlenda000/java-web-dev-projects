package org.launchcode;

public abstract class BaseDisc {

    private String name;
    private String contents;

    public BaseDisc(String name, String contents) {
        this.name = name;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

//    public void spinDisc(){
//    }

    public void writeData(){

    }

    public void storeData(){

    };
//    public void readData(){}



}
