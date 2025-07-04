package EsercizioNumero5.Strategy;

public class TokenLogin implements LoginStrategy{
    @Override
    public boolean login(String nomeUtente, String token) {
        System.out.println("Login con token");
        return "TOKEN123".equals(token);
    }
}

