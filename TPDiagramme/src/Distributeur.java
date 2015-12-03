
import java.util.*;

/**
 * 
 */
public class Distributeur {

    public String Localisation;
    
    public Distributeur(String Localisation) {
    	this.Localisation = Localisation;
    }

    public void RetirerEspece(double somme, ComptesBancaires cb) {
    	cb.DebiterCompte(somme);
    }

}