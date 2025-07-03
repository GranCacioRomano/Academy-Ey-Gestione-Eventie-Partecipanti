package State;

import observer.Partecipante;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private StatoEvento statoEvento;
    private List<Partecipante> partecipanteList;

    public Evento(String nome) {
        this.nome = nome;
        this.statoEvento = new InProgramma();
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

    public void setStatoEvento(StatoEvento statoEvento){
        this.statoEvento = statoEvento;
    }

    public StatoEvento getStatoEvento(){
        return statoEvento;
    }

    public String getNome(){
        return nome;
    }
}
