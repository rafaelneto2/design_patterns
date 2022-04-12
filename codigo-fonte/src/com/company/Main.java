package com.company;

// CLIENT
public class Main {

    public static void main(String[] args) {
	    Factory factorySea = new SeaLogistics();
        Factory factoryRoad = new RoadLogistics();
        Transport navio = factorySea.planDelivery();
        Transport caminhao = factoryRoad.planDelivery();
        System.out.println(navio.deliver());
        System.out.println("");
        System.out.println(caminhao.deliver());
    }
}
