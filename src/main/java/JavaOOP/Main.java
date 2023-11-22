package JavaOOP;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creation de l'objet Personne Moussa
        Personne Moussa = new Personne("Moussa");
        //Creation de l'objet CompteBanque compte
        CompteBanque compte = new CompteBanque();
        //Verification du solde initial du compte
        Moussa.ConsulterSolde(compte);
        //Depét de 10000 sur le compte bancaire
        Moussa.FaireUnDepot(compte, 10000);
        Moussa.FaireUnDepot(compte, 30000);
        //Verification du nouveau solde sur le compte bancaire. Should return 10000
        Moussa.ConsulterSolde(compte);
        //Retrait de 6000
        Moussa.FaireUnRetrait(compte, 6000);
        //Verification du nouveau solde sur le compte bancaire. Should return 4000
        Moussa.ConsulterSolde(compte);
    }
}
