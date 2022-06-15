package se.lexicon;
/*
7. Create a program that converts seconds to hours, minutes and seconds.
Input seconds: 86399
Expected output:
23:59:59
 */
import java.util.Scanner;

public class exercisesProject7 {
    public void convertTime(){

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Fill in seconds to see hours, minutes and seconds: ");
        int seconds = scan.nextInt();
        int second = seconds % 60;
        int hour = seconds / 60;
        int minute = hour % 60;
        hour = hour / 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
