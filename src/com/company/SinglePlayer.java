package com.company;

public class SinglePlayer extends Player {
    private int questionsAnswered = 0;
    private double average;

    public SinglePlayer(String name) {
        super(name);
    }

    public void calculateAverage(int score, int questionsAnswered) {
        double sum = 0.0;
        sum = (double)score / (double)questionsAnswered;
        sum = (double)Math.round(sum*100.0);
        this.average = sum;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public double getAverage() {
        return average;
    }

    public void setQuestionsAnswered(int questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }
}
