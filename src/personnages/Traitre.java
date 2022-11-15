package personnages;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;

public class Traitre extends Samurai{
	private int niveauTraitrise;
	Random rand = new Random();
	
	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconne = commercant.getArgent() * 2/10;
			commercant.perdreArgent(argentRanconne);
			gagnerArgent(argentRanconne);
			parler(commercant.getNom() + ", si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconne + " sous ou gare à toi !");
			commercant.parler("Tout de suite, grand " + getNom() + ".");
			niveauTraitrise++;
		} else {
			parler("Mince, je ne peux plus ranconner personne sinon un samurai risque de me démasquer !");
		}
	}
	public void faireLeGentil() {
		int nbConnaissances = getNbConnaissances();
		
		if (nbConnaissances>0) {
			Humain[] listeConnaissances = getListeConnaissances();
			int n = rand.nextInt(nbConnaissances);
			int don = getArgent() * 1/20;
			Humain ami = listeConnaissances[n];
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami-ami avec " + ami.getNom() + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			perdreArgent(don);
			ami.gagnerArgent(don);
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise>1) {
				niveauTraitrise--;
			}
		} else {
			parler("Je ne peux faire ami-ami avec personne car je ne connais personne ! Snif.");
		}
		
	}
	
}
