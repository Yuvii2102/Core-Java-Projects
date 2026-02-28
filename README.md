 # Learning Java with Projects

![Static Badge](https://img.shields.io/badge/Core%20Java-Bootcamp-blue)


- Programming is like riding a bike; you can read about how to do it all day, but the best way to get started is to practice.

- A Core Java Bootcamp is a structured training program where i learned the fundamentals of Java programming from basic to intermediate level.

- Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems in 1995 (now owned by Oracle).

- Java follows the principle:
  Write Once, Run Anywhere (WORA)

- This means Java programs can run on any system that has the Java Virtual Machine (JVM).

---
  

🚀 Features of Java
---

i]   Object-Oriented

ii]  Platform Independent

iii] Secure

iv]  Robust

v]   Multithreaded

vi]  Portable

vii] High Performance

---

![Java applications](https://i.ibb.co/chYhgGj/uses-of-Java.jpg "Java applications")

---


## 🎯 Before getting started

Now, before we immerse ourselves into writing code here's a few things you should know about Java:
**Java is a portable, secure, robust, compiled, object-oriented, and platform-independent programming language.** This means it can run on any machine, regardless of what operating system is used.

- ### What is programming?
Computer programming refers to the detail or steps of instructions given to a computer in an appropriate computer language, which enable the computer to perform a variety of tasks in sequence. A set of instructions written in a computer language is typically called a program or code.

- ### Java Virtual Machine
JVM stands for Java Virtual Machine. It is our smallest unit. When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

- ### Java Runtime Environment
JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications. If you need to run Java programs, but not develop them, JRE is what you need.

- ### Java Development Kit
JDK stands for Java Development Kit. It refers to all the standard libraries used in programming the software and a number of development tools (compilers, JavaDoc, Java Debugger, etc). When you download JDK, JRE is also downloaded with it.  
<br/>

![JDK-JRE-JVM](https://i.ibb.co/MZp6Dj8/JDK-JRE-JVM.png "JDK-JRE-JVM")



# Projects

For our projects we need [Java](https://www.java.com/download/ie_manual.jsp) and once this is in your system

The projects in our list are assignments focusing on different skills in **Core Java** needed to build out a well-rounded Java skill set; progressing in difficulty as the list continues.


1. [Introduction](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/01-Book.java)
2. [Looping](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/02-Employee.java)
3. [Arrays and Strings](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/03-Vowels-Consonants.java)
4. [Object-Oriented Programming](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/04-Banking-App.java)
5. [Constructor](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/05-Constructor.java)
6. [Abstract Classes and Interfaces](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/06-Abstract.java)
7. [Exceptions](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/07-Exception.java)
8. [Multithreading](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/08-Test.java)
9. [Java 8 Features](https://github.com/ajitagupta/core-java-projects/blob/main/README.md#9-java-8-features)
10. [Collections](https://github.com/Yuvii2102/Core-Java-Projects/blob/main/10-Collections.java)

---    

## 1. Introduction
Starting with the java cocepts, first i learned the concepts of class, data types, Wrapper classes, variable types (static, local, instance), arithmetics, and the Scanner class.

`Book.java` is the corresponding assignment. 

Here, we create a `Book` class, which asks the user for three inputs: `book name, author name, publish status`, and then prints those values sequentially to the console.

<img width="994" height="349" alt="output" src="https://github.com/user-attachments/assets/656f9f71-a24d-43f7-bb39-dd41855c9f4f" />

## 2. Looping

Looping consists of 
a) decision-making constructs (if, ladder if else, switch) since they make logical decisions (true/false) based on the conditions provided
b) conditional statements, which are the executable block of code (or branch to a specific code) dependent on certain conditions (while, do_while, for).

`Employee.java` is the corresponding assignment. 

Here, the user is supposed to enter his name, daily salary, and number of office attending-days that month. His monthly salary is calculated and used to justify to him his job designation.


<img width="999" height="344" alt="OUTPUT1" src="https://github.com/user-attachments/assets/b9098483-1e90-4002-8acd-449a4dc67421" />


## 3. Arrays and Strings

Array

- An Array is a data structure in Java that is used to store multiple values of the same data type in a single variable.

- Collection of elements of the same data type stored in contiguous memory locations.

- Each element in an array is stored at a specific index position, starting from 0.

Example - int[] numbers = {10, 20, 30, 40};

- Stores same data type elements

- Fixed size

- Index starts from 0

- Stored in continuous memory

String 

- A String in Java is an object that represents a sequence of characters.

Example - String name = "Yuvi";

In this concept we'll tackle a question: Counting the number of vowels and consonants in a string array specified by the user.

`VowelsConsonants.java` contains the solution and here is a demo output:

<img width="996" height="352" alt="Output-3" src="https://github.com/user-attachments/assets/4403ecf9-a42b-4e89-a94c-6482fc021003" />




## 4. Object-Oriented Programming

The purpose of OOP is to improve code readability and reusability. Data is accessed and controlled. Code is modified and maintained. All this is easier with object-oriented programming.

- The four pillars of OOP are:
  
  a) inheritance
  
  b) polymorphism
  
  c) encapsulation
  
  d) abstraction

