package com.company;

import java.time.LocalDateTime;

// CONCRETE CREATOR
public class RoadLogistics extends Factory {

    @Override
    Transport planDelivery() {
        return new Truck("Santos", "Rio de Janeiro", LocalDateTime.now());
    }

}
