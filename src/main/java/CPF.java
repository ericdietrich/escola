public class CPF {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public CPF(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }
}