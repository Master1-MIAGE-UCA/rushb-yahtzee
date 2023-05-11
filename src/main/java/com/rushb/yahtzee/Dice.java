package com.rushb.yahtzee;

import java.util.Arrays;
import java.util.Random;

class Dice {
    private int[] dice;
    public static final int NUM_DICE = 5;

    public Dice() {
        dice = new int[NUM_DICE];
    }

    public void rollDice() {
        Random random = new Random();
        for (int i = 0; i < NUM_DICE; i++) {
            dice[i] = random.nextInt(6) + 1;
        }
    }

    public void rerollDice(boolean[] keepDice) {
        Random random = new Random();
        for (int i = 0; i < NUM_DICE; i++) {
            if (!keepDice[i]) {
                dice[i] = random.nextInt(6) + 1;
            }
        }
    }

    public int[] getDice() {
        return dice;
    }

    public void setDice(int[] dice) {
        this.dice = dice;
    }

    @Override
    public String toString() {
        return Arrays.toString(dice);
    }

    public static boolean[] parseKeepDice(String input) {
        boolean[] keepDice = new boolean[NUM_DICE];
        for (int i = 0; i < input.length(); i++) {
            int diceIndex = Character.getNumericValue(input.charAt(i)) - 1;
            keepDice[diceIndex] = true;
        }
        return keepDice;
    }
}
