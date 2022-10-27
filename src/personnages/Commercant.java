package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public void seFaireExtorquer() {
		argent = 0;
		parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoir(int gain) {
		gagnerArgent(gain);
		parler(gain + " sous ! Je te remercie généreux donateur !");
	}
}
