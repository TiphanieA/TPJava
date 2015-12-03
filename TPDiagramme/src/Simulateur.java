public class Simulateur {

	public Banque banque;
	public Societe societe;
	public Personne personne;

    public Simulateur(Banque sBanque, Societe ssociete, Personne spersonne) {
		banque = sBanque;
		personne = spersonne;
		societe = ssociete;
    }
	
    public void AfficherNomBanque() {
        System.out.print(this.banque.nomBanque);   
    }

    public void EffectuerRetrait(double somme) {
        personne.comptebancaire.DebiterCompte(somme);
    }

    public void EffectuerVirement(double somme) {
        personne.comptebancaire.CrediterCompte(somme);
    }


    public void AfficherNomSociete() {
    	System.out.print(this.societe);   
    }

    public void CreerPersonne(String nom, String prenom, ComptesBancaires cb) {
        Personne p  = new Personne(nom, prenom, cb);
    }

    public void CreerBanque(String nom) {
    	Banque b = new Banque(nom);
    }

    public void CreerSociete(String nomsociete) {
        Societe s = new Societe(nomsociete);
    }

}