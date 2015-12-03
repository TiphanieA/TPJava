
import java.util.*;

/**
 * 
 */
public class Societe {

	public String nomSociete;
	public ArrayList<Personne> ListP;
	
    public Societe(String snomSociete) {
    	nomSociete = snomSociete;
    }

    public void AfficherListeSalaries() {
        for(Personne p : ListP)
        {
        	System.out.println("Personne" + p.nomPersonne + p.PrenomPersonne);
        }
    }

    public void EmbaucherPersonne(Personne p) {
        ListP.add(p);
    }

    public void EffectuerVirementSalarie(double somme, Personne p) {
       for(Personne plist : ListP)
       {
    	   if(plist == p)
    	   {
    		   plist.comptebancaire.CrediterCompte(somme);
    	   }
       }
    }

}