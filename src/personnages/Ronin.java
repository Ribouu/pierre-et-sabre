package personnages;

public class Ronin extends Humain {

	private int honneur;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		parler(beneficiaire.getNom() + ", prend ces " + don + " sous.");
		perdreArgent(don);;
		beneficiaire.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			// Le Ronin gagne
			gagnerArgent(adversaire.getArgent());
			this.honneur++;
			parler("Je t'ai eu petit yakuza !");
			adversaire.perdre();
		} else {
			this.honneur--;
			int argentAvant = getArgent();
			perdreArgent(argentAvant);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentAvant);
		}
	}
}
