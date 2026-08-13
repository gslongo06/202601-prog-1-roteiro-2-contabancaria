package app_conta;
public class App {
    public static void main(String[] args) throws Exception {
        
        Conta c1 = new Conta();
        //c1.setNumero("1234");
        c1.numero = "Rodrigo";
        System.out.println(c1.getNumero());
        Conta c2 = new Conta();
        c2.setNumero("4321");
        System.out.println(c2.getNumero());
        
    }
}
