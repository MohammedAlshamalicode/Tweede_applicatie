package be.vdab.tweede_applicatie;

import java.time.LocalDateTime;

public record TodoDTO (String tekst, int prioriteit , LocalDateTime gemaakt){


    public TodoDTO(String tekst, int prioriteit) {
        this(tekst, prioriteit, LocalDateTime.now());
    }

}
