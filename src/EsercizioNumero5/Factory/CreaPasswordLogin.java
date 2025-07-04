package EsercizioNumero5.Factory;

import EsercizioNumero5.Strategy.LoginStrategy;
import EsercizioNumero5.Strategy.PasswordLogin;

public class CreaPasswordLogin extends LoginFactory {

    @Override
    public LoginStrategy creaLogin() {
        return new PasswordLogin();
    }
}
