package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int argentAvant = getArgent();
		perdreArgent(argentAvant);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentAvant;
	}
	
	public void recevoir(int gain) {
		gagnerArgent(gain);
		parler(gain + " sous ! Je te remercie généreux donateur !");
	}
}
