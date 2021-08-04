package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int from = 1;
        int to = 30;
        int randomNumber = random.nextInt(to - from + 1) + from;
        int guessedNumber;

        System.out.printf("The number is between %d and %d.\n", from, to);

        int counter = 0;
        int counter2=0;
        int counter3=0;
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (counter2==2)
                System.out.println("You only have 6 Tries");
            if (counter3==5)
                System.out.println("You only have 3 Tries");
            if (counter==8)
                break;

            else if (guessedNumber > randomNumber)
                System.out.println("Lower!!");
            else if (guessedNumber < randomNumber)
                System.out.println("Higher!!");
            else
                System.out.println("Correct guess!!\n\n\n");
            counter++;
            counter2++;
            counter3++;
        } while (guessedNumber != randomNumber);
    }
}


