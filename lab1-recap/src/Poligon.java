import java.util.ArrayList;
import java.util.List;

public class Poligon {
    private List<Punct> varfuri;

    public Poligon() {
        this.varfuri = new ArrayList<>();
    }

    public void adaugaVarf(Punct p) {
        varfuri.add(p);
    }
    public double calculeazaPerimetrul() {
        double perimetru = 0.0;
        for (int i = 0; i < varfuri.size(); i++) {
            Punct punctCurent = varfuri.get(i);
            Punct punctUrmator = varfuri.get((i + 1) % varfuri.size());
            double distanta=punctCurent.distanta(punctUrmator);
            System.out.println("Distanța dintre " + punctCurent + " și " + punctUrmator + " este: " + distanta);
            perimetru += distanta;
        }
        return perimetru;
    }


/*
    public double calculeazaPerimetrul() {
        double perimetru = 0.0;
        for (int i = 0; i < varfuri.size(); i++) {
            Punct punctCurent = varfuri.get(i);
            Punct punctUrmator = varfuri.get((i + 1) % varfuri.size()); // Ultimul punct se conectează la primul
            double distanta = punctCurent.distanta(punctUrmator);
            System.out.println("Distanța dintre " + punctCurent + " și " + punctUrmator + " este: " + distanta);
            perimetru += distanta;
        }
        return perimetru;
    }*/

    public void afisareVarfuri() {
        for (int i = 0; i < varfuri.size(); i++)
        {
            System.out.print(varfuri.get(i).toString());
        }
    }
}

