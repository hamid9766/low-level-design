# Strategy Design Pattern

This repository demonstrates the implementation of the **Strategy Design Pattern** in Java. The pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. It allows the behavior of a class to be changed at runtime.

## Table of Contents
- [Overview](#overview)
- [Components](#components)
- [Code Structure](#code-structure)
- [Usage](#usage)
- [When to Use](#when-to-use)
- [How It Works](#how-it-works)

---

## Overview

The Strategy Design Pattern enables a class's behavior to be selected at runtime by providing a way to define and use interchangeable algorithms. It promotes open-closed and single-responsibility principles.

In this example, we model a `Vehicle` class with different driving strategies for:
- **Normal Vehicles** (e.g., goods vehicles)
- **Sports Vehicles**

---

## Components

### 1. Strategy Interface (`DriveStrategy`)
- Defines the common behavior for all driving strategies.

### 2. Concrete Strategies
- **`NormalDriveStrategy`**: Implements normal driving behavior.
- **`SportsDriveStrategy`**: Implements sports driving behavior.

### 3. Context Class (`Vehicle`)
- Uses a `DriveStrategy` object to execute the `drive` method.

### 4. Concrete Context Classes
- **`GoodsVehicle`**
- **`SportsVehicle`**

---

## Code Structure

---

## Usage

1. **Create a `DriveStrategy`**:
   Implement the `DriveStrategy` interface to define a specific driving behavior.

2. **Pass the strategy via constructor injection**:
   Use the strategy during the creation of a vehicle object.

3. **Call the `drive` method**:
   The vehicle uses the strategy's behavior at runtime.

---

## When to Use

The **Strategy Design Pattern** is particularly useful in the following scenarios:

1. **Scalability**:
    - When the behavior of a class needs to scale dynamically without modifying existing code.

2. **Avoiding Code Duplication**:
    - When child classes share the same methods, but the behavior varies depending on the implementation, making it unnecessary to implement all methods in the parent class.

3. **Runtime Behavior Change**:
    - When the behavior of an object needs to be selected dynamically based on the context.

4. **Adherence to SOLID Principles**:
    - To follow the **Open-Closed Principle** by allowing new strategies to be added without modifying existing code.
    - To maintain the **Single Responsibility Principle** by separating the algorithm's implementation from the context.

For example:
- A `Vehicle` class can switch between normal and sports driving modes without changing the code in the `Vehicle` class itself.

---

## How It Works

- **`Vehicle` Class**:
  The `Vehicle` class is the context class that uses a `DriveStrategy` to execute its `drive` behavior.

- **Dependency Injection**:
  The strategy object is injected into the `Vehicle` constructor, allowing flexible behavior selection.

Example:
```java
Vehicle goodsVehicle = new GoodsVehicle();
goodsVehicle.drive(); // Output: "Normal Drive Mode"

Vehicle sportsVehicle = new SportsVehicle();
sportsVehicle.drive(); // Output: "Sports Drive Mode"
