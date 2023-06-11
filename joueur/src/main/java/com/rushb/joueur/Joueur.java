package com.rushb.joueur;

public class Joueur {
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public int[] lancerDes() {
        int[] des = new int[5];
        System.out.println(this.nom + " lance les dés :");
        for (int i = 0; i < 5; i++) {
            des[i] = (int)(Math.random() * 6) + 1;  // Génère un nombre aléatoire pour chaque dé
            System.out.println("Dé " + (i + 1) + " : " + des[i]);
        }
        return des;
    }

    public int[] relancerDes(int[] des) {
        System.out.println(this.nom + " relance les dés :");
        for (int i = 0; i < 5; i++) {
            if (Math.random() < 0.5) {  // Décide aléatoirement si le dé doit être relancé
                des[i] = (int)(Math.random() * 6) + 1;  // Génère un nouveau nombre aléatoire pour le dé
                System.out.println("Dé " + (i + 1) + " : " + des[i]);
            }
        }
        return des;
    }

    public void afficherDes(int[] des) {
        System.out.println(this.nom + " a les dés finaux :");
        for (int i = 0; i < 5; i++) {
            System.out.println("Dé " + (i + 1) + " : " + des[i]);
        }
    }
}

