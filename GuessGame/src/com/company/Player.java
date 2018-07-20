package com.company;

import java.util.Scanner;

public class Player {
    Scanner userInput = new Scanner(System.in);
    int number = 0;
    public void guess() {
       // Original code commented out to include prompts for user to enter guesses
       // number = (int) (Math.random() * 10);

        System.out.println("Enter number to guess: ");
        number = Integer.parseInt(userInput.nextLine());

        System.out.println("I'm guessing " + number);
    }
}
