package EsercizioNumero2;

import EsercizioNumero2.Facade.SistemaCheckout;
import EsercizioNumero2.Factory.CartaFactory;
import EsercizioNumero2.Factory.CryptoFactory;
import EsercizioNumero2.Factory.PagamentoFactory;
import EsercizioNumero2.Factory.PayPalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCheckout sistemaCheckout = new SistemaCheckout();
        Scanner scanner = new Scanner(System.in);
        double importo = 10.00;

        int scelta;
        do {
            System.out.println("Sistema di Pagamento E-commerce");
            System.out.println("1) Paga con Carta di Credito");
            System.out.println("2) Paga con PayPal");
            System.out.println("3) Paga con Criptovalute");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            PagamentoFactory factory = null;

            switch (scelta) {
                case 1 -> factory = new CartaFactory();
                case 2 -> factory = new PayPalFactory();
                case 3 -> factory = new CryptoFactory();
                case 0 -> System.out.println("Uscita.");
                default -> System.out.println("Scelta non valida.");
            }

            if (factory != null) {
                sistemaCheckout.eseguiPagamento(factory, importo);
                System.out.println();
            }

        } while (scelta != 0);

        scanner.close();
    }
}