- A class stands at the heart of OOP. It is a blueprint of an object, and an object is an instance or a copy of a class. An object is also a runtime entity with an identity, state, and behavior - all described by methods    and variables. It is initialized using the `new` keyword.

### Inheritance

- Inheritance is an OOPS concept where one class acquires the properties and methods of another class

i]   Single
ii]  Multi-level/chained
iii] Hierarchical
iv] Hybrid (mix of first 3) inheritance. 

- Class can access properties of another class. First class is called parent-/base-/superclass, second is called child-/derived-/subclass. Implemented using `extends` keyword. Multiple inheritance not supported.  
<br/>

<img width="640" height="152" alt="Inheritance" src="https://github.com/user-attachments/assets/e886901b-fb82-47a6-bc7a-7e96a7b3938a" />

![Inheritance](https://i.ibb.co/ChxyfNW/inheritance-drawio.png "Inheritance")


### Polymorphism

- One name, many forms (poly: many, morphism: behavior). One function can have multiple behaviors. 

- Ways: 
a) function overloading/compile-time overloading: same name, different parameters 
b) function overriding/runtime-/dynamic polymorphism / dynamic method dispatch: same name, same parameters (signature) / one reference (not object) for all subtypes, same method called on all, type of object being referred at time of call.

### Encapsulation
- Wrapping and binding of data in single unit. Variables declared in class with `private` keyword. Variables accessed with getters and setters. Methods inside the class.

### Abstraction

- Hiding implementation details of the code and exposing only necessary information to the user (example: ATM machine). Declared using `abstract` keyword. If method is abstract class must also be abstract. Class can't be instantiated, only extended in a child class.

### Larger Project: Banking System

Now let's have a look at a menu-driven banking application: `BankingApp.java`.

The user must input his bank information. Then, a menu appears:


<img width="964" height="351" alt="Bank-Output-1" src="https://github.com/user-attachments/assets/8b7eaad6-939a-4296-9cc6-c62b73f11146" />


<img width="968" height="354" alt="Bank-Output-2" src="https://github.com/user-attachments/assets/963d4a00-4e58-477e-b47e-ea358db9a521" />



After picking an option the instruction is carried out until the loop exits :

<img width="912" height="352" alt="Bank-Output-3" src="https://github.com/user-attachments/assets/d8ec0aef-fa84-45da-902a-b4865162a509" />



## 5. Constructor

- A Constructor is a special method in Java that is used to initialize objects.

- Special type of method which is used to initialize/create an object. 

- Rules: 
1) Constructor and class name should be the same
2) Constructor doesn't contain return type
3) Constructor cannot be abstract, static or final. Types: 1) default, 2) parameterized. A constructor cannot be overridden, but it can be overloaded.

