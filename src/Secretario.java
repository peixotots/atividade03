public class Secretario extends FuncionariosAdministrativos {

    public Secretario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        super.trabalhar();
        organizarReuniao();
    }

    public void organizarReuniao() {
        System.out.println("Organizando reunião...");
        System.out.println();
    }

}
