package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance;
	private int memoireConnaissancesMax = 3;
	private Humain connaissances[] = new Humain[memoireConnaissancesMax];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public int getNbConnaissances() {
		return nbConnaissance;
	}
	
	public Humain[] getListeConnaissances() {
		return connaissances;
	}
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix<this.argent) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix +
					" sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + this.argent + " en poche. Je ne peux pas même pas m'offrir " +
					bien + " à " + prix + " sous.");
		}
		
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissance!=memoireConnaissancesMax) {
			connaissances[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i=0; i<nbConnaissance-1; i++) {
				connaissances[i] = connaissances[i+1];
			}
			connaissances[nbConnaissance-1] = humain;
		}
		
	}
	
	public void listerConnaissances() {
		String texte = "Je connais beaucoup de monde, dont : ";
		for (int i=0; i<nbConnaissance; i++) {
			texte += connaissances[i].getNom();
			if (i<nbConnaissance-1) {
			texte += ", ";
			}
		}
		parler(texte);
	}
}
