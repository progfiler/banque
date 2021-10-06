package fr.banque;

public class Main {

    public static void main(String[] args) throws BanqueException {
        Client antoine = new Client("Fissot", "Antoine", 36, 25441);
        Compte cas = new CompteASeuil(124, 200d, 100d);
        Compte cr = new CompteRemunere(352, 60000d, 0.2);
        Compte cras = new CompteASeuilRemunere(555, 60000d, 0.2, 20000d);
        antoine.ajouterCompte(cas);
        antoine.ajouterCompte(cr);
        antoine.ajouterCompte(cras);
//        System.out.println("CAS");
//        antoine.getCompte(124).retirer(150d);
//        antoine.getCompte(124).ajouter(500d);
//        System.out.println(antoine.getCompte(124).getSolde());
//        antoine.getCompte(124).retirer(150d);
//        System.out.println(antoine.getCompte(124).getSolde());
//
//        System.out.println(antoine.getCompte(352).getSolde());
//        CompteRemunere cr2 = (CompteRemunere) antoine.getCompte(352);
//        cr2.verserInterets();
//        System.out.println(antoine.getCompte(352).getSolde());

//        Double solde = antoine.getCompte(555).getSolde();
        try {
            antoine.getCompte(555).retirer(6000d);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
//        System.out.println(antoine.getCompte(555).getSolde());
//        CompteRemunere T = (CompteRemunere) antoine.getCompte(555);
//        T.verserInterets();
//        System.out.println(antoine.getCompte(555).getSolde());

    }
}
