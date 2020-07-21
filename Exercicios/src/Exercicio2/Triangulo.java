package Exercicio2;

public class Triangulo {
	   private double base;
	    private double altura;

	    public Triangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    public double area() {
	        return (this.base * this.altura) / 2;
	    }
	}
