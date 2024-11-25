package hu.szamalk;

import java.util.ArrayList;
import java.util.Collections;

public class Konyv {
    private String cim;
    private ArrayList<String> szerzok;
    private int kiadas_ev, ar;
    private boolean kolcsonozheto;


    public Konyv(String cim, ArrayList<String> szerzok, int kiadas_ev, int ar, boolean kolcsonozheto) {
        this.cim = cim;
        this.szerzok = szerzok;
        this.kiadas_ev = kiadas_ev;
        this.ar = ar;
        this.kolcsonozheto = kolcsonozheto;
    }

    public Konyv(String cim, ArrayList<String> szerzok, int kiadas_ev, int ar) {
        this(cim, szerzok, kiadas_ev, ar, true);
    }

    public Konyv(String cim, String szerzo, int kiadas_ev, int ar, boolean kolcsonozheto) {
        this(cim, new ArrayList<>(), ar, kiadas_ev);
        this.szerzok.add(szerzo);
    }

    public Konyv(String cim, String szerzo, int kiadas_ev, int ar) {
        this(cim, szerzo, kiadas_ev, ar, true);
    }

    public String getCim() {
        return cim;
    }

    /*
    public ArrayList<String> getSzerzok() {
        return Collections.unmodifiableList(szerzok);
    }
     */

    public int getKiadas_ev() {
        return kiadas_ev;
    }

    public int getAr() {
        return ar;
    }

    public boolean isKolcsonozheto() {
        return kolcsonozheto;
    }


    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKolcsonozheto(boolean kolcsonozheto) {
        this.kolcsonozheto = kolcsonozheto;
    }


    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzok=" + szerzok +
                ", kiadas_ev=" + kiadas_ev +
                ", ar=" + ar +
                ", kolcsonozheto=" + kolcsonozheto +
                '}';
    }
}
