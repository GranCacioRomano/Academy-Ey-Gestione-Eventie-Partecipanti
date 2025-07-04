package EsercizioNumero5;

public class CreaSocialLogin extends LoginFactory{
    @Override
    public LoginStrategy creaLogin() {
        return new SocialLogin();
    }
}
