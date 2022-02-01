package org.launchcode.studio7;

import java.util.ArrayList;

public interface OpticalDisc {

    String spinDisc();

    ArrayList<String> readData();

    void writeData(String newData);

    void eraseData(String oldData);

}
