package com.rushb.joueur;

import java.util.ArrayList;
import java.util.Arrays;

public class Joueur {
    private String nom;
    private int[] des;
    private Grille grille;

    public Joueur(String nom) {
        this.nom = nom;
        this.grille = new Grille();
        this.des = new int[5];
    }

    public void jouerTour() {
        for (int i = 0; i < 3; i++) { // un joueur peut lancer les dés jusqu'à 3 fois par tour
            lancerDes();
            afficherDes();

            // Vérifier si le joueur peut réaliser une combinaison
            ArrayList<Combinaison> combinaisons = this.grille.getCombinaisons();
            Combinaison meilleureCombinaison = null;
            int meilleurScore = 0;

            for (Combinaison combinaison : combinaisons) {
                if (combinaison.estValide(this.des) && !this.grille.combinaisonRealisee(combinaison)) {
                    int score = combinaison.calculerScore(this.des);
                    if (score > meilleurScore) {
                        meilleurScore = score;
                        meilleureCombinaison = combinaison;
                    }
                }
            }

            if (meilleureCombinaison != null) {
                this.grille.ajouterScore(meilleureCombinaison, meilleurScore);
                System.out.println(this.nom + " a réalisé " + meilleureCombinaison.getNom() + " avec un score de " + meilleurScore);
                return; // le joueur ne relance pas les dés s'il peut réaliser une combinaison
            }
        }

        // Si le joueur ne peut réaliser aucune combinaison après 3 lancers, il doit supprimer une combinaison
        supprimerCombinaison();
    }

    public void lancerDes() {
        for (int i = 0; i < des.length; i++) {
            des[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void afficherDes() {
        System.out.println(this.nom + " a lancé les dés : " + Arrays.toString(this.des));
    }

    public void supprimerCombinaison() {
        // Trouver la combinaison non réalisée avec le score le plus faible
        Combinaison plusFaible = null;
        for (Combinaison combinaison : this.grille.getCombinaisons()) {
            if (!this.grille.combinaisonRealisee(combinaison)) {
                if (plusFaible == null || combinaison.getScore() < plusFaible.getScore()) {
                    plusFaible = combinaison;
                }
            }
        }
        // Supprimer cette combinaison
        if (plusFaible != null) {
            this.grille.supprimerCombinaison(plusFaible);
            System.out.println(this.nom + " a supprimé " + plusFaible.getNom());
        }
    }

    public int[] getDes() {
        return this.des;
    }

    public String getNom() {
        return nom;
    }

    public Grille getGrille() {
        return grille;
    }
    public void afficherGrilleFinale() {
        System.out.println("\nGrille finale " + this.nom + " :");
        this.grille.afficherGrille();
    }

}

