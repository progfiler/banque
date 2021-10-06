package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil{
    private Double seuil;

    public Double getSeuil() {
        return this.seuil;
    }

    public void setSeuil(Double seuil) {
        this.seuil = seuil;
    }

    public CompteASeuil() {
    }

    public CompteASeuil(Integer numero, Double solde, Double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                "seuil=" + seuil +
                '}';
    }

    @Override
    public void retirer(Double unMontant) throws BanqueException{
        if(this.getSolde()-unMontant > this.getSeuil()){
            super.retirer(unMontant);
        }else{
            throw new BanqueException("Impossible de retirer de l'argent. Veuillez alimenter votre compte.");
        }
    }
}
