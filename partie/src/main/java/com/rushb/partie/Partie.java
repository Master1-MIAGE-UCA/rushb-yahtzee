package com.rushb.partie;

import com.rushb.joueur.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Joueur> joueurs;
    private int tours;

    public Partie(int tours) {
        this.joueurs = new ArrayList<>();
        this.tours = tours;
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
                int[] des = joueur.lancerDes();
                for (int j = 0; j < 3; j++) {  // Chaque joueur peut relancer les dés jusqu'à 3 fois
                    des = joueur.relancerDes(des);
                }
                joueur.afficherDes(des);
            }
        }
    }
}