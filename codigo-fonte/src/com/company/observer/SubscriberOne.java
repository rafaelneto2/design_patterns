package com.company.observer;

/**
 * Classe para implementar o SUBSCRIBER (Assinante)
 **/
public class SubscriberOne implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("SubscriberOne: " + m.getMessageContent());
    }
}
