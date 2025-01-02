package org.lowleveldesign.DecoratorPattern.Decorator;

import org.lowleveldesign.DecoratorPattern.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
