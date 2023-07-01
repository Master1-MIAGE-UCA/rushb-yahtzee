package integration.java.com.rushb.partie;

import com.rushb.joueur.Joueur;
import com.rushb.partie.Partie;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartieIntegrationTest {

    @Test
    public void testAffichagePartie() {
        // Création d'un flux de sortie capturant la sortie standard
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        // Création d'une partie avec 2 joueurs
        Partie partie = new Partie();

        // Création de joueurs
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");

        // Ajout des joueurs à la partie
        partie.ajouterJoueur(joueur1);
        partie.ajouterJoueur(joueur2);

        // Jouer la partie
        partie.jouer();

        // Récupérer la sortie capturée
        System.out.flush();
        String output = outputStream.toString();

        // Restaurer la sortie standard
        System.setOut(originalPrintStream);

        int compteJoueur1 = compterOccurrences(output, "C'est le tour de Joueur 1");
        int compteJoueur2 = compterOccurrences(output, "C'est le tour de Joueur 2");

        assertEquals(13, compteJoueur1);
        assertEquals(13, compteJoueur2);
    }

    private int compterOccurrences(String chaine, String sousChaine) {
        int compte = 0;
        int index = 0;
        while (index != -1) {
            index = chaine.indexOf(sousChaine, index);
            if (index != -1) {
                compte++;
                index += sousChaine.length();
            }
        }
        return compte;
    }
}
