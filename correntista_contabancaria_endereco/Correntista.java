public class Correntista {
    private String nome;
    private String cpf;
    private ContaBancaria conta;
    private Endereco endereco;

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public ContaBancaria getConta() {
        return this.conta;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    // Métodos do Diagrama
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Endereço: " + this.endereco.exibirEndereco());
        }
    }
}