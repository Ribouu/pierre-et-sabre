package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = reputation;
		// TODO Auto-generated constructor stub
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
				argent + " sous dans ma poche. Hi ! Hi !");
	}

}
