//Need to input the scanner class
import java.util.Scanner;

public class FahrenheitCelsiusCalc {

    public void main(String[] args){

        Scanner userinput = new Scanner(System.in);
        final double F,C = 0;


        System.out.println("Would you like to Convert\n"
                + "\n1 Celsius to Fahrenheit" + "\n\t\t\tor"
                + "\n2 Fahrenheit to Celsius");
        double y = userinput.nextDouble();

        if (y == 1){


            System.out.println("Enter the temperature in celsius");
            double x = userinput.nextDouble();

            double Celsius = ((x * (9.0 /5.0)) + 32);

            System.out.println("The Current Temp in Fahrenheit is " + Celsius);


        }

        if (y == 2) {
            System.out.println("Enter the temperature in fahrenheit");
            double x = userinput.nextDouble();

            double fahrenheit = ((x - 32) * 5.0/9.0);

            System.out.println("The Current Temp in Fahrenheit is " + fahrenheit);
        }
    }

}
