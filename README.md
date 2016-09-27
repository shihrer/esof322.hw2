# esof322.hw2
![UML Diagram](/uml_diagram.png "UML Diagram")
## Exercise
The **Strategy pattern** is a design apttern used to encapsulate
different behaviors and/or algorithms. The idea is to allow you to swap
those strategies at will during the execution of a program. The
architecture of the program remains the same. According to Gamma et al.,
the "Strategy pattern is intended to define a family of algorithms,
encapsulate each one, and make them interchangeable. Strategy lets the
algorithm vary independently from clients that use it."

In this assignment, you are to design, then implement a program in Java (or your OO language of choice) that uses the Strategy pattern to solve the following problem.

You would like to provide a system for your customer that allows them to choose any one of three types of educational math software (Mathematica, MTool, or MyMath).  Each of these educational tools provides a function (*mathSort()*) to sort integers in ascending order.  The **Mathematica** tool uses *insertion sort*, **MTool** uses *merge sort*, and **MyMath** uses *bubble sort* as their default algorithms respectively.  You would like to allow your customer to select any one of these software tools and allow them to change the default algorithm to sort the numbers with any of the three sorting algorithms.

1. Design a UML class diagram to solve this problem.  Use the Strategy Pattern.
2. Write code in your favorite OO language to implement your design.
3. Create a UML sequence diagram that clearly shows the creation/usage of any math tool, its sorting execution, the runtime switching of algorithms, and then a sorting call again.

You will test your code by creating a client program (i.e. a main function) where you simulate the interaction between a client and his/her selection of math software.  The main function will request your selection of software (Mathematica, MTool, or MyMath) then call *mathSort()* to execute the default strategy to sort an array of numbers.  Then call *setSortStrategy()* on your math software object to dynamically switch strategies to one of the other sorting alternatives and execute it.
