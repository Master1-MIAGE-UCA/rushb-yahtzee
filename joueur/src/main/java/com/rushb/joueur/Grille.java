package com.rushb.joueur;

import java.util.*;

public class Grille {
    private final Map<Combinaison, Integer> combinaisons;

    public Grille() {
        this.combinaisons = new HashMap<>();

        // Créer toutes les combinaisons disponibles
        Combinaison brelan = new Combinaison("Brelan", 0); // Le score sera calculé plus tard
        Combinaison carre = new Combinaison("Carré", 0); // Le score sera calculé plus tard
        Combinaison full = new Combinaison("Full", 25);
        Combinaison petiteSuite = new Combinaison("Petite suite", 30);
        Combinaison grandeSuite = new Combinaison("Grande suite", 40);
        Combinaison yams = new Combinaison("Yam's", 50);
        Combinaison chance = new Combinaison("Chance", 0); // Le score sera calculé plus tard
        Combinaison un = new Combinaison("1", 0); // Le score sera calculé plus tard
        Combinaison deux = new Combinaison("2", 0); // Le score sera calculé plus tard
        Combinaison trois = new Combinaison("3", 0); // Le score sera calculé plus tard
        Combinaison quatre = new Combinaison("4", 0); // Le score sera calculé plus tard
        Combinaison cinq = new Combinaison("5", 0); // Le score sera calculé plus tard
        Combinaison six = new Combinaison("6", 0); // Le score sera calculé plus tard

        List<Combinaison> combinaisons = Arrays.asList(brelan, carre, full, petiteSuite, grandeSuite, yams, chance, un, deux, trois, quatre, cinq, six);

        for (Combinaison combinaison : combinaisons) {
            this.combinaisons.put(combinaison, null);  // Aucun score n'est encore associé à chaque combinaison
        }
    }

    public void afficherGrille() {
        List<String> ordreCombinaisons = Arrays.asList("1", "2", "3", "4", "5", "6", "Brelan", "Carré", "Full", "Petite suite", "Grande suite", "Yam's", "Chance");

        for (String nomCombinaison : ordreCombinaisons) {
            for (Map.Entry<Combinaison, Integer> entry : combinaisons.entrySet()) {
                Combinaison combinaison = entry.getKey();
                if (combinaison.getNom().equals(nomCombinaison)) {
                    Integer score = entry.getValue();
                    if (score == 0) {
                        System.out.println(combinaison.getNom() + ": Supprimée");
                    } else {
                        System.out.println(combinaison.getNom() + ": " + score);
                    }
                }
            }
        }
    }

    public void supprimerCombinaison(Combinaison combinaison) {
        this.combinaisons.put(combinaison, 0);
    }

    public ArrayList<Combinaison> getCombinaisons() {
        return new ArrayList<>(this.combinaisons.keySet());
    }

    public boolean combinaisonRealisee(Combinaison combinaison) {
        return this.combinaisons.get(combinaison) != null;
    }

    public void ajouterScore(Combinaison combinaison, int score) {
        this.combinaisons.put(combinaison, score);
    }

    public int calculerScoreTotal() {
        int scoreTotal = 0;
        for (Integer score : this.combinaisons.values()) {
            if (score != null) {
                scoreTotal += score;
            }
        }
        return scoreTotal;
    }
}

