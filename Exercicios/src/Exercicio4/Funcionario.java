package Exercicio4;
public class Funcionario extends Pessoa {

    private int numeroMatricula;



    public Funcionario(String nome, int idade, String cidadeNascimento, int numeroMatricula) {
    	   super(nome, idade, cidadeNascimento);
           this.numeroMatricula = numeroMatricula;
	}

	public void exibirDados() {
        super.exibirDados();
        System.out.println("*** Dados de Funcionario ***");
        System.out.println("numeroMatricula:"+this.numeroMatricula);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}