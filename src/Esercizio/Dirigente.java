package Esercizio;

public class Dirigente extends Dipendente {

    public Dirigente(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * 2; // Supponiamo che un dirigente guadagni il doppio dello stipendio base
    }
}
