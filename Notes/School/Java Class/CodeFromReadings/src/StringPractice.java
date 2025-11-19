import java.util.Scanner;
public class StringPractice {
    //Declaring a two variables within one line.
    int i,j =0;

    Scanner input = new Scanner(System.in);

    //Some Escape sequence characters to create new line \n and insert some other characters
    String Escape_SequenceString = ("This is how you would struct with escape sequences." +"\nTo use a back slash enter double \\\\ backslash"
    + "\nTo use a single quote use \\ followed by a \'" + "\nto use a double quote use \\ followed by a \"");




    //How the current class outputs
    public void main (String[] args) {

        System.out.println(Escape_SequenceString + "\nYou can also add integers to strings " + i);

        System.out.println("Enter a string");
        String userinput = input.next();
        System.out.println("Enter Another");
        String userinputTwo = input.next();

        System.out.println(userinput.compareTo(userinputTwo));

    }



}
