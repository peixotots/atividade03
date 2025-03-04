public class Desenvolvedor extends FuncionariosTecnicos {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        super.trabalhar();
        escreverCodigo();
    }

    public void escreverCodigo(){
        System.out.println("Escrevendo código...");
        System.out.println();
    }

    public void escreverCodigo(String linguagem){
        System.out.println("Escrevendo código em " + linguagem);
    }

}