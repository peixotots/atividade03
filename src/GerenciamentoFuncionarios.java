import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {

    private ArrayList<Funcionario> funcionarios;
    private Scanner scanner;

    public GerenciamentoFuncionarios() {
        this.funcionarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("#### MENU #### ");
            System.out.println("1. Cadastrar novo funcionário");
            System.out.println("2. Listar funcionários por tipo");
            System.out.println("3. Executar função principal de um funcionário");
            System.out.println("4. Encerrar programa");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> executarFuncaoPrincipal();
                case 4 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida! Por favor, escolha outra opção.");
            }
        } while (opcao != 4);
    }

    private void cadastrarFuncionario() {
        System.out.println("Selecione o tipo de funcionário pelo número:");
        System.out.println("1- Secretário, 2- Gerente, 3- Desenvolvedor, 4- Técnico de TI");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);
        switch (tipo) {
            case 1 -> funcionario = new Secretario(nome, salario);
            case 2 -> funcionario = new Gerente(nome, salario);
            case 3 -> funcionario = new Desenvolvedor(nome, salario);
            case 4 -> funcionario = new TecnicoTI(nome, salario);
            default -> System.out.println("Tipo inválido!");
        }

        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
        System.out.println();
    }

    private void listarFuncionarios() {
        System.out.println("FUNCIONÁRIOS ADMINISTRATIVOS");
        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionariosAdministrativos) {
                f.exibirInformacoes();
            }
        }

        System.out.println("FUNCIONÁRIOS TÉCNICOS");
        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionariosTecnicos) {
                f.exibirInformacoes();
            }
        }
    }

    private void executarFuncaoPrincipal() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionario.trabalhar();
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
        System.out.println();
    }

}

