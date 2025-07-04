package EsercizioNumero5;

public class CreaTokenLogin extends LoginFactory{
    @Override
    public LoginStrategy creaLogin() {
        return new TokenLogin();
    }
}
