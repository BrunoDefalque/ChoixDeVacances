import java.util.Scanner;x

/**
 * HackatonVoyages
 */
public class HackatonVoyages {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ChoixDestination();

	}

	static void ChoixDestination() {
		MeteoComparaisonPrix();

	//	MeteoChoisie();
	}

	static int MeteoChoisie() {

		System.out.println(" Bonjour visiteur, bienvenue sur notre application international Travel by Plane International…\n" +
		"Voulez-vous commencer une simulation pour une proposition de voyage ?\n" +
		"Si oui, tapez 1, si non, tapez n'importe quelles autres chiffres !!");

		int _choixUtilisateur = input.nextInt();

		if (_choixUtilisateur == 1) {
		System.out.println("je vais vous poser quelques questions pour vous trouver un vol qui va vous satisfaire :-)\n" +
		 "Si vous comptez partir plutôt à la neige pour faire du ski ou des bataille de boules de neiges, dans ce cas, tapez 1\n" +
		"Par contre, si vous êtes plus bronzette avec plein de soleil, alors, tapez 2\n" +
		"Si entre ces proposition, rien ne vous arrange ! Pour des visites de musées, promenades etc. Tapez 3 !!"); 

		int _meteo = input.nextInt();

		switch (_meteo) {
			case 1:
			System.out.println("neige");
				break;

				case 2:
				System.out.println("soleil");
				break;

				case 3:
				System.out.println("promenade");
				break;
		
				default:
				System.out.println("Vous devez tapez sur les touches 1, 2 ou 3 uniquement\n" +
				"En effet, la touche " + _meteo + " n'est pas un bon choix !!");
				break;
		}

		return _meteo;
	}
//En haut, fermeture de if _choixUtlisateur et en bas return et au revoir en string

else {

		System.out.println("Au revoir visiteur");
		return _choixUtilisateur;
	}
		
	}

	static int MeteoComparaisonPrix() {

		int _choixMeteo = MeteoChoisie();

		if (_choixMeteo == 1) {

			System.out.println("Vous avez décidé de partir à la neige, c'est bien ça ?" +
			"Si oui, tapez 1, si non, tapez n'importe quelles autres chiffres !!");

			ConfirmationUtlisateur();
		}

		if (_choixMeteo == 2) {

			System.out.println("Vous avez décidé de partir au soleil, c'est bien ça ?" +
			"Si oui, tapez 1, si non, tapez n'importe quelles autres chiffres !!");

			ConfirmationUtlisateur();
		}

		if (_choixMeteo == 3) {

			System.out.println("Vous avez décidé de partir en promenade, c'est bien ça ?" +
			"Si oui, tapez 1, si non, tapez n'importe quelles autres chiffres !!");

			ConfirmationUtlisateur();
		}
		return _choixMeteo;
	}

	static int ChoixPrixVoyage() {

		System.out.println(" très bien, je vais vous proposer des fourchette de prix\n" +
				"Entre 500 et 1000 €, Tapez sur la touche 1 !!\n" +
				"Entre 1001 et 1500 €, Tapez sur la touche 2 !!\n" +
				" et enfin, entre 1501 et 2000 €, Tapez sur la touche 3 !!");

				int _choixFourchettePrix = input.nextInt();

				if (_choixFourchettePrix == 2) {

					System.out.println("Vous avez choisi la fourchette entre 500 et 1000 €, c'est bien ça ?");

					ConfirmationUtlisateur();

					System.out.println(" OK super, voici les propositions de Vacances :");
				}

				else if (_choixFourchettePrix == 2) {

					System.out.println("Vous avez choisi la fourchette entre 1001 et 1500 €");
				}

				else if (_choixFourchettePrix == 3) {

					System.out.println("Vous avez choisi la fourchette entre 1501 et 2000 €");
				}
				else {
										System.out.println("Pour la fourchette de prix, vous devez choisir les chiffres 1, 2 ou 3 !!!");
									}

									return _choixFourchettePrix;
	}

	static int ConfirmationUtlisateur() {

		int _confirmation = input.nextInt();

			if (_confirmation == 1) {
				ChoixPrixVoyage();
			}
			else {
				System.out.println("Merci visiteur, si vous voulez recommencer, il faut recharger la page !");
			}

			return _confirmation;
	}
}