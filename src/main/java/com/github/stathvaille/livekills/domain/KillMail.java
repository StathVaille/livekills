package com.github.stathvaille.livekills.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class KillMail {

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy.MM.dd HH:mm:ss")
    private Date killTime;
    private SolarSystem solarSystem;
    private int attackerCount;
    private Victim victim;
}
