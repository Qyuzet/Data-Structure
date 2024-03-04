### Code Explanation

This Java program satisfies three out of the four Object-Oriented Programming (OOP) principles: Inheritance, Encapsulation, and Polymorphism. Below is an explanation of how each principle is implemented in the code:

#### Inheritance
- Inheritance is demonstrated through the `Lion` class, which extends the `Animal` class. The `Lion` class inherits properties and methods from the `Animal` class, establishing an "is-a" relationship, where a lion is a type of animal.

#### Encapsulation
- Encapsulation is achieved through the use of private instance variables (`name` and `age`) in the `Animal` class. These variables are encapsulated within the class, accessible only through getter and setter methods (`getName()`, `setName()`, `getAge()`, `setAge()`), ensuring data integrity and controlling access to the class's state.

#### Polymorphism
- Polymorphism is demonstrated through method overriding. The `makeSound()` method in the `Animal` class is overridden in the `Lion` class to produce a specific sound for lions (`Roar`). This allows the same method call (`makeSound()`) to exhibit different behaviors based on the type of object it is called on.

#### Abstraction
- Abstraction is not explicitly implemented in this code snippet. However, abstraction could be introduced by defining abstract methods or classes to provide a generalized interface for subclasses to implement their own behaviors.

### GitHub Repository

You can find the code in the following GitHub repository: [Link to Repository](https://github.com/Qyuzet/Data-Structure/blob/master/src/Xcercise.java)

### Instructions for Running the Code

To run the code:

1. Clone the GitHub repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile and run the `Xcercise` class.
4. View the output in the console, which should display the name, age, and sound of the lion.

