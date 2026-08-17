public class Motorista {
    private String nome;
    private Carro carro;
    private Endereco endereco;

    public Motorista(String nome, Carro carro, Endereco endereco) {
        this.nome = nome;
        this.carro = carro;
        this.endereco = endereco;
    }

    public void exibirMotoristaECarro() {
        System.out.println("Motorista: " + this.nome);
        if (this.endereco != null) {
            this.endereco.exibirEndereco();
        }
        if (this.carro != null) {
            this.carro.exibirDetalhes();
        }
    }

    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }

    public void mudarEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
}