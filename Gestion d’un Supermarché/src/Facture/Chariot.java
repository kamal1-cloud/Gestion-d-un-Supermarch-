package Facture;

import java.util.ArrayList;

public class Chariot {
    private ArrayList<Achat> chario = new ArrayList<Achat>();

    public void remplir(Article art, int qnt){
        Achat ach = new Achat(art, qnt);
        chario.add(ach);
    }

    // return la liste des achat au caisse;
    public ArrayList<Achat> getChario() {
        ArrayList<Achat> ch = new ArrayList<Achat>(chario);
        return ch;
    }
}
