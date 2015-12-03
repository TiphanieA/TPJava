
import java.util.*;

//merci tyftyf ! =) 

public class CarteBancaire {

	public int CodePIN;
    public int Numero;
    
    public CarteBancaire(int cCodePin, int cNumero) {
    	CodePIN = cCodePin;
    	Numero = cNumero;
    }

    public boolean VerifierCodePin(int cp) {
        if(cp == this.CodePIN)
        {
        	return true;
        }
        return false;
    }

}