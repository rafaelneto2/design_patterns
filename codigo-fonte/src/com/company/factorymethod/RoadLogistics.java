package com.company.factorymethod;

import java.time.LocalDateTime;

// CONCRETE CREATOR
public class RoadLogistics extends Factory {

    @Override
    public Transport planDelivery() {
        return new Truck("Santos", "Rio de Janeiro", LocalDateTime.now());
    }

}
