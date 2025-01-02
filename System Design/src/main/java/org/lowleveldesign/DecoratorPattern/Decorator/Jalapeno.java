package org.lowleveldesign.DecoratorPattern.Decorator;

import org.lowleveldesign.DecoratorPattern.BasePizza;

public class Jalapeno extends ToppingDecorator {

    BasePizza pizza;

    public Jalapeno(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
