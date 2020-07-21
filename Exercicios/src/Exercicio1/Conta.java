package Exercicio1;
public class Conta {

    private double agencia;
    private double numeroConta;
    private double saldo;

    public Conta(double agencia, double numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso: saque:"+valor+" saldo atual:"+this.saldo);
            } else {
                System.out.println("Saldo insuficiente para saque: saque:"+valor+" saldo atual:"+this.saldo);
            }
        } else {
            System.out.println("Valor invalido para saque: saque:"+valor+" saldo atual:"+this.saldo);
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso: deposito:"+valor+" saldo atual:"+this.saldo);
        } else {
            System.out.println("Valor invalido para deposito: deposito:"+valor+" saldo atual:"+this.saldo);
        }
    }

}