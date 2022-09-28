/**
 * HackatonVoyages
 */
public class HackatonVoyages {

	public static void main(String[] args) {
		String fonctionName = args[0];
		if (fonctionName.equals("ChoixDestination")) {
			if(args.length >= 3) {
				
				String meteo = args[1];
				
				int budget = Integer.parseInt(args[2]);
				
				ChoixDestination(meteo, budget);

				//Date dateDepart = DateFormat.parse(args[3]);				
				//ChoixDestination(meteo, budget, dateDepart);
			}
			else {
				System.err.println("Il faut au moins 3 paramètres: meteo, budget et la date.");
			}
		}

	}

	static void ChoixDestination(String meteo, int _budget) {

	//	String p1 = "chaud";

		if (meteo.equals("chaud")) {

			System.out.println(" vous avez décidé de partir au soleil");

			if (_budget <= 10000) {

			System.out.println("Vous pouvez partir au Maroc, il y aura 30°C");
		}
		}

		else if (meteo.equals("froid")) {

			System.out.println("Vous avez décidé de partir dans un pays froid !!");

			if (_budget <= 10000) {

				System.out.println(" vous pouvez aller en Suisse il y aura 1 °C");
			}
		}

		else if (meteo.equals("tempéré")) {

			System.out.println(" vous avez décidé d'aller dans un pays tempéré");

			if (_budget <= 10000) {

				System.out.println(" vous pouvez aller en Angleterre il fera 15 °C");
			}
		} else {
			System.err.println("Destination '"+meteo+"' non connue.");
		}
	}

	static int Budget(int _budget) {

		if (_budget <= 1000) {

			System.out.println("test");
		}
		return _budget;
	}
}