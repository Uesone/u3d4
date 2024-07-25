package Esercizio;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;

    public DipendentePartTime(String matricola, double stipendio, String dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * oreLavorate;
    }
}
