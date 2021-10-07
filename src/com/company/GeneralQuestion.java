package com.company;

public class GeneralQuestion implements Question {
    private String[] questions = {
            "Who was elected President of the United States in 2017?",
            "What is the national language of Canada?",
            "What is the national animal of Pakistan?",
            "Brazil is the biggest producer of?",
            "What is the longest that an elephant has ever lived? (That we know of)",
            "How many rings are on the Olympic flag?",
            "What is a tarsier?",
            "How did Spider-Man get his powers?",
            "In darts, what's the most points you can score with a single throw?",
            "Which of these animals does NOT appear in the Chinese zodiac?",
            "Who are known as Brahmins?",
            "How many holes are on a standard bowling ball?",
            "What are the main colors on the flag of Spain?",
            "In the nursery rhyme, how many blackbirds were baked in a pie?",
            "What is a pomelo?",
            "How many points is the letter X worth in English-language Scrabble?"
    };
    private String[] answerA = {
            "Donald Trump",
            "English",
            "Peacock",
            "Rice",
            "17 years",
            "4",
            "A primate",
            "Military Experiment gone wrong",
            "50",
            "Bear",
            "Surfers in California",
            "2",
            "Green and white",
            "4",
            "The largest fruit",
            "None"
    };
    private String[] answerB = {
            "Barack Obama",
            "Dutch",
            "Markhor",
            "Oil",
            "86 years",
            "5",
            "A lizard",
            "Born with them",
            "60",
            "Rabbit",
            "Members of India's highest caste",
            "3",
            "Blue and white",
            "11",
            "A breed of dog",
            "8"
    };
    private String[] answerC = {
            "George Bush",
            "French",
            "Lion",
            "Coffee",
            "142 years",
            "7",
            "A bird",
            "Bitten by a radioactive spider",
            "100",
            "Dog",
            "It's a totally made up word",
            "5",
            "Red and yellow",
            "24",
            "An old-fashioned punching bag",
            "11"
    };
    private String[] correctAnswer = {
            "a",
            "b",
            "b",
            "c",
            "b",
            "b",
            "a",
            "c",
            "b",
            "a",
            "b",
            "b",
            "c",
            "c",
            "a",
            "b"
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
