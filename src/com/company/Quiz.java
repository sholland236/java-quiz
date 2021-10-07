package com.company;
import java.util.Scanner;

public class Quiz {

    public static void runSinglePlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Single player mode selected");
        System.out.println("Please enter your name:");
        String playerName = scanner.nextLine();
        SinglePlayer player = new SinglePlayer(playerName);

        System.out.println("Hi " + player.getName() + "!");
        System.out.println("Which quiz would you like to play?");
        System.out.println("A Animals");
        System.out.println("B Movies");
        System.out.println("C General Knowledge");
        String genre = scanner.nextLine();

        Question questionList;
        if (genre.toLowerCase().equals("a")) {
            questionList = new AnimalQuestion();
        } else if (genre.toLowerCase().equals("b")) {
            questionList = new MovieQuestion();
        } else if (genre.toLowerCase().equals("c")) {
            questionList = new GeneralQuestion();
        } else {
            System.out.println("You did not select a valid option. You are now playing the general knowledge quiz");
            questionList = new GeneralQuestion();
        }

        Quiz.runQuiz(questionList, player);
    }

    public static void runTwoPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Two player mode selected");
        System.out.println("Player One, please enter your name:");
        String playerOneName = scanner.nextLine();
        Player playerOne = new Player(playerOneName);

        System.out.println("Player Two, please enter your name:");
        String playerTwoName = scanner.nextLine();
        Player playerTwo = new Player(playerTwoName);

        Question questionList = new GeneralQuestion();
        Quiz.runQuiz(questionList, playerOne, playerTwo);
    }

    public static void runQuiz(Question questionList, SinglePlayer player) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questionList.getQuestions().length; i++) {
            System.out.println("Question: " + questionList.getQuestions()[i]);
            System.out.println("A: " + questionList.getAnswerA()[i]);
            System.out.println("B: " + questionList.getAnswerB()[i]);
            System.out.println("C: " + questionList.getAnswerC()[i]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals(questionList.getCorrectAnswer()[i])) {
                player.setScore(player.getScore() + 1);
            }
            player.setQuestionsAnswered(player.getQuestionsAnswered() + 1);
            if (answer.toLowerCase().equals(questionList.getCorrectAnswer()[i])) {
                System.out.println("Well done!");
            } else {
                System.out.println("Too bad");
            }
        }
        System.out.println("Thanks for playing " + player.getName() + "!");
        System.out.println("Your score is: " + player.getScore());
        player.calculateAverage(player.getScore(), player.getQuestionsAnswered());
        System.out.println("Your percentage is " + player.getAverage() + "%");
    }

    public static void runQuiz(Question questionList, Player playerOne, Player playerTwo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0, counter = 0; i < questionList.getQuestions().length; i++, counter++) {
            if (counter % 2 == 0) {
                System.out.println("It's " + playerOne.getName() + "'s turn");
            } else {
                System.out.println("It's " + playerTwo.getName() + "'s turn");
            }
            System.out.println("Question: " + questionList.getQuestions()[i]);
            System.out.println("A: " + questionList.getAnswerA()[i]);
            System.out.println("B: " + questionList.getAnswerB()[i]);
            System.out.println("C: " + questionList.getAnswerC()[i]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals(questionList.getCorrectAnswer()[i])) {
                System.out.println("Well done!");
                if (counter % 2 == 0) {
                    playerOne.setScore(playerOne.getScore() + 1);
                } else {
                    playerTwo.setScore(playerTwo.getScore() + 1);
                }
            } else {
                System.out.println("Too bad");
            }
        }

        if (playerOne.getScore() > playerTwo.getScore()) {
            System.out.println(playerOne.getName() + " is the winner!");
        } else if (playerOne.getScore() < playerTwo.getScore()) {
            System.out.println(playerTwo.getName() + " is the winner!");
        } else if (playerOne.getScore() == playerTwo.getScore()) {
            System.out.println("It was a tie!");
        }

        System.out.println(playerOne.getName() + "'s score is: " + playerOne.getScore());
        System.out.println(playerTwo.getName() + "'s score is: " + playerTwo.getScore());
    }
}
