package Exercicio5;

public class PenaMosquito implements Escrevente {

    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito() {
        this.ehFeitoDe = "Metal";
        this.escreveCom = "Nanquim";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com "+this.escreveCom);
    }
}
