# Overview
The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This implementation demonstrates a Mobile Factory for creating instances of various mobile phone brands.

# Components
1. **Mobile Interface**: Defines the `createMobile` method to be implemented by all mobile brands.
2. **Mobile Implementations**: Concrete classes (e.g., `Iphone`, `Samsung`, `Realme`, `OnePlus`, `GooglePixel`) that implement the `Mobile` interface.
3. **MobileFactory**: Contains the logic to create instances of different mobile brands based on input.
4. **TestFactoryPattern**: Demonstrates the usage of the factory pattern by creating and printing mobiles.

# Usage
1. Implement the `Mobile` interface for all mobile brands.
2. Use the `MobileFactory` class to create objects of mobile brands by passing the brand name as input.
3. Run the `TestFactoryPattern` class to see the factory in action.

# When to Use
- When object creation logic is complex and needs to be centralized.
- When the exact type of object to be created is determined dynamically at runtime.
- To decouple object creation from its usage.

# How It Works
1. The client calls the `createMobile` method of `MobileFactory` with a brand name.
2. The `MobileFactory` uses a `switch` statement to decide which concrete class to instantiate.
3. The factory returns an object of the appropriate class implementing the `Mobile` interface.
4. The client invokes the `createMobile` method on the returned object.

# Advantages
- Centralizes object creation logic.
- Provides flexibility in adding new types of mobiles without modifying the client code.
- Promotes adherence to the Open/Closed Principle.

# Expected Output
When running the `TestFactoryPattern` class, the output will be:
```
Iphone Mobile Created
Samsung Mobile Created
GooglePixel Mobile Created
Error creating Pixel, Unsupported brand: Pixel
```
