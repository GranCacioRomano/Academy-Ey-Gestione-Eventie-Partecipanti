package EsercizioNumero5;

import EsercizioNumero5.Facade.LoginFacade;

public class Main {
    public static void main(String[] args) {
        LoginFacade loginFacade = new LoginFacade();

        System.out.println(loginFacade.eseguiLogin("password","utente","123"));
        System.out.println(loginFacade.eseguiLogin("social","utente","SOCIAL"));
        System.out.println(loginFacade.eseguiLogin("token","utente","TOKEN123"));

        System.out.println(loginFacade.eseguiLogin("token","utente","TOKEN1243")); // falsa per test
    }
}
