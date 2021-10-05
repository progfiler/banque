package fr.banque;

public class Compte {
    Integer numero;
    Double solde;

    public Compte() {
    }

    public Compte(Integer numero, Double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    private void setSolde(Double solde) {
        this.solde = solde;
    }

    public void ajouter(Double unMontant) {
        this.solde += unMontant;
    }

    public void retirer(Double unMontant) {
        this.solde -= unMontant;
    }
}
