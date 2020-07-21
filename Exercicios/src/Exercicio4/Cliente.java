package Exercicio4;

	public class Cliente extends Pessoa {

	    private String cpf;

	    public Cliente(String nome, int idade, String cidadeNascimento, String cpf) {
	        super(nome, idade, cidadeNascimento);
	        this.cpf = cpf;
	    }

	    public void exibirDados() {
	        super.exibirDados();
	        System.out.println("*** Dados de Cliente ***");
	        System.out.println("CPF:"+this.cpf);
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	}
