# Observer Design Pattern

This repository demonstrates the implementation of the **Observer Design Pattern** in Java. The pattern is used to establish a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

## Table of Contents
- [Overview](#overview)
- [Components](#components)
- [Code Structure](#code-structure)
- [Usage](#usage)
- [When to Use](#when-to-use)
- [How It Works](#how-it-works)
- [Advantages](#advantages)
- [Expected Output](#expected-output)
- [Author](#author)

---

## Overview
The **Observer Design Pattern** is commonly used in scenarios where an object (the subject) needs to notify multiple other objects (observers) about changes to its state. It allows for a decoupled design between the subject and its observers.

---

## Components
1. **Observable (Subject):**  
   Maintains a list of observers and notifies them of any state changes.

2. **Observer:**: 
   An interface implemented by all observers that need to be notified of changes.
   Represents a subscriber that listens to changes and performs specific actions when notified.

3. **Concrete Classes:**:
   Implements the subject's interface and manages its observers.
    - `IphoneObservableImpl` (Observable)
    - `EmailAlertObserverImpl` (Observer)
    - `MobileAlertObserverImpl` (Observer)
---

## Code Structure
- **Observable**:
    - `StockObservable` (Interface)
    - `IphoneObservableImpl` (Concrete Observable)
- **Observer**:
    - `NotificationAlertObserver` (Interface)
    - `EmailAlertObserverImpl` and `MobileAlertObserverImpl` (Concrete Observers)
- **Main Program**:
    - `TestObserverPattern`: Demonstrates the working of the pattern.

---

## Usage
1. Create a `StockObservable` instance to represent the subject.
2. Create observer instances implementing the `NotificationAlertObserver` interface.
3. Add observers to the `StockObservable`.
4. Change the stock count using `setStockCount`, which automatically notifies all registered observers.

---

## When to Use
- When multiple objects need to stay in sync with changes in another object.
- In use cases requiring a decoupled relationship between the subject and its dependents.
- Examples include:
    - Real-time notifications in stock management systems.
    - Event-driven applications like GUI frameworks.

---

## How It Works
1. The subject maintains a list of observers.
2. Observers register themselves with the subject.
3. When the subject's state changes, it calls the `update` method on all observers.

---

## Advantages
- Promotes loose coupling between subject and observers.
- Simplifies the addition or removal of observers at runtime.
- Makes the system more flexible and easier to maintain.

---

## Expected Output
------------- Iphone Stock is available now. Hurry Up !!!! ------------- 
Mail sent to : rayy@gmail.com 
Mail sent to : mark224@icloud.com 
Msg sent to : Vincen


## Author
**Hamid Khan**  
[GitHub Profile](https://github.com/hamid9766)