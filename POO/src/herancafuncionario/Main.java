package herancafuncionario;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(faxineiro);


    }
}
