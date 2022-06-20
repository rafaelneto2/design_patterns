package com.company.observer;

/**
 * Interface para representar o SUBJECT/PUBLISHER (Sujeito/Publicador)
 **/
public interface Subject {

    void add(Observer o);

    void remove(Observer o);

    void sendUpdate(Message m);
}
