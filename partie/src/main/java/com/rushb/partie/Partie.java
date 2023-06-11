package com.rushb.partie;

import com.rushb.joueur.Combinaison;
import com.rushb.joueur.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Joueur> joueurs;
    private int tours;

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
                System.out.println("Les dés finaux de " + joueur.getNom() + " sont : ");
                Utils.afficherDes(joueur.getDes());
            }
        }
    }
}