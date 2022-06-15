package se.lexicon;
/*
2. Create a program that takes a year as input from user and print if it’s leap year or not.
 */
import java.util.Scanner;
public class exercisesProject2 {
    public void leapYear(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter anny year and press enter: ");
        int year = scan.nextInt();

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year+ " is a leap year");
        }
        else {
            System.out.println(year+ " is not a leap year");
        }
    }
}
