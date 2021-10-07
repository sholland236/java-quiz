package com.company;

public class MovieQuestion implements Question {
    private String[] questions = {
            "What was the first feature-length animated movie ever released?",
            "For what movie did Tom Hanks score his first Academy Award nomination?",
            "What flavor of Pop Tarts does Buddy the Elf use in his spaghetti in Elf?",
            "What shocking Wes Craven horror movie carried the marketing tagline, “To avoid fainting, keep repeating, ‘It’s only a movie…'”?",
            "Who played Juror Number 8 in 12 Angry Men?",
            "The head of what kind of animal is front-and-center in an infamous scene from The Godfather?",
            "Who played park owner John Hammond in Jurassic Park?",
            "In what 1976 thriller does Robert De Niro famously say “You talkin’ to me?”",
            "What’s the name of the anthemic dance near the beginning of The Rocky Horror Picture Show?",
            "For what movie did Steven Spielberg win his first Oscar for Best Director?",
            "What is the highest-grossing R-rated movie of all time?"
    };
    private String[] answerA = {
            "Pinocchio",
            "Big",
            "Chocolate",
            "The Hills Have Eyes",
            "Lee J Cobb",
            "Horse",
            "Jeff Goldblum",
            "The Last Tycoon",
            "The Macarena",
            "Schindler's List",
            "Deadpool"
    };
    private String[] answerB = {
            "Snow White and the Seven Dwarves",
            "Philadelphia",
            "Strawberry",
            "Cursed",
            "Henry Fonda",
            "Dog",
            "Richard Attenborough",
            "The Godfather Part II",
            "The Time Warp",
            "Jurassic Park",
            "It"
    };
    private String[] answerC = {
            "Dumbo",
            "Forrest Gump",
            "Cherry",
            "The Last House on the Left",
            "Joseph Sweeney",
            "Cow",
            "BD Wong",
            "Taxi Driver",
            "YMCA",
            "Catch Me if Your Can",
            "Joker"
    };
    private String[] correctAnswer = {
            "b",
            "a",
            "a",
            "c",
            "b",
            "a",
            "b",
            "c",
            "b",
            "a",
            "c"
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
