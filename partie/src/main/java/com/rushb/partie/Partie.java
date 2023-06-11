package com.rushb.partie;

import com.rushb.joueur.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private final List<Joueur> joueurs;
    private final int tours;

    public Partie(int tours) {
        this.tours = tours;
        this.joueurs = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur joueur) {
        if (this.joueurs.size() < 5) {
            this.joueurs.add(joueur);
        } else {
            System.out.println("La partie est déjà complète !");
        }
    }

    public void jouer() {
        for (int i = 0; i < this.tours; i++) {
            for (Joueur joueur : this.joueurs) {
                System.out.println("\nC'est le tour de " + joueur.getNom());
                joueur.jouerTour();
            }
        }

        // Afficher les résultats une fois que tous les tours sont terminés
        afficherResultats();
    }

    public void afficherResultats() {
        System.out.println("\n ======================== Récapitulatif des scores : ========================");
        Joueur gagnant = null;
        int meilleurScore = 0;

        for (Joueur joueur : this.joueurs) {
            joueur.afficherGrilleFinale();  // Affiche la grille finale du joueur

            int score = joueur.getGrille().calculerScoreTotal();
            System.out.println("\nScore final " + joueur.getNom() + " : " + score);

            if (score > meilleurScore) {
                meilleurScore = score;
                gagnant = joueur;
            }
        }

        System.out.println("\nLe gagnant est " + gagnant.getNom() + " avec un score de " + meilleurScore);
    }
}