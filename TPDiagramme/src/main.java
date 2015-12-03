
public class main {

	public static void main(String[] args) {
		Banque b = new Banque("Credit Mutuel");
		Societe s = new Societe("Tifli");
		CarteBancaire cbanc = new CarteBancaire(10, 10);
		Personne p = new Personne("Aubry", "Tiphanie", b.CreerCompteBancaire(cbanc, 1000, 215));

	}

}
