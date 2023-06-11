package com.rushb.appariement;

import com.rushb.joueur.Joueur;
import com.rushb.partie.Partie;

public class Appariement {
    public static void main(String[] args) {
        Partie partie = new Partie(10); // Création d'une nouvelle partie avec 10 tours

        // Ajout des joueurs
        partie.ajouterJoueur(new Joueur("Joueur 1"));
        partie.ajouterJoueur(new Joueur("Joueur 2"));

        // Commencer la partie
        partie.jouer();
    }
}