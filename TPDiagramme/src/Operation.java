
import java.util.*;

public class Operation {

    public double Montant;
    public Date date;
    
    public Operation(double omontant, Date odate) {
    	Montant = omontant;
    	date = odate;
    }
    
    public void Afficher() {
        System.out.print("Operation : Montant : " + this.Montant + " Date : " + this.date);
    }

}