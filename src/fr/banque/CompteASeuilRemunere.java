package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil{

    private Double seuil;
    //region Constructeurs
    public CompteASeuilRemunere(Double seuil) {
        this.seuil = seuil;
    }
    public CompteASeuilRemunere(Integer numero, Double solde, Double taux, Double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }
    //endregion

    //region Getters Setters
    @Override
    public Double getSeuil() {
        return this.seuil;
    }

    @Override
    public void setSeuil(Double unSeuil) {
        this.seuil = unSeuil;
    }
    //endregion

}
