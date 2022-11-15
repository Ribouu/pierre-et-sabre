package histoire;

import personnages.Yakuza;
import personnages.Samurai;

public class HistoireTP5 {
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		yaku.direBonjour();
		
		Samurai akimoto = new Samurai("Akimoto", "saké", 80, "Miyamoto");
		akimoto.direBonjour();
		akimoto.boire("du thé");
	}
}
