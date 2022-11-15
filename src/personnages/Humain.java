package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance;
	
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
	
}
