# Decorator Design Pattern in Java

This repository demonstrates the implementation of the **Decorator Design Pattern** in Java. The Decorator Pattern allows you to dynamically add or modify the behavior of an object without altering its structure. It is a structural design pattern that leverages composition and delegation to achieve this functionality.

---

## Table of Contents
1. [Overview](#overview)
2. [Key Components](#key-components)
3. [How It Works](#how-it-works)
4. [Usage Instructions](#usage-instructions)
5. [When to Use](#when-to-use)
6. [Advantages](#advantages)
7. [Sample Output](#sample-output)
8. [Author](#author)

---

## Overview

The Decorator Pattern enables dynamic extension of object functionality without modifying the object itself. It achieves this by wrapping objects with other objects called decorators. Each decorator adds new behavior or properties while delegating the remaining behavior to the wrapped object.

This repository uses a **Pizza Shop** example:
- **BasePizza** represents the core functionality of a pizza.
- **Toppings** are dynamically added to the pizza using decorators like `ExtraCheese`, `Jalapeno`, and `Olives`.

---

## Key Components

1. **BasePizza**  
   An abstract class that defines the structure of all pizzas.

2. **ConcretePizzas**  
   These are specific implementations of `BasePizza`, such as:
    - `FarmhousePizza`
    - `PaneerMakhaniPizza`

3. **ToppingDecorator**  
   An abstract class that extends `BasePizza` and serves as the base for all topping decorators.

4. **Concrete Topping Decorators**  
   These classes add specific functionalities (toppings) to pizzas:
    - `ExtraCheese`
    - `Jalapeno`
    - `Olives`
    - `Mushroom`

5. **TestDecoratorPattern**  
   A driver class to test the implementation by dynamically adding toppings to various pizzas.

---

## Code Structure

The project is structured as follows:


---

## How It Works

1. **Base Pizza**: Create a base pizza object like `FarmhousePizza`.
2. **Wrapping**: Add toppings dynamically by wrapping the base pizza with decorators like `ExtraCheese` or `Jalapeno`.
3. **Cost Calculation**: Each decorator calculates its own cost and delegates the rest to the wrapped object.
4. **Output**: The final cost is computed by summing up the base cost and all topping costs.

## When to Use
    Use the Decorator Pattern in the following scenarios:
    1. Dynamic Behavior: When you need to dynamically add or remove behavior from objects at runtime.
    2. Avoid Subclass Explosion: When subclassing to add functionalities leads to too many subclasses and maintenance issues.
    3. Open/Closed Principle: When you want to extend an object’s functionality without modifying its code.
    4. Independent Extensions: When multiple independent extensions are needed, and combining them in different ways is required.

## Advantage
    1. Open/Closed Principle: Classes are open for extension but closed for modification.
    2. Dynamic Behavior: Add new functionalities to objects at runtime.
    3. Reusability: Combine decorators in various ways to create different behaviors.
    4. Scalability: Easily add new decorators without changing existing code.
    5. Separation of Concerns: Keeps the core logic of objects separate from additional functionalities.

## Author
**Hamid Khan**  
[GitHub Profile](https://github.com/hamid9766)

### Code Snippet
```java
BasePizza pizza = new ExtraCheese(new FarmhousePizza());
BasePizza pizza1 = new Olives(new Jalapeno(new ExtraCheese(new PaneerMakhaniPizza())));

System.out.println("Farmhouse Pizza with Extra Cheese: " + pizza.cost() + " Rs");
System.out.println("Paneer Makhani with Extra Toppings: " + pizza1.cost() + " Rs");


