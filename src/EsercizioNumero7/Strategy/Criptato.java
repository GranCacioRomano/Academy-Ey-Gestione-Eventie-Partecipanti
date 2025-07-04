package EsercizioNumero7.Strategy;

public class Criptato implements StrategiaSalvataggio {

    @Override
    public void salvataggio(String content) {
        // Trova un modo stupido per criptarla.
        System.out.println("Salvato in forma criptata " + content);
    }
}
