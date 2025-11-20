## Conditional Statements

The conditional statements in java are
* if

* if else

* switch

Every case is based upon a boolean condition

if this than then ...

    if (count > 20)


## Loop Statements
Allows a program to execute multiple times.
    
- while - condition continues to evaluate until false. 
Expression is evaluated before and after.

    
    When using a while loop its important to have input validation

- do
- for



## Nested loops

For each iteration of an outer loop, the inner loop executes completely


## Loop Termination 

break; - avoid using in a loop

continue; - like a break but the condition is evaluated again

## Comparing
Strings contain methods that help with comparing values
    
    .compareTo() - Integer; 0 = contain same characters
    .equals() - boolean


# Iteration

process items one at a time

hasNext Method - boolean - 

next method - retrieves next item

Scanner object is an iterator



## Array List
An object that stores a list of objects referenced by an integer

An array of Size N is indexed from zero to N (-) 1
    
    ArrayList<DataType> - Within the carrots is an element(String, Object, Integer)

Declaring an array uses square brackets

    int[] x = new int[]
    
or

    int[] units = {1,2,3,4,5}

Traversing Elements
    
    for (int score : scores) {System.out.println(score)}

print using the declared loop variable


An entire array can be passed as a parameter


# Key Concepts

A scanner uses delimiters to break its input up. Whitespace is the default delimiter


# Key Terms
Sentinel Value - Specific value used to indicate a condition such as the end of a loop

Palindrome - String of characters that reads the same forward or backward (e.g. radar)

Lambda expression - block of code that could be passed as a parameter
    
    push.setOnAction((event) -> {});


Local Variables are declared within a method 

Instance Variables are declared within a class

A Static Variable is a variable that is shared among all objects of said class



    this. - is an object reference of itself

### Dependence, Aggregation, Inheritrance


Aggregation - Composed of other objects to make up its class. Forming has-a relationship

