package com.rushb.joueur;

import java.util.Arrays;

public class Combinaison {
    private final String nom;
    private final int score;

    public Combinaison(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    public String getNom() {
        return this.nom;
    }

    public int getScore() {
        return this.score;
    }

    public boolean estValide(int[] des) {
        int[] counts = new int[7];
        for (int de : des) {
            counts[de]++;
        }

        switch (this.nom) {
            case "Brelan":
                for (int count : counts) {
                    if (count >= 3) {
                        return true;
                    }
                }
                return false;
            case "Carré":
                for (int count : counts) {
                    if (count >= 4) {
                        return true;
                    }
                }
                return false;
            case "Full":
                boolean brelan = false, paire = false;
                for (int count : counts) {
                    if (count == 3) {
                        brelan = true;
                    } else if (count == 2) {
                        paire = true;
                    }
                }
                return brelan && paire;
            case "Petite suite":
                return ((counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) ||
                        (counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0) ||
                        (counts[3] > 0 && counts[4] > 0 && counts[5] > 0 && counts[6] > 0));
            case "Grande suite":
                return ((counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0) ||
                        (counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0 && counts[6] > 0));
            case "Yam's":
                for (int count : counts) {
                    if (count == 5) {
                        return true;
                    }
                }
                return false;
            case "Chance":
                return true;
            default:
                int valeur = Integer.parseInt(this.nom);
                return counts[valeur] > 0;
        }
    }

    public Integer calculerScore(int[] des) {
        if (!this.estValide(des)) {
            return null;
        }

        switch (this.nom) {
            case "Brelan":
                for (int i = 1; i <= 6; i++) {
                    int finalI = i;
                    if (Arrays.stream(des).filter(de -> de == finalI).count() >= 3) {
                        return finalI * 3;
                    }
                }
                break;
            case "Carré":
                for (int i = 1; i <= 6; i++) {
                    int finalI = i;
                    if (Arrays.stream(des).filter(de -> de == finalI).count() >= 4) {
                        return finalI * 4;
                    }
                }
                break;
            case "Full":
                return 25;
            case "Petite suite":
                return 30;
            case "Grande suite":
                return 40;
            case "Yam's":
                return 50;
            case "Chance":
                return Arrays.stream(des).sum();
            default:
                int valeur = Integer.parseInt(this.nom);
                return (int) Arrays.stream(des).filter(de -> de == valeur).count() * valeur;
        }

        return null;
    }
}