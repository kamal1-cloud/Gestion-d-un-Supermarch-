package Facture;

public class Achat {
    private Article article_achete;
    private int qnt_achete;
    public Achat(Article article_achete, int qnt_achete) {
        this.article_achete = article_achete;
        this.qnt_achete = qnt_achete;
    }
    public Article getArticle_achete() {
        return article_achete;
    }
    public int getQnt_achete() {
        return qnt_achete;
    }


}
