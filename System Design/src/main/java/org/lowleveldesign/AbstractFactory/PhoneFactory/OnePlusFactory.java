package org.lowleveldesign.AbstractFactory.PhoneFactory;

import org.lowleveldesign.AbstractFactory.OnePlus.OnePlus13;
import org.lowleveldesign.AbstractFactory.Phone;
import org.lowleveldesign.AbstractFactory.PhoneStore;

public class OnePlusFactory extends PhoneStore {

    public Phone createPhone(String modelName){
        if (modelName.equals("13")){
            return new OnePlus13();
        }
        else {
            System.out.println("Invalid model: " + modelName);
            return null;
        }
    }

}
