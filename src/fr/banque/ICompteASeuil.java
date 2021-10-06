package fr.banque;

public interface ICompteASeuil {
    void retirer(Double unMontant) throws BanqueException;
    Double getSeuil();
    void setSeuil(Double unSeuil);
}
