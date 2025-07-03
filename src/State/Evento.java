package State;

import observer.Partecipante;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private StatoEvento statoEvento;
    private List<Partecipante> partecipanteList;

    public Evento(String nome, StatoEvento statoEvento, List<Partecipante> partecipanteList) {
        this.nome = nome;
        this.statoEvento = statoEvento;
        this.partecipanteList = new ArrayList<>();
    }

    public void aggiungiPartecipante(Partecipante partecipante){
        partecipanteList.add(partecipante);

    }

    public void notificaPartecipante(String messaggio){
        for(Partecipante partecipante : partecipanteList){
            partecipante.aggiorna(messaggio);
        }
    }
}
