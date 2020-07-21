package Exercicio5;

public class Lapis implements  Escrevente{

    private String ehFeitoDe;
    private String escreveCom;

    public Lapis() {
        this.ehFeitoDe = "Madeira";
        this.escreveCom = "Grafite";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com "+this.escreveCom);
    }

}