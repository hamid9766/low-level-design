package org.lowleveldesign.AbstractFactory;

public abstract class PhoneStore {

    public Phone orderPhone(String modelName){
        Phone phone;
        phone = createPhone(modelName);
        phone.buildPhone();
        return phone;
    }
    public abstract Phone createPhone(String modelName);
}
