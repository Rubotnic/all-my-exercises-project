package se.lexicon;
/*
6. Create a program that asks user to input two numbers and print
the sum/multiplication/division and subtraction of given numbers.
 */
import java.util.Scanner;

public class exercisesProject6 {
    public void userNumbers(){
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int subtraction = number1 - number2;

        System.out.println();
        System.out.println("Sum: " +sum);
        System.out.println("Multiplication: " +multiplication);
        System.out.println("Division: " +division);
        System.out.println("Subtraction: " +subtraction);
    }
}
