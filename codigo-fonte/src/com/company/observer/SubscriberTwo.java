package com.company.observer;

/**
 * Classe para implementar o SUBSCRIBER (Assinante)
 **/
public class SubscriberTwo implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("SubscriberTwo: " + m.getMessageContent());
    }
}
