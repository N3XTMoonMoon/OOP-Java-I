package guessingGame;
import java.util.Scanner;

public class GuessingGame {

	public GuessingGame() {

	}

	public void game() {

		int rng;
		Scanner scanner = new Scanner(System.in);
		int guess;
		int count;
		boolean bock;
		do {
			System.out.println("Möchten Sie eine Runde Zahlenraten spielen? (y/n)");

			String input = scanner.next();

			if (input.equals("y")) {
				bock = true;

				rng = (int) (Math.random() * 100);
				count = 1;
				System.out.println("Schreiben Sie eine Zahl zwischen 1 und 100 " + rng);

				do {
					guess = scanner.nextInt();
					if (guess == rng) {
						System.out.println("Glückwunsch Sie haben die richtige Zahl erraten!");
						System.out.println("Anzahl der Versuche: " + count);
						System.out.println("");
					} else if (guess < rng) {
						System.out.println("höher");
					} else {
						System.out.println("niedriger");
					}
					count++;
				} while (guess != rng);
			} else {
				bock = false;
			}

		} while (bock);
		scanner.close();
	}
}
