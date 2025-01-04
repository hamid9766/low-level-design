package org.lowleveldesign.AbstractFactory;

public abstract class Phone {
    protected String phone;
    protected String model;
    protected String storage;
    protected int price;

    public void buildPhone(){
        System.out.println("Building Phone : " + phone);
        System.out.println("Model : " + model);
        System.out.println("Storage : " + storage);
        System.out.println("Price : " + price);
    }
}
