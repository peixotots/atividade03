public class Gerente extends FuncionariosAdministrativos {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        super.trabalhar();
        gerenciarEquipe();
    }

    public void gerenciarEquipe(){
        System.out.println("Gerenciando equipe...");
        System.out.println();
    }

    @Override
    public void calcularBonus(double percentual){
        super.calcularBonus(0.01);
    }

}