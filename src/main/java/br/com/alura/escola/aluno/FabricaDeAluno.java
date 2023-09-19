package br.com.alura.escola.aluno;

public class FabricaDeAluno {
    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf) ,nome, new Email(email));
        return this;
    }

    public FabricaDeAluno  comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar(){
        return this.aluno;
    }

    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno2 = fabrica.comNomeCPFEmail("Eric","123.345.567-89", "eric@gmail.com").comTelefone("23","123456789").criar();

        System.out.println(aluno2.getNome());
        //System.out.println(aluno2.getTelefones().toArray());
        System.out.println(aluno2.getCpf().getNumero());
        System.out.println(aluno2.getEmail());

    }
}
