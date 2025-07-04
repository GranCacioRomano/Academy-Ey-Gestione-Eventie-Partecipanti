package EsercizioNumero5;

public class PasswordLogin implements LoginStrategy{

    @Override
    public boolean login(String nomeUtente, String credenziale) {
        System.out.println("Login con password");
        return "utente".equals(nomeUtente) && "123".equals(credenziale);
    }
}
