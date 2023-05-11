package com.rushb.yahtzee;

import java.util.Scanner;

public class YahtzeeGame {
    private int[] scoreCard;
    private final int NUM_ROUNDS = 13;

    public YahtzeeGame() {
        scoreCard = new int[NUM_ROUNDS];
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        for (int round = 0; round < NUM_ROUNDS; round++) {
            System.out.println("Round " + (round + 1) + " - Roll the dice!");
            Dice dice = new Dice();
            dice.rollDice();

            System.out.println("Your dice: " + dice);

            System.out.println("Enter the dice to keep (1-" + Dice.NUM_DICE + "): ");
            String input = scanner.nextLine();
            boolean[] keepDice = Dice.parseKeepDice(input);

            dice.rerollDice(keepDice);
            System.out.println("Your dice: " + dice);

            int score = Score.calculateScore(dice);
            System.out.println("Score for this round: " + score);
            scoreCard[round] = score;

            System.out.println("------------------------------");
        }

        int totalScore = Score.calculateTotalScore(scoreCard);
        System.out.println("Game over! Total score: " + totalScore);
    }

    public static void main(String[] args) {
        YahtzeeGame game = new YahtzeeGame();
        game.playGame();
    }
}
