package correntista_contabancaria_endereco;

public class Correntista {

    private String nome;
    private String cpf;
    private ContaBancaria conta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public ContaBancaria getConta() {
        return conta;
    }
    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    // Associação Simples
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

    // Métodos que retornam objetos de outras classes
    public Correntista getCorrentista() {
    return correntista;
    }

    // Métodos que utilizam objetos de outras classes (Aprofundamento)
    public void atualizarEndereco(Endereco novoEndereco) {
    this.endereco = novoEndereco;
    }
}
