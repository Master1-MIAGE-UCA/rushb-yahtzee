package com.rushb.partie;

import com.rushb.joueur.Joueur;
import com.rushb.partie.Partie;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PartieTest {

    @Test
    public void testAjouterJoueurLimite() {
        Partie partie = new Partie();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Ajoute 5 joueurs
        for (int i = 0; i < 5; i++) {
            Joueur joueur = new Joueur("Joueur " + (i + 1));
            partie.ajouterJoueur(joueur);
        }

        // Ajoute un joueur supplémentaire
        Joueur joueurSupplementaire = new Joueur("Joueur 6");
        partie.ajouterJoueur(joueurSupplementaire);

        String output = outputStream.toString().trim();

        // Vérifie que le message d'erreur est le bon
        assertEquals("La partie est déjà complète !", output);

        // Vérifie que le joueur supplémentaire n'a pas été ajouté à la partie
        assertFalse(partie.getJoueurs().contains(joueurSupplementaire));

        // Réinitialise la sortie standard
        System.setOut(System.out);
    }
}
