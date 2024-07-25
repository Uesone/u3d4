package Esercizio;

public class Volontario implements CheckInInterface {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println(nome + " ha iniziato il suo servizio.");
    }
}
