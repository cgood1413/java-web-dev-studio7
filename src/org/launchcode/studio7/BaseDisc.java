package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {

    private String title;
    private final int spinSpeedRpm;
    private final int storageCapacityMb;
    private ArrayList<String> contents;
    String discType;

    public BaseDisc(String title, int spinSpeedRpm, int storageCapacityGb, ArrayList<String> contents){
        this.title = title;
        this.spinSpeedRpm = spinSpeedRpm;
        this.storageCapacityMb = storageCapacityGb;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public int getSpinSpeedRpm() {
        return spinSpeedRpm;
    }

    public int getStorageCapacityGb() {
        return storageCapacityMb;
    }

    public String getDiscType() {
        return discType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String spinDisc() {
        return "A " + this.getDiscType() + " spins at a rate of " + this.getSpinSpeedRpm() + " rpm.";
    }

    @Override
    public ArrayList<String> readData() {
        return this.contents;
    }

    @Override
    public void writeData(String newData) {
        this.contents.add(newData);
    }

    @Override
    public void eraseData(String oldData) {
        this.contents.add(oldData);
    }

}
