<b>Strategy Design Pattern</b> defines a family of algorithms, encapsulate each one and make them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it.

Given example has a Duck class in which quack and fly behaviors are separated(since they can vary from duck to duck) from the rest of class that does not vary. For example: A toy duck can squeak and not fly but a normal duck can fly and quack.

<b>Design Principles</b>
1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an Interface and not an implementation.
3. Favour composition over that interface.

