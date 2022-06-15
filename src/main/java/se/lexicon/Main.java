package se.lexicon;

public class Main {

    public static void main(String[] args) {

        exercisesProject1 exercises1 = new exercisesProject1();
        exercises1.helloName();

        exercisesProject3 exercises3 = new exercisesProject3();
        exercises3.numbers();

        exercisesProject4 threeNumbers = new exercisesProject4();
        threeNumbers.average();
// This is exercises 2
        exercisesProject2 exercises2 = new exercisesProject2();
        exercises2.leapYear();

        exercisesProject5 user = new exercisesProject5();
        user.helloUser();

        exercisesProject6 numbers = new exercisesProject6();
        numbers.userNumbers();

        exercisesProject7 time = new exercisesProject7();
        time.convertTime();

        exercisesProject8 guessNumber = new exercisesProject8();
        guessNumber.randomNumber();
    }
}