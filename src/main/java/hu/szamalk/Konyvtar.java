package hu.szamalk;

import java.util.ArrayList;

public class Konyvtar {
    private ArrayList<Konyv> konyvek;

    public Konyvtar() {
        this(new ArrayList<>());
    }

    public Konyvtar(ArrayList<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public void ujKonyv(Konyv konyv){
        konyvek.add(konyv);
    }

    public void run(){
        for(Konyv konyv : konyvek){
            System.out.println(konyv);
        }
    }

    /*
    konyvek = new ArrayList<>();
        konyvek.add(new Konyv("Rókarudi", "Rókarudi", 2000, 5000));
        konyvek.add(new Konyv("RudiRoka", "Rudiroka", 2010, 10000, false));
        konyvek.add(new Konyv("Rókarudi csodája", "Rókarudi", 2020, 8000, false));
     */

}
