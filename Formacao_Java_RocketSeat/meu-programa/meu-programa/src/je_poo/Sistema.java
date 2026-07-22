package je_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente theo = new Cliente("Theo Rondon");

        System.out.println(theo.limiteCredito);

        theo.solicitarLimiteCredito(200.0);
        System.out.println(theo.limiteCredito);

        theo.comprar(50.0);
        System.out.println(theo.limiteCredito);
    }
}
