package com.company;

public class AnimalQuestion implements Question {
    private String[] questions = {
            "What is the fastest member of the animal kingdom?",
            "Who has the strongest bite in the animal kingdom?",
            "Which are the only birds known to be capable of flying backwards?",
            "Which land animal has the greatest range of vision?",
            "The Cottontop tamarin is what type of animal?",
            "What is the collective name for a group of crows?",
            "What is the slowest animal in the world?",
            "How many species of shark are there?",
            "Which mammal lives the longest?",
            "Which animal never sleeps?",
            "How many pairs of wings does a bee have?",
            "A snail can sleep for how many years?"
    };
    private String[] answerA = {
            "Peregrin Falcon",
            "Tiger",
            "Pigeon",
            "Elephant",
            "Monkey",
            "A Murder",
            "Caterpillar",
            "70",
            "Elephant",
            "Bullfrog",
            "1",
            "3"
    };
    private String[] answerB = {
            "Cheetah",
            "Crocodile",
            "Hummingbird",
            "Ostrich",
            "Big Cat",
            "A Cluster",
            "Snail",
            "310",
            "Bowhead Whale",
            "Rattlesnake",
            "2",
            "4"
    };
    private String[] answerC = {
            "Wolf",
            "Great White Shark",
            "Crow",
            "Giraffe",
            "Fish",
            "A Pack",
            "Sloth",
            "440",
            "Human",
            "Kangaroo",
            "3",
            "5"
    };
    private String[] correctAnswer = {
            "a",
            "b",
            "b",
            "c",
            "a",
            "a",
            "c",
            "c",
            "b",
            "a",
            "b",
            "a"
    };

    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswerA() {
        return answerA;
    }

    public String[] getAnswerB() {
        return answerB;
    }

    public String[] getAnswerC() {
        return answerC;
    }

    public String[] getCorrectAnswer() {
        return correctAnswer;
    }
}
