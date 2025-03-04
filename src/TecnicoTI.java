public class TecnicoTI extends FuncionariosTecnicos {

    public TecnicoTI(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        super.trabalhar();
        manterSistema();
    }

    public void manterSistema(){
        System.out.println("Realizando manutenção do sistema...");
        System.out.println();
    }

}
