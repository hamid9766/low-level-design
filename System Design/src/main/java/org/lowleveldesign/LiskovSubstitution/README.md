# Liskov Substitution Principle - Example Code

This folder contains an example demonstrating the **Liskov Substitution Principle (LSP)**, one of the core SOLID principles of object-oriented design.

## Liskov Substitution Principle (LSP)

The principle states:  
*"Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program."*

This means that any subclass should uphold the expectations set by its superclass and should not introduce behavior that breaks the functionality or assumptions of the base class.

---

## Code Overview

### Classes:
1. **`Vehicle`**
    - Abstract class that defines a contract for all vehicles.
    - Includes the `hasEngine()` method, which is expected to return a Boolean value indicating whether the vehicle has an engine.

2. **`Car` and `Motorcycle`**
    - Subclasses of `Vehicle` that correctly adhere to the LSP.
    - Both implement the `hasEngine()` method and return `true`.

3. **`Bicycle`**
    - Subclass of `Vehicle` that violates the LSP.
    - The `hasEngine()` method returns `null`, which downgrades the expected functionality of the base class.

---

## Why `Bicycle` Violates LSP

The `Bicycle` class does not fully conform to the behavior expected of the `Vehicle` class. The `hasEngine()` method in the base class is expected to return a Boolean (`true` or `false`), but `Bicycle` returns `null`. This can lead to:
1. **Unexpected Behavior**: Client code relying on `hasEngine()` may fail or behave unpredictably.
2. **Downgraded Functionality**: The contract established by the base class (`Vehicle`) is broken, causing confusion and potential runtime issues.

### Example Output
When the code is executed:  
Car - true
Motorcycle - true
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Boolean.toString()" because the return value of "org.lowleveldesign.LiskovSubstitution.Vehicle.hasEngine()" is null
at org.lowleveldesign.LiskovSubstitution.TestLiskovPrincipal.main(TestLiskovPrincipal.java:14)
