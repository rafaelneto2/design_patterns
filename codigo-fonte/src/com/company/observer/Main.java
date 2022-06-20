package com.company.observer;

/**
 * CLIENT
 **/
public class Main {

    public static void main(String[] args) {

        SubscriberOne s1 = new SubscriberOne();
        SubscriberTwo s2 = new SubscriberTwo();

        MessagePublisher mp = new MessagePublisher();

        mp.add(s1);
        mp.add(s2);
        mp.sendUpdate(new Message("First message"));
        System.out.println("");

        mp.remove(s1);
        mp.sendUpdate(new Message("Second message"));
        System.out.println("");

        mp.remove(s2);
        mp.sendUpdate(new Message("None"));

        mp.add(s1);
        mp.add(s2);
        mp.sendUpdate(new Message("Last message"));
        System.out.println("");
    }
}
