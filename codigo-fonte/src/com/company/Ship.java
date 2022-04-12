package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// CONCRETE PRODUCT
public class Ship  implements Transport {

    private String from;
    private String to;
    private LocalDateTime date;

    public Ship(String from, String to, LocalDateTime date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public String deliver() {
        String response = "Entrega por mar em um contêiner." +
                "\nOrigem: " + getFrom() +
                "\nDestino: " + getTo() +
                "\nHorário de partida: " + getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm"));
        return response;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
