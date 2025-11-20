# Using Classes and Objects


### Creating Objects

The class used to define an object is the reference of an object, and is used to Declare a new object
in reference to its declaration known as instantiation 

Object declarations can be set to null 

Two Objects of the same value will reference one and use it as an alias



### String Methods
- charAt(int index) returns Character at specific index
- compareTo(String str) Compares the unicode of the string character by character lexicographically.  
If positive s1 comes before s2  
If negative s1 comes after s2  
If 0 both are identical
- equals(String) or equalsIgnoreCase(String) - returns a boolean if the characters are the same
- length()
- replace(oldChar, newChar)
- toLowerCase() or toUpperCase()

### Formatting Output
printf - allows user to print a formatted string  
first parameter is representation of fromat string and the rest specify values



Numbers

Number Methods

NumberFormat getCurrencyInstance()   
NumberFormat getPercentInstance()  

DecimalFormat Class
Must Instantiate a DecimalFormat class


### Enumerated Types

Data type that list all possible values of the declared type  
    enum Season {winter, spring, summer, fall}
Once the type is defined a variable can be declared from the type 

Each value of an enum is stored as an integer known as an ordinal value

.ordinal() returns the integer value of the position
.name() returns the name of the value


### Wrapper Class
A class used to store a data primitive type (int,void,char,etc) as an object

        Integer ageObj = new Integer(40);

Wrapper classes can convert primitive value types in other types

### Packages

Class Library - set of classes either included with compilers or are third party

API - Application programming interfaces are classes that are useful to programmers not usually built within a language.  

Packages - String Class a part of java.lang package

<img src="Images/Java%20Packages.png" width = "400" >


## Dictionary

Instantiation - Creating an object from a class
Immutable - An Instance of an object that has data which cant be changed