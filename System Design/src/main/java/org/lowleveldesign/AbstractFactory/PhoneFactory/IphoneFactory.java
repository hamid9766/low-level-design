package org.lowleveldesign.AbstractFactory.PhoneFactory;

import org.lowleveldesign.AbstractFactory.IPhone.Iphone15Pro;
import org.lowleveldesign.AbstractFactory.IPhone.Iphone16;
import org.lowleveldesign.AbstractFactory.IPhone.Iphone16Plus;
import org.lowleveldesign.AbstractFactory.Phone;
import org.lowleveldesign.AbstractFactory.PhoneStore;

public class IphoneFactory extends PhoneStore {

    public Phone createPhone(String modelName){
        if (modelName.equals("15 Pro")){
            return new Iphone15Pro();
        }
        else if (modelName.equals("16")) {
            return new Iphone16();
        }
        else if (modelName.equals("16 Plus")){
            return new Iphone16Plus();
        }
        else {
            System.out.println("Invalid model: " + modelName);
            return null;
        }

    }
}
