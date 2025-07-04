package EsercizioNumero5.Factory;

import EsercizioNumero5.Strategy.LoginStrategy;
import EsercizioNumero5.Strategy.SocialLogin;

public class CreaSocialLogin extends LoginFactory{
    @Override
    public LoginStrategy creaLogin() {
        return new SocialLogin();
    }
}
