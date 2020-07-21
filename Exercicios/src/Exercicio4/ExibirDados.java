package Exercicio4;

public class ExibirDados {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nathan", 22, "Embu das Artes", "123.123.123.12");
        cliente.exibirDados();
        Funcionario funcionario = new Funcionario("Nathanael", 22, "Embu das Artes", 12345);
        (funcionario).exibirDados();
    }
}
