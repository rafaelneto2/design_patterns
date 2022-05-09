package com.company.factorymethod;

import java.time.LocalDateTime;

// CONCRETE CREATOR
public class SeaLogistics extends Factory {

    @Override
    public Transport planDelivery() {
        return new Ship("Santos", "Rio de Janeiro", LocalDateTime.now());
    }
}
