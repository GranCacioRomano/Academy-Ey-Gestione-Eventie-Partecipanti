package EsercizioNumero5;

public class CreaPasswordLogin extends LoginFactory {

    @Override
    public LoginStrategy creaLogin() {
        return new PasswordLogin();
    }
}
