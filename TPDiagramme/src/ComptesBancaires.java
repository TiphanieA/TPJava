
import java.util.*;

/**
 * 
 */
public class ComptesBancaires {

	 public CarteBancaire cartebancaire;
	 public double Solde;
	 public int numero;
	 public ArrayList<Operation> Listop;

    public ComptesBancaires(CarteBancaire ccartebancaire, double cSolde, int cnumero) {
    	cartebancaire = ccartebancaire;
    	Solde = cSolde;
    	numero = cnumero;
    	Listop = new ArrayList<Operation>();
    }

    	
    public void AfficherOperations() {
        for(Operation op : Listop)
        {
              op.Afficher();
        }
    }

    public void DebiterCompte(double somme) {
    	this.Solde = this.Solde - somme;
    }

    public void CrediterCompte(double somme) {
        this.Solde = this.Solde + somme;
    }

    public double getSolde() {
        return this.Solde;
    }

    public int getNumero() {
        return this.numero;
    }

}