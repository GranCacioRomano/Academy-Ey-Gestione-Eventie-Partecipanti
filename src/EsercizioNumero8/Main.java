package EsercizioNumero8;

import EsercizioNumero8.Strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ricetta> ricette = new ArrayList<>();
        ricette.add(new Ricetta("Carbonara",false, false));
        ricette.add(new Ricetta("Cacio e Pepe",false, false));
        ricette.add(new Ricetta("Gricia",false, false));
        ricette.add(new Ricetta("Amatriciana",false, false));
        ricette.add(new Ricetta("Falafel",false, true));
        ricette.add(new Ricetta("Pollo alla griglia con crema di avocado",true, false));
        ricette.add(new Ricetta("Insalata di avocado e cetrioli",true, true));

        ControlloRicetta controlloRicetta = new ControlloKeto();
        System.out.println("Ricette Keto:");
        for (Ricetta ricetta: controlloRicetta.controllo(ricette)){
            System.out.println(ricetta);
        }

        controlloRicetta = new ControlloVegano();
        System.out.println("Ricette Vegana:");
        for (Ricetta ricetta: controlloRicetta.controllo(ricette)){
            System.out.println(ricetta);
        }

        controlloRicetta = new ControlloNormale();
        System.out.println("Tutte le ricette:");
        for (Ricetta ricetta: controlloRicetta.controllo(ricette)){
            System.out.println(ricetta);
        }
    }
}
