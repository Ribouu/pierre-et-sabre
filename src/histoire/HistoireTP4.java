package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;
public class HistoireTP4 {

	
	
	public static void main(String[] args) {
		
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir " +
					"une boisson à 12 sous.");
		prof.boire();
		prof.perdreArgent(12);
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir " +
				"un jeu à 2 sous.");
		prof.perdreArgent(2);
		prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche. je ne peux même pas " +
				"m'offrir un kimono à 50 sous.");
		System.out.println("\n\n");
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("\n\n");
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		yaku.direBonjour();
		yaku.extorquer(marco);
		System.out.println("\n\n");
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		System.out.println("\n");
		roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		roro.provoquer(yaku);
	}
}