Watch this overloaded constructor in `Student.java`:

![Overloading Constructor](https://i.ibb.co/BCT1w6Z/Student-java.png "Overloading Constructor")

## 6. Abstract Classes and Interfaces

- An abstract class must be declared with the `abstract` keyword. It can have abstract and non-abstract methods. It can't be instantiated. It can have constructors and static or final methods. If you want to declare a method as abstract the class must also be abstract.

- Interfaces are used to achieve multiple inheritance in Java - at a time you can extend multiple classes. An interface object cannot be created. An interface is defined by the `interface` keyword. By default, interface methods are abstract. A class to interface relationship is defined by `implements`. An interface to interface relationship is defined by `extends`.

- An example of the two is provided in `Parent.java`. Here is the output:

<img width="963" height="359" alt="Outputt" src="https://github.com/user-attachments/assets/46541f1e-e27d-4637-bb4c-daa64782cf9a" />



## 7. Exceptions

- An Exception is an unexpected event that occurs during program execution and disrupts the normal flow of the program.

- In Java, exceptions are handled using Exception Handling to prevent program crashes.


![Exceptions](https://github.com/user-attachments/assets/da34d96e-d5ce-40fa-88ce-36a21ee182c1)

- Keywords Used in Exception Handling

  i]   try → Block of code that may cause exception

  ii]  catch → Handles the exception

  iii] finally → Executes always

  iv]  throw → Used to explicitly throw exception

  v]   throws → Declares exception

To recover from exceptions we can make use of `try-catch`, `throw/throws`, or `finally` blocks. We can handle exceptions with multiple catch-blocks. The finally-block code executes at any cost. [See how throw and throws keywords work](https://www.c-sharpcorner.com/UploadFile/3614a6/throw-and-throws-in-java/).

In `ThrowPositiveException.java` we see an example of a user-defined exception:

<img width="962" height="359" alt="Exceptions-Result" src="https://github.com/user-attachments/assets/9cbbdcab-8f7f-4df9-8c37-616a553f126f" />




## 8. Multithreading

- Multithreading is a process of executing multiple threads simultaneously within a single program.

- It allows a program to perform multiple tasks at the same time, improving performance and CPU utilization.

- In Java, multithreading is achieved using:

i]  Thread class

ii] Runnable interface


A thread is a process / execution of a program. A thread gets created by extending the `Thread` class or by implementing `Runnable` interface, the latter allowing for more flexibility (multiple inheritance).

To execute the thread we use the `start` method, which automatically calls the Thread class' `run` method.

If multiple processes are running simultaneously there will be interleaving. To avoid this 

`RunnableTest.java` is an example of calling the 10's table from two different threads.

<img width="967" height="356" alt="Multi" src="https://github.com/user-attachments/assets/cf2b146b-6de7-41ce-8e26-b343f6c90fe7" />

<img width="958" height="346" alt="Join" src="https://github.com/user-attachments/assets/4828eb91-6ff2-4c03-8ae0-64fe5acddc75" />



## 10. Collections

Collections = Used to store multiple objects dynamically.

Most used collections:

i]   ArrayList

ii]  HashSet

iii] HashMap


✔ ArrayList → Allows duplicates
✔ HashSet → No duplicates
✔ HashMap → Key-Value pairs
✔ All are in java.util package


i]   <img width="965" height="358" alt="A L" src="https://github.com/user-attachments/assets/e6e86cee-448c-450e-9f7a-d4a5d0a84fa4" />

ii]  <img width="963" height="350" alt="H S" src="https://github.com/user-attachments/assets/d25aa918-e204-40d2-864d-d83cf512d5a8" />

iii] <img width="963" height="347" alt="H M" src="https://github.com/user-attachments/assets/cbb20001-dc55-474a-96dc-ccb5cc9fc444" />





