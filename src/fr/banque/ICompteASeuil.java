package fr.banque;

public interface ICompteASeuil {
    void retirer(Double unMontant);
    Double getSeuil();
    void setSeuil(Double unSeuil);
}
