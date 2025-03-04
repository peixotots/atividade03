public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("Trabalhando...");
        calcularBonus(0.001);
    }

    public void calcularBonus(double percentual){
        salario += salario * percentual;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
