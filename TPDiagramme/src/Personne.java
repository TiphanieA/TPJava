

public class Personne {

    public String nomPersonne;
    public String PrenomPersonne;
    public ComptesBancaires comptebancaire;

    public Personne(String nomPersonne, String PrenomPersonne, ComptesBancaires comptebancaire) {
    	this.nomPersonne = nomPersonne;
    	this.PrenomPersonne = PrenomPersonne;
    	this.comptebancaire = comptebancaire;
    }
}