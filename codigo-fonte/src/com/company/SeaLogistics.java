package com.company;

import java.time.LocalDateTime;

// CONCRETE CREATOR
class SeaLogistics extends Factory {

    @Override
    Transport planDelivery() {
        return new Ship("Santos", "Rio de Janeiro", LocalDateTime.now());
    }
}
