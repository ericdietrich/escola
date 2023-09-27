package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        //  MOCK -> Mockito (poderia ser utilizado)
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDTO dados = new MatricularAlunoDTO("Eric", "111.111.111-11", "gmail@gmail.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("111.111.111-11"));

        assertEquals("Eric", encontrado.getNome());
        assertEquals("111.111.111-11", encontrado.getCpf());
        assertEquals("gmail@gmail.com", encontrado.getEmail());
    }

}