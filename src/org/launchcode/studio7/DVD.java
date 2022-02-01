package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc {


    public DVD(String title, int spinSpeedRpm, int storageCapacityGb, ArrayList<String> contents) {
        super(title, spinSpeedRpm, storageCapacityGb, contents);
        this.discType = "DVD";
    }

//    @Override
//    public String spinDisc() {
//        return "A " + this.getDiscType() + " spins at a rate of " + this.getSpinSpeedRpm() + " rpm.";
//    }
//
//    @Override
//    public ArrayList<String> readData() {
//        return this.contents;
//    }
//
//    @Override
//    public void writeData(String newData) {
//        this.contents.add(newData);
//    }
//
//    @Override
//    public void eraseData(String oldData) {
//        this.contents.add(oldData);
//    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
