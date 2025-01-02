package org.lowleveldesign.DecoratorPattern;

import org.lowleveldesign.DecoratorPattern.Decorator.ExtraCheese;
import org.lowleveldesign.DecoratorPattern.Decorator.Jalapeno;
import org.lowleveldesign.DecoratorPattern.Decorator.Olives;

public class TestDecoratorPattern {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new FarmhousePizza());
        BasePizza pizza1 = new Olives(new Jalapeno(new ExtraCheese(new PaneerMakhaniPizza())));

        System.out.println( "Farmhouse Pizza with Extra Cheese :  "  + pizza.cost() +" Rs");
        System.out.println( "Paneer Makhani with Extra toppings :  "  + pizza1.cost() +" Rs");

    }

}
