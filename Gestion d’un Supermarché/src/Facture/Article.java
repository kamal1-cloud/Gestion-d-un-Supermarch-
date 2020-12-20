package Facture;

public class Article {

    private String nom;
    private double prix;
    private boolean solde;
    private double soldeVal;

    public Article(String nom, double prix, boolean solde) {
        this.nom = nom;
        this.prix = prix;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isSolde() {
        return solde;
    }

    public void setSolde(boolean solde) {
        this.solde = solde;
    }

    public double getSoldeVal() {
        return soldeVal;
    }

    public void setSoldeVal(double soldeVal) {
        this.soldeVal = soldeVal;
    }

    public boolean afficher(){
        if (solde == true){
        System.out.println(nom+" "+"="+" "+prix+" "+"MAD"+" "+"(en solde)");
    }
        else{
        System.out.println(nom+" "+"="+" "+prix+" "+"MAD"+" "+"(non solde)");
    }

        return false;
    }

}