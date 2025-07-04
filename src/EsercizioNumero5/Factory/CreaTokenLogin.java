package EsercizioNumero5.Factory;

import EsercizioNumero5.Strategy.LoginStrategy;
import EsercizioNumero5.Strategy.TokenLogin;

public class CreaTokenLogin extends LoginFactory{
    @Override
    public LoginStrategy creaLogin() {
        return new TokenLogin();
    }
}
