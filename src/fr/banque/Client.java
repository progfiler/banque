package fr.banque;

import java.util.*;

public class Client {
    String nom;
    String prenom;
    Integer age;
    Integer numero;
//    Compte[] comptes = new Compte[5];
    private Map<Integer, Compte> listeCompte = new HashMap<Integer, Compte>();
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

    public Map<Integer, Compte> getListeCompte() {
        return listeCompte;
    }

    public void setListeCompte(Map<Integer, Compte> listeCompte) {
        this.listeCompte = listeCompte;
    }

//endregion

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", listeCompte=" + listeCompte +
                '}';
    }


    /**
     * Permet d'ajouter un compte à notre liste de comptes
     * @param unCompte
     */
    public void ajouterCompte(Compte unCompte) {
        this.getListeCompte().put(unCompte.getNumero(), unCompte);
    }

    /**
     * Permet de récuperer un compte avec son numéro de compte
     * @param numeroCompte
     * @return Compte
     *
     */
    public Compte getCompte(Integer numeroCompte) {
        Compte compteCopy = null;
        for (Map.Entry<Integer, Compte> compte : listeCompte.entrySet())
        {
            if (compte.getValue().getNumero().doubleValue() == numeroCompte) {
                compteCopy = compte.getValue();
                break;
            }
        }
        if(compteCopy == null) {
            System.out.println("compte inconnu !");
        }
        return compteCopy;
    }
}


