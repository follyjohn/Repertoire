

public class Contact {

	private String nom;
	private String prenom;
	private int indict;
	private int numero;

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getIndict() {
		return indict;
	}

	public int getNumero() {
		return numero;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setIndict(int indict) {
		this.indict = indict;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Contact(String nom, String prenom, int indict, int numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.indict = indict;
		this.numero = numero;
	}

	public Contact(String nom, int indict, int numero) {
		this.nom = nom;
		this.indict = indict;
		this.numero = numero;
	}

	public Contact(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	public Contact() {
		this.nom = "nom";
		this.numero = 000;
	}

	public void affiche() {
		System.out.println("\nNom : " + this.nom + ", Numero : " + this.numero);
	}

}