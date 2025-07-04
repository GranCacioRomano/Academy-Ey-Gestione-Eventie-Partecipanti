package EsercizioNumero2;

import EsercizioNumero2.factory.CartaFactory;
import EsercizioNumero2.factory.CryptoFactory;
import EsercizioNumero2.factory.PagamentoFactory;
import EsercizioNumero2.factory.PayPalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double importo = 10.00;

        int scelta;
        do {
            System.out.println("=== Checkout E-commerce ===");
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
                // inserire qui il sistema di checkout .eseguiPagamento(factory, importo);
                System.out.println();
            }

        } while (scelta != 0);

        scanner.close();
    }
}
