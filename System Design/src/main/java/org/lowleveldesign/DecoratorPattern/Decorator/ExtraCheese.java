package org.lowleveldesign.DecoratorPattern.Decorator;

import org.lowleveldesign.DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 45;
    }
}
