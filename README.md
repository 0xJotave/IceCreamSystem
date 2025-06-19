# IceCreamSystem

This project implements an ordering system for an ice cream parlor, utilizing various Design Patterns to ensure modular, extensible, and easily maintainable code. The goal is to optimize the order flow, from creating and customizing ice cream to managing discounts and tracking order status.

## 🎯 Project Objective

To create a robust system for managing ice cream orders, allowing for:

- **Flavor and Type Management:** Creation of different ice cream types (popsicles, scoops, milkshakes).
- **Customization:** Adding toppings and extras to orders.
- **Discounts:** Application of various discount strategies.
- **Tracking:** Automatic customer notification regarding order status.
- **Optimization:** Efficient management of the order queue.

## 🔹 Applied Design Patterns

The project was developed with the application of the following GoF (Gang of Four) Design Patterns:

- **Strategy**
  - **Purpose:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
  - **Application:** Used to apply different discount strategies (e.g., `RegularCustomerDiscount`, `SeasonalDiscount`) to orders, which can be easily swapped without altering the core code.
- **Decorator**
  - **Purpose:** Attaches additional responsibilities to an object dynamically.
  - **Application:** Allows for ice cream customization through the addition of "toppings" (`ToppingDecorator`), such as chocolate (`ChocolateTopping`), in a flexible manner.
- **Observer**
  - **Purpose:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
  - **Application:** Ensures automatic notification of customers (`Customer`) about updates to their order status, via the `OrderNotifier`.
- **Singleton**
  - **Purpose:** Ensures a class has only one instance and provides a global point of access to it.
  - **Application:** Used to manage the order queue (`OrderQueue`) for the ice cream parlor, ensuring there's only one centralized queue for processing.
- **Factory Method**
  - **Purpose:** Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
  - **Application:** The `IceCreamFactory` is responsible for creating different types of ice cream (popsicle, scoop, milkshake) in a standardized way.
- **Command**
  - **Purpose:** Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
  - **Application:** Order-related actions (e.g., `PlaceOrderCommand`) are encapsulated, facilitating the future implementation of "undo" or "redo" functionalities for an order.
- **State**
  - **Purpose:** Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
  - **Application:** Controls and manages the different states of an order (`OrderReceived`, `OrderPreparing`, `OrderDelivered`) through the `OrderContext`, allowing for smooth transitions between them.
- **Facade**
  - **Purpose:** Provides a unified interface to a set of interfaces in a subsystem.
  - **Application:** The `OrderFacade` simplifies the process of managing orders and payments, exposing a simpler interface for interaction with the underlying complex system.
- **Repository**
  - **Purpose:** Separates domain logic from data access logic, providing an in-memory collection of domain objects.
  - **Application:** The `OrderRepository` acts as a persistence layer to save and retrieve orders and, in the future, customer history.

## 🚀 How to Run the Project

1. **Prerequisites:** Make sure you have Java Development Kit (JDK) 8 or higher installed on your machine.
2. **Clone the Repository:** (Assuming the project is in a repository)
 ```
git clone https://github.com/0xJotave/IceCreamSystem
cd IceCreamSystem
 ```
3. **Project Structure:** The code is organized into Java packages for better modularity (e.g., `model`, `service`, `repository`, `observer`).

3. **Compilation and Execution:**

- Via IDE (IntelliJ IDEA, Eclipse, VS Code): Import the project as a Maven or Gradle project (if configured) or as a simple Java project. Run the `Main` class located in `src/org/icecream/app/Main.java`
- Via Terminal (without IDE):
  - Navigate to the root of your project (where the `src` folder is).
  - Compile the code:
 ```
javac src/org/icecream/**/*.java
 ```
  - Run the main application:
 ```
java -cp src org.icecream.app.Main
 ```
