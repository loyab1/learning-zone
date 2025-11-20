import java.util.Random;
import java.util.Scanner;

public class ComputerUsernameProject {
    //Chapter 3.1 Programming Project
    /* Write a program that prompts for a users first and last name
    Prints a String composed of the 1st character in first name and
    first 5 characters in the last name, followed by a random number
    from the range of 10 to 99
     */
   private String FName;
   private String lastName;
    Scanner userInput = new Scanner(System.in);
    Random randomNum = new Random();

    public String FormatUserName(){
        String firstNameLetter = FName.substring(0,1);
        String lastNameFiv;

        //Generates a Random Number between 10 and 90
        int Num = randomNum.nextInt(90)+10;

        //If Statement to avoid an Error if Last Names are less than 5
        if (lastName.length() >= 5){
            lastNameFiv = lastName.substring(0,5);
        }
        else{
            lastNameFiv = lastName;
        }

        return firstNameLetter + "." + lastNameFiv + Num;
    }

    //Method to run a Test CLI of a userName
    public void testName(){
        System.out.println("Enter your first Name: ");
        FName = userInput.next();
        System.out.println("Enter Last Name: ");
        lastName = userInput.next();
        System.out.println(FormatUserName());
    }


    public static void main(String[] args){
        //Object is created because Java: static does not have access to instance
        ComputerUsernameProject cup = new ComputerUsernameProject();

        cup.testName();
    }
}
