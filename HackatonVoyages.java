/**
 * HackatonVoyages
 */
public class HackatonVoyages {

	public static void main(String[] args) {
		ChoixDestination();
	}

	static void ChoixDestination() {

		String p;

		if (p.equals("chaud")) {

			System.out.println("Tu as de la chance, il faudra prévoir lunettes de soleil et crème solaire !");
		}

		else if (p.equals("froid")) {

			System.out.println(" tu as de la chance ! Tu vas certeinement skier :-) prévois quand même écharpe et bonnet");
		}

		else if (p.equals("tempéré")) {

			System.out.println(" tu as de la chance, tu vas découvrir des musées et des promenades ! Prévois quand même des bonnes chaussures de marche !");
		}
	}
}