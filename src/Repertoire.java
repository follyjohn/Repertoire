

import java.util.Scanner;

public class Repertoire {
	public static void main(String[] args) {

		Contact[] tableau;
		tableau = new Contact[100];

		tableau[0] = new Contact("John", 92600893);
		tableau[1] = new Contact("Luc", 90747474);
		tableau[2] = new Contact("Claire", 90749090);

		int id = 3;
		int i;
		int reponse;

		System.out.println("#### Bienvenu  ####");

		do {

			reponse = choix();

			if (reponse == 2) {

				Contact contact = new Contact();

				for (i = 0; i < id; i++) {
					contact = tableau[i];
					contact.affiche();
				}
				
			} else if (reponse == 1) {

				tableau[id] = ajoute();
				id++;
			} else if (reponse > 2 || reponse < 0)
				reponse = choix();

		} while (reponse != 0);

	}

	public static int choix() {
		int cx;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n  Veillez Choisir une action =>\n ");
		System.out.println("  2 : Pour afficher la liste de vos contacts");
		System.out.println("  1 : Pour ajouter un nouveu contact");
		System.out.println("  0 : Pour quitter");

		System.out.print("\n====> : ");

		cx = sc.nextInt();

		return cx;
	}

	public static Contact ajoute() {

		Scanner sc = new Scanner(System.in);

		String nom;
		int num;

		System.out.print("Entrer le nom : ");
		nom = sc.nextLine();
		System.out.print("Entrer le numero : ");
		num = sc.nextInt();

		Contact tmp = new Contact(nom, num);
		return tmp;
	}

}