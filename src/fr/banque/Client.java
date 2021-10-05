package fr.banque;

import java.util.Arrays;

public class Client {
    String nom;
    String prenom;
    Integer age;
    Integer numero;
    Compte[] comptes = new Compte[5];

    //region Contructeurs
    public Client() {
    }

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }
    //endregion

    //region Getter Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
    //endregion

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }

    /**
     * Permet d'ajouter un compte à notre liste de comptes
     * @param unCompte
     */
    public void ajouterCompte(Compte unCompte) {
        Boolean addCompte = false;
        for (int i=0; i < this.getComptes().length; i++){
            if(this.getComptes()[i] == null){
                this.getComptes()[i] = unCompte;
                addCompte = true;
                break;
            }
        }
        if(!addCompte)
           System.out.println("Vous avez le max de compte.");
    }

    /**
     * Permet de récuperer un compte avec son numéro de compte
     * @param numeroCompte
     * @return Compte
     *
     */
    public Compte getCompte(Integer numeroCompte) {
        Compte compteCopy = null;
        for (Compte compte : this.getComptes()) {
            if (compte != null) {
                if(compte.getNumero().doubleValue() == numeroCompte) {
                    compteCopy = compte;
                    break;
                }
            }
        }
        if(compteCopy == null) {
            System.out.println("compte inconnu !");
        }
        return compteCopy;
    }
}


