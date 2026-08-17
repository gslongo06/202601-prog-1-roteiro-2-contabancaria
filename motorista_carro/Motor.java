public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void exibirMotor() {
        System.out.println("Motor: " + this.tipo + " | Potência: " + this.potencia + " CV");
    }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}