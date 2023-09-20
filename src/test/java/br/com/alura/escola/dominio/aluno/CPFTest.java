package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {
    @Test
    void NaoDeveriaCriarCPFsComValorInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678912"));
    }
    @Test
    void deveriaPermitirCriarCFPComNumeroValido (){
        String numero = "123.456.789-01";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}