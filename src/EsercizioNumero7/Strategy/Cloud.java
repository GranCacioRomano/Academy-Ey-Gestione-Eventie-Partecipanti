package EsercizioNumero7.Strategy;

public class Cloud implements StrategiaSalvataggio{
    @Override
    public void salvataggio(String content) {
        System.out.println("Salvato in cloud" + content);
    }
}
