package com.rushb.joueur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoueurApplication {
	public void rollDice() {
		for (Dice d : dice) {
			d.roll();
		}
	}

	public void rollSpecificDice(int[] diceIndices) {
		for (int i : diceIndices) {
			if (i >= 0 && i < dice.length) {
				dice[i].roll();
			}
		}
	}
	// Ce que je souhaitais faire
	// genere moi une fonction qui gère la relance de dès. Après chaque lancer, nous devons avoir le résultat des 5 dés.
	// De plus, l'IA (joueur) doit pouvoir choisir de relancer tels dés pour réaliser une figure
	/*public abstract class Player {
		// ...
		protected static final int MAX_REROLLS = 2;

		public int[] rerollDice() {
			// Lancer tous les dés
			rollDice();

			// Afficher les résultats du lancer
			int[] results = getDiceResults();
			System.out.println("Résultat du lancer : " + Arrays.toString(results));

			// Relancer les dés spécifiés par l'IA
			for (int i = 0; i < MAX_REROLLS; i++) {
				int[] diceToReroll = decideDiceToReroll();
				rollSpecificDice(diceToReroll);

				// Afficher les résultats du relancer
				results = getDiceResults();
				System.out.println("Résultat après relancer " + (i+1) + " : " + Arrays.toString(results));
			}

			return results;
		}

		protected abstract int[] decideDiceToReroll();

		private int[] getDiceResults() {
			int[] results = new int[dice.length];
			for (int i = 0; i < dice.length; i++) {
				results[i] = dice[i].getValue();
			}
			return results;
		}
		// ...
	}*/

	public static void main(String[] args) {
		SpringApplication.run(JoueurApplication.class, args);
	}

}
