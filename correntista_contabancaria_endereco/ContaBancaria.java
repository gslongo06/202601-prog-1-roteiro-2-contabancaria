public class ContaBancaria {
    private int numero;
    private double saldo;
    private Correntista correntista;

    // Getters e Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public Correntista getCorrentista() {
        return this.correntista;
    }

    // Métodos do Diagrama
    public void exibirDetalhes() {
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo: R$ " + this.saldo);
        if (this.correntista != null) {
            System.out.println("Titular: " + this.correntista.getNome());
        }
    }

    public boolean comparaSaldo(ContaBancaria outraConta) {
        if (outraConta == null) return false;
        return this.saldo == outraConta.getSaldo();
    }
}