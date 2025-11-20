# Data and Expressions

### Character Strings
Strings are objects in Java. (string literals are denoted with double quotes " ")  
they do not span multiple lines. 

Numbers are automatically converted to strings when trying to concatenate with another string.  
To perform arithmetic operations within a string literal. Parenthesis () are required.


Character literals are expressed with single quotes.

###### ASCII

Characters a through z are ASCII Decimal 97 to 122

Characters A through Z are 65 to 90

###### Escape Sequence

Escape sequences represent special characters to be used within a string.  Denoted with a \

[HTML only works in this document because of intelli idea]: #

 <img src="Images/Escape_Sequences.png" width="250" height="175">

### Variables 

A Constant variable is declared with final. These values that can not be changed.  

You can declare multiple variables within the same line of the same data type.  

    int i ,j = 0;

#### Primitive Data Types
Four Integers
- byte
- short (if a value will not vary outside a range of 1 - 1000)
- int
- long

Two floating point
- float (a decimal integer appended with an f)
- double
- 
### Dictionary
Parameter - A value that is passed within a method. Answer(Score){}

Literal
Constant - Value that can not be changed
variables = declared data types

### Arithmetic Operations
Java does not have built in operator for raising a value to an exponent.  
Java has a Math class that is used for other mathematics. 

Precedence of operations if from left to right and can be forced  
with parentheses



### Scanner Class
import java.util.Scanner  

Scanner Class is used to for reading user input and parsing strings

System.in is the default input stream for a scanner which is the keyboard

If the Scanner reads the input token and does not match the data type a mismatch error occurs.  
Must Parse a String in order to extract Integers and floats of said String

###### Methods

- next()
- nextLine()
- nextInt() nextDouble() nextFloat()
- hasNext() returns a boolean value
- findInLine()
