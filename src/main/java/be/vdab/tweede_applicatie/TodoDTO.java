package be.vdab.tweede_applicatie;

import java.time.LocalDateTime;

public class TodoDTO {
    private String tekst;
    private int prioriteit;
    private LocalDateTime gemaakt;

    protected TodoDTO(){}

    public TodoDTO(String tekst, int prioriteit, LocalDateTime gemaakt) {
        this.tekst = tekst;
        this.prioriteit = prioriteit;
        this.gemaakt = gemaakt;
    }

    public String getTekst() {
        return tekst;
    }

    public int getPrioriteit() {
        return prioriteit;
    }

    public LocalDateTime getGemaakt() {
        return gemaakt;
    }
}
