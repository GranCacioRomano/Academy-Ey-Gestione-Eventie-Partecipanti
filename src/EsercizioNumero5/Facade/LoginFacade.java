package EsercizioNumero5.Facade;

import EsercizioNumero5.Factory.CreaPasswordLogin;
import EsercizioNumero5.Factory.CreaSocialLogin;
import EsercizioNumero5.Factory.CreaTokenLogin;
import EsercizioNumero5.Factory.LoginFactory;
import EsercizioNumero5.Strategy.LoginStrategy;

public class LoginFacade {

    public boolean eseguiLogin(String tipo, String utente, String credenziali)
    {
        LoginFactory factory;

        switch (tipo.toLowerCase())
        {
            case "password":
                factory = new CreaPasswordLogin();
                break;
            case "token":
                factory = new CreaTokenLogin();
                break;
            case "social":
                factory = new CreaSocialLogin();
                break;
            default:
                return false;
        }

        LoginStrategy strategia = factory.creaLogin();
        return strategia.login(utente, credenziali);
    }
}