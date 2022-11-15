package personnages;

public class Samurai extends Ronin{
	private String seigneur;
	
	public Samurai(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + this.seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens, je vais prendre " + boisson);
	}
}
