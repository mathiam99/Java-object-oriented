package JavaOOP;

public class Personne {
    CompteBanque compte = new CompteBanque();
    public String nom;
    
    //Création du constructeur de classe
    public Personne(String nom){
        this.nom = nom;
    }
    
    public Float ConsulterSolde(CompteBanque compte){
        System.out.println("Le montant disponible sur votre compte est : "+this.compte.montant);
        return this.compte.montant;
    }
    
    public Float FaireUnDepot(CompteBanque compte, float montant){
        this.compte.montant += montant;
        System.out.println(this.nom + " a fait un depot de " + this.compte.montant);
        return montant;
    }
    
    public Float FaireUnRetrait(CompteBanque compte, float montant){
        float nouveaumontant = this.compte.montant;
        nouveaumontant = nouveaumontant - montant;
        this.compte.montant = nouveaumontant;
        System.out.println(this.nom + " a fait un retrait de " + montant);
        return nouveaumontant;
    }
}
