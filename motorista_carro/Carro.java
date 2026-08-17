public class Carro {
    private String modelo;
    private int ano;
    private Motor motor;
    private Motorista motorista;

    public Carro(String modelo, int ano, Motor motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.modelo + " | Ano: " + this.ano);
        if (this.motor != null) {
            this.motor.exibirMotor();
        }
        if (this.motorista != null) {
            System.out.println("Motorista associado: " + this.motorista.getNome());
        }
    }

    public Carro compararAno(Carro outroCarro) {
        if (outroCarro == null) return this;
        return (this.ano >= outroCarro.getAno()) ? this : outroCarro;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void substituirMotor(Motor novoMotor) {
        this.motor = novoMotor;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public Motorista getMotorista() { return motorista; }
    public void setMotorista(Motorista motorista) { this.motorista = motorista; }
    public void setMotor(Motor motor) { this.motor = motor; }
}