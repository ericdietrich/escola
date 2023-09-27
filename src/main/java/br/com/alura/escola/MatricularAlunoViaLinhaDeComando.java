package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Eric";
        String cpf = "111.111.111-54";
        String email = "gmail@gmail.com";

        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();

        MatricularAluno matricular = new MatricularAluno(repositorio);
        matricular.executa(new MatricularAlunoDTO(nome,cpf,email));

    }
}
