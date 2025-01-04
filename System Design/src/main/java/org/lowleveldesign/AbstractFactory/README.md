# Overview
The Abstract Factory Design Pattern provides a way to encapsulate a group of individual factories that share a common theme. This implementation demonstrates an Abstract Factory for creating different models of iPhones and Samsung phones based on user input.

# Components
1. **Abstract Classes**:
    - `Phone`: Defines the structure and methods common to all phones.
    - `PhoneStore`: Abstract factory class for creating phones.
2. **Concrete Phone Classes**:
    - `Iphone15Pro`, `Iphone16`, `Iphone16Plus`: Specific models of iPhones.
    - `SamsungS24`: Specific model of Samsung phone.
3. **Concrete Factories**:
    - `IphoneFactory`: Factory for creating iPhone models.
    - `SamsungFactory`: Factory for creating Samsung models.
4. **Client Code**:
    - `TestAbstractFactoryPattern`: Demonstrates the usage of the Abstract Factory Pattern.

# Code Structure
```
org.lowleveldesign.AbstractFactory
|-- Phone.java
|-- PhoneStore.java
|-- Samsung
|   |-- SamsungS24.java
|-- IPhone
|   |-- Iphone15Pro.java
|   |-- Iphone16.java
|   |-- Iphone16Plus.java
|-- PhoneFactory
    |-- IphoneFactory.java
    |-- SamsungFactory.java
|-- TestAbstractFactoryPattern.java
```

# Usage
1. Define concrete phone models by extending the `Phone` class.
2. Implement the `PhoneStore` class for specific phone brands (e.g., `IphoneFactory`, `SamsungFactory`).
3. Use the `orderPhone` method to create and build phones based on the model name.
4. Run `TestAbstractFactoryPattern` to see the factory in action.

# When to Use
- When a system needs to be independent of the way its objects are created.
- When the client code needs to work with a family of related objects without knowing their concrete classes.
- When adding new products should not require changes to existing client code.

# How It Works
1. The client code (`TestAbstractFactoryPattern`) interacts with the abstract factory (`PhoneStore`) to order a phone.
2. The concrete factory (`IphoneFactory` or `SamsungFactory`) decides which concrete phone class to instantiate based on the model name.
3. The selected phone is created, and its `buildPhone` method is called to display its details.

# Advantages
- Provides flexibility to add new product families without modifying existing code.
- Encourages adherence to the Open/Closed Principle.
- Decouples object creation from usage.

# Expected Output
```
Building Phone : iPhone
Model : 16
Storage : 512 GB
Price : 89000
---------------------
Building Phone : iPhone
Model : 15 Pro
Storage : 256 GB
Price : 105000
---------------------
Building Phone : Samsung
Model : S24 Ultra
Storage : 512 GB
Price : 135000
```
