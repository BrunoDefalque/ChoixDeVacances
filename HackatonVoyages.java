/**
 * HackatonVoyages
 */
public class HackatonVoyages {

	public static void main(String[] args) {
		ChoixDestination(p1);
	}

	static void ChoixDestination() {

	//	String p1 = "chaud";

		if (p1.equals("chaud")) {

			System.out.println("Tu as de la chance, il faudra prévoir lunettes de soleil et crème solaire !");
		}

		else if (p1.equals("froid")) {

			System.out.println(" tu as de la chance ! Tu vas certeinement skier :-) prévois quand même écharpe et bonnet");
		}

		else if (p1.equals("tempéré")) {

			System.out.println(" tu as de la chance, tu vas découvrir des musées et des promenades ! Prévois quand même des bonnes chaussures de marche !");
		}
	}
}