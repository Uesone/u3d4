package Esercizio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("R2D2", 3000, "PRODUZIONE");
        Dipendente d2 = new DipendentePartTime("C3PO", 20, "AMMINISTRAZIONE", 80);
        Dipendente d3 = new Dirigente("BB8", 5000, "VENDITE");

        List<Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);

        for (Dipendente d : dipendenti) {
            System.out.println(d.getMatricola());
        }

        Volontario v1 = new Volontario("Luke Skywalker", 25, "CV1");
        Volontario v2 = new Volontario("Han Solo", 30, "CV2");

        List<CheckInInterface> persone = new ArrayList<>();
        persone.addAll(dipendenti);
        persone.add(v1);
        persone.add(v2);

        for (CheckInInterface persona : persone) {
            persona.checkIn();
        }

        double totaleStipendi = 0;
        for (Dipendente d : dipendenti) {
            totaleStipendi += d.calculateSalary();
        }
        System.out.println("Totale stipendi: " + totaleStipendi);
    }
}
