package se.lexicon;
/*
5. Create a program that asks user to input his/her name and store it in a variable instead of having fixed name.
Then print ‘Hello username’ where username is what you got from user as input.
 */
import java.util.Scanner;

public class exercisesProject5 {
    public void helloUser(){

        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println();
        System.out.println("Enter your username below and press enter.");
        System.out.print("> ");
        input = scan.next();
        System.out.println("Hello " + input);
    }
}
