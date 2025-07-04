package EsercizioNumero5;

public class TokenLogin implements LoginStrategy{
    @Override
    public boolean login(String nomeUtente, String token) {
        System.out.println("Login con token");
        return "TOKEN123".equals(token);
    }
}

