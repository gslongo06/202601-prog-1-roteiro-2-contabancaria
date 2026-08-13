package correntista_contabancaria_endereco;

public class ContaBancaria {

    private int numero;
    private double saldo;
    private Correntista correntista;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Correntista getCorrentista() {
        return correntista;
    }
    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
}
