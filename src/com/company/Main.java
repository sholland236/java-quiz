package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");
        System.out.println("Please respond to each question by selecting A, B or C on your keyboard");

        System.out.println("How would you like to play?");
        System.out.println("A One player");
        System.out.println("B Two player");
        String playMode = scanner.nextLine();

        if (playMode.toLowerCase().equals("a")) {
            Quiz.runSinglePlayer();
        } else if (playMode.toLowerCase().equals("b")) {
            Quiz.runTwoPlayer();
        } else {
            System.out.println("Sorry, I couldn't read your response, please restart");
        }
    }
}
