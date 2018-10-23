# Problem Set 2

## Directions
* Fork [Java Problem Set 2](https://repl.it/@kellylougheed/Java-Problem-Set-2) from repl.it
*	Main.java serves as the runner for all your files; complete each problem and class definition in the appropriately named file. For some OO programs, you are asked to construct objects in Main.java
*	At the top of each file, comment a description of the program, your name, and the date
*	Add comments throughout each program if your code is not self-explanatory

## Problems

### 2-0: Palindrome

Write a method that takes in a string and returns true if it is a [palindrome]( https://en.wikipedia.org/wiki/Palindrome) (reads the same forwards and backwards) and otherwise returns false. Your method should ignore punctuation (and any characters that are not letters). Call your string with several [known palindromes]( http://www.palindromelist.net/) to show it works and print the results.

**Less comfortable**: make your method work on strings with an even number of characters.

**More comfortable (+2 pts)**: make your method work on strings of any length.

### 2-1: Dragon Class

Write a class called `Dragon`. A `Dragon` should have a name, a level, and a boolean variable, `canBreatheFire`, indicating whether or not the dragon can breathe fire. The class should have getter methods for all of these variables - `getName`, `getLevel`, and `isFireBreather`, respectively.

`Dragon` will also need a constructor, a method to gain experience, and a method to attack.

The constructor should take the name as the first argument and the level as the second argument. The constructor should initialize `canBreatheFire` based on the dragon’s level. If the dragon is level 70 or higher, the dragon can breathe fire (meaning the third member variable should be set to `true`).

You should create three getter (accessor) methods called `getName()`, `getLevel()`, and `isFireBreather()`.

You should also create a method called `attack()`. This method does not return anything. If the dragon can breathe fire, it should print

```
>>>>>>>>>>
>>>>>>>>>>>>>>
>>>>>>>>>>>>>>
>>>>>>>>>>
```

That’s 10 angle brackets, then 14, then 14, then 10 (or copy and paste them!)
If the dragon cannot breathe fire, it should print `~ ~ ~`.

Finally, you should have a method called `gainExperience` that takes no parameters. It should add 10 to the dragon’s level and update `canBreatheFire` if necessary.

In summary, you should have the following methods:
•	A constructor that takes two parameters - the name and level (in that order)
•	getName
•	getLevel
•	isFireBreather
•	gainExperience
•	Attack

In Main, construct a dragon and have it gain enough experience until it breathes fire when it attacks. Call the attack method where the dragon breathes fire.

### 2-2: Library

Make a class for a `Book` that has fields for author, title, and total number of pages. The constructor should take in information about all three fields. Write a `toString()` method that returns a String of information about the book and an `equals()` method that checks if one book is equal to another.

Add two static fields to the `Book` class, `totalBooks` and `totalPageCount`. Alter the constructor so that each time a book is created, `totalBooks` is incremented by one, and its total number of pages is added to `totalPageCount`.

In Main, construct a few books and then print out the values of totalBooks and totalPageCount.

### 2-3: Clothing Store

In this problem, you’ll design a few classes that represent different pieces of clothing in a clothing store. You’ll write the classes for `TShirt`, `Jeans`, `Sweatshirt` and `Clothing`.

The `Clothing` class should have two instance variables: one for the size of the clothing (a String), and another for the clothing’s color (also a string).

`Clothing` should have two accessor (getter methods) as well:
```
public String getSize()
public String getColor()
```

The `Sweatshirt` class should have a private instance variable (or field) to store whether or not it has a hood, and a corresponding getter method: `public boolean hasHood()`.

The `TShirt` class should have a private field to store the fabric and a corresponding getter for that called
`public String getFabric()`.

All `Jeans` should have the color blue.

The constructors should be of this format:

```
public Clothing(String size, String color)
public TShirt(String size, String color, String fabric)
public Sweatshirt(String size, String color, boolean hasHood)
public Jeans(String size)
```

In Main, create one of each clothing type.

### 2-4: Chatbot

Create a Java program for a chatbot. The chatbot should continually print responses and prompt the user to respond. As long as the user types a string whose length is greater than 0 into the Scanner, the chatbot will generate a random response.

Find out how to generate random numbers in Java and research how a switch statement works in Java. Use a switch statement to make the bot print out a random response associated with a random number. (There is no need to use arrays here!)

---

Problems 2-1 and 2-3 adapted from [CodeHS](https://www.codehs.com/).
