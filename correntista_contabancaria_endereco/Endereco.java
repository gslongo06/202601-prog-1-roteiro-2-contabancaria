public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    // Getters e Setters
    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método do Diagrama
    public String exibirEndereco() {
        return this.rua + ", nº " + this.numero + " - " + this.cidade;
    }
}