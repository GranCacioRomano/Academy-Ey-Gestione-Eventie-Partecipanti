package EsercizioNumero5;

public class SocialLogin implements LoginStrategy{
    @Override
    public boolean login(String nomeUtente, String social) {
        System.out.println("Login con social");
        return "SOCIAL".equals(social);
    }
}
