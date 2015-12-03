
import java.util.*;

public class Banque {

	public String nomBanque;
	public List<ComptesBancaires> ListCb;
	
    public Banque(String bnomBanque) {
    	nomBanque = bnomBanque;
    }

    public ComptesBancaires CreerCompteBancaire(CarteBancaire cartebancaire, double Solde, int numero) {
        ComptesBancaires cb = new ComptesBancaires(cartebancaire, Solde, numero);
        ListCb.add(cb);
        return cb;
    }
    
    public ComptesBancaires ChercherCompte(ComptesBancaires cbrecherche) {
        for(ComptesBancaires cb : ListCb)
        {
        	if(cb.equals(cbrecherche))
        	{
        		return cb;
        	}
        }
        return cbrecherche;
    }

    public void AfficherSoldeCompte(ComptesBancaires cb) {
    	System.out.print(cb.getSolde());
    }

}