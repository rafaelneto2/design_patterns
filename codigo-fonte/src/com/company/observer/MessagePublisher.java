package com.company.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para implementar o SUBJECT/PUBLISHER (Sujeito/Publicador)
 * E também para tratar os eventos
 **/
public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void sendUpdate(Message m) {
        observers.forEach(o -> o.update(m));
    }
}
