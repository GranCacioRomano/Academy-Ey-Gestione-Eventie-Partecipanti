package EsercizioNumero5.Factory;

import EsercizioNumero5.Strategy.LoginStrategy;

public abstract class LoginFactory {
    public abstract LoginStrategy creaLogin();
}
