package com.github.stathvaille.livekills.domain;

import lombok.Data;

@Data
public class Victim {
    private int damageTaken;
    private Alliance alliance;
    private Character character;
    private ShipType shipType;
    private Corporation corporation;
}
