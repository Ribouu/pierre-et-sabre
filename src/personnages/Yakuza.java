package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	public int gagnerReputation(int gain) {
		this.reputation += gain;
		return this.reputation;
	}
	public void extorquer(Commercant victime) {
		parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		String nomVictime = victime.getNom();
		parler(nomVictime + ", si tu tiens à la vie donne moi ta bourse !");
		int argentRecupere = victime.seFaireExtorquer();
		gagnerArgent(argentRecupere);
		parler("J'ai piqué les " + argentRecupere + " sous de " + nomVictime + ", ce qui me fait " +
				getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

	public void perdre() {
		int argentPerdu = getArgent();
		parler("J’ai perdu mon duel et mes "+ argentPerdu + " sous, snif... J'ai déshonoré le clan de "
				+ this.clan + ".");
		perdreArgent(argentPerdu);
		this.reputation--;
	}
	
	public void gagner(int gain) {
		this.reputation++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + this.clan + " ?"
				+ " Je l'ai dépouillé de ses " + gain + " sous.");
	}
}
