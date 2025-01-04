package org.lowleveldesign.AbstractFactory.PhoneFactory;

import org.lowleveldesign.AbstractFactory.Phone;
import org.lowleveldesign.AbstractFactory.PhoneStore;
import org.lowleveldesign.AbstractFactory.Samsung.SamsungS24;

public class SamsungFactory extends PhoneStore {

    public Phone createPhone(String modelName){
        if (modelName.equals("S24 Ultra")){
            return new SamsungS24();
        }
        else {
            System.out.println("Invalid model: " + modelName);
            return null;
        }
    }
}
