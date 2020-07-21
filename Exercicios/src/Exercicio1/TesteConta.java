package Exercicio1;

public class TesteConta {
		    public static void main(String[] args) {
		        Conta cc = new Conta(1, 1, 1000);
		        cc.deposito(100);

		        Conta cc2 = new Conta(1, 2, 2000);
		        cc2.saque(500);

		        Conta cc3 = new Conta(2, 1, 100);
		        cc3.saque(500);
		    }		
	}

