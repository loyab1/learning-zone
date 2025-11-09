import java.util.Objects;
import java.util.Scanner;
public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;


    public Coin() {
        flip();
    }


    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }

    //class to test a flip
    public static void main(String[] args) {
        //Variable for users decision on playing
        Scanner input = new Scanner(System.in);

        //creates a coin object to use
        Coin x = new Coin();


        //game loop that runs until a valid decision is made
        while (true) {

            //prompting for user input
            System.out.println("Would you like to flip a coin? Y/N");
            String decision = input.next();


            if (decision.equalsIgnoreCase("Y")) {
                x.flip();
                System.out.println(x.toString());
                break;
            } else if (decision.equalsIgnoreCase("N")) {
                System.out.println("Get out!");
                break;
            } else {
                System.out.println("Please choose one bro");
            }

        }

    }
}