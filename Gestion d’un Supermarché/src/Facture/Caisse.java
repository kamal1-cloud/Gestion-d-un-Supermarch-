package Facture;

public class Caisse {

    private int numdecaisse;
    private double montantinitial;

    public Caisse(int numdecaisse, double montantinitial) {
        this.numdecaisse = numdecaisse;
        this.montantinitial = montantinitial;
    }



    public void scanner(Chariot chr) {
        int qnt;
        double prix;
        double sld;
        double finalVal;
        System.out.println("************************************");
        System.out.println("Numero de la caisse:" + this.numdecaisse);
        for (Achat ch: chr.getChario()){
            qnt = ch.getQnt_achete();
            prix = ch.getArticle_achete().getPrix();
            sld = ch.getArticle_achete().getSoldeVal();

            if (ch.getArticle_achete().isSolde()){
                finalVal = (qnt * prix) - ((prix * sld) * qnt);

            }else{
                finalVal = (qnt * prix);
            }
            System.out.println(ch.getArticle_achete().getNom() + ": " + prix + " x " + qnt + " = " + finalVal);
            this.montantinitial += finalVal;
        }
        System.out.println("**************************************************");

    }
    // le montant total des achats
    public void montantTotal(){

        System.out.println( "La caisse"+" "+numdecaisse+" "+"a encaissé "+(Math.round(montantinitial * 100.0) / 100.0 )+ " MAD");
    }

}
