package histoire;

import personnages.Yakuza;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Samurai;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();

		yaku.direBonjour();
		
		Samurai akimoto = new Samurai("Akimoto", "saké", 80, "Miyamoto");
		akimoto.direBonjour();
		akimoto.boire("du thé");
		
		
		
		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
	}
}
