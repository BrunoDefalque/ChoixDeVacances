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

			System.out.println("Tu as de la chance, il faudra prévoir lunettes de soleil et crème solaire !");

			if (_budget <= 1000) {

				System.out.println("test");
			}
		}

		else if (meteo.equals("froid")) {

			System.out.println(" tu as de la chance ! Tu vas certeinement skier :-) prévois quand même écharpe et bonnet");
		}

		else if (meteo.equals("tempéré")) {

			System.out.println(" tu as de la chance, tu vas découvrir des musées et des promenades ! Prévois quand même des bonnes chaussures de marche !");
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