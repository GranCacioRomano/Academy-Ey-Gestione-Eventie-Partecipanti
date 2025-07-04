package EsercizioNumero5;

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