package org.lowleveldesign.DecoratorPattern.Decorator;

import org.lowleveldesign.DecoratorPattern.BasePizza;

public class Olives extends ToppingDecorator {

    BasePizza pizza;

    public Olives(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }

}
