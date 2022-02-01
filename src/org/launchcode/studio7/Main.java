package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

//      TODO: Declare and initialize a CD and a DVD object.

//      TODO: Call each CD and DVD method to verify that they work as expected.
        CD cd = new CD("CD example", 500, 700, new ArrayList<>(Arrays.asList("Test content")));
        DVD dvd = new DVD("DVD example", 1000, 4700, new ArrayList<>(Arrays.asList("Test content", "Test content 2")));

//      TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cd.spinDisc());
        System.out.println(dvd.spinDisc());

        System.out.println(cd.readData());
        System.out.println(dvd.readData());

        cd.writeData("New test data 1");
        dvd.writeData("New test data 2");

        System.out.println(cd.readData());
        System.out.println(dvd.readData());

    }
}
