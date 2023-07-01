package com.rushb.appariement;

import com.rushb.joueur.Joueur;
import com.rushb.partie.Partie;

public class Appariement {
    public static void main(String[] args) {
        Partie partie = new Partie();

        // Ajout des joueurs
        partie.ajouterJoueur(new Joueur("Joueur 1"));
        partie.ajouterJoueur(new Joueur("Joueur 2"));
        // partie.ajouterJoueur(new Joueur("Joueur 3"));

        // Commencer la partie
        partie.jouer();
    }
}