package com.rushb.yahtzee;

public class Score {
    public static int calculateScore(Dice dice) {
        int score = 0;
        for (int die : dice.getDice()) {
            score += die;
        }
        return score;
    }

    public static int calculateTotalScore(int[] scoreCard) {
        int totalScore = 0;
        for (int score : scoreCard) {
            totalScore += score;    
        }
        return totalScore;
    }
}
}
