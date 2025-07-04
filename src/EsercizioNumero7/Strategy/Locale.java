package EsercizioNumero7.Strategy;

public class Locale implements StrategiaSalvataggio{

    @Override
    public void salvataggio(String content) {
        System.out.println("Salvato in locale" + content);
    }
}
