package fr.banque;

public interface ICompteRemunere {
    Double calculerInterets();
    void verserInterets();
    Double getTaux();
    void setTaux(Double unTaux);
}
