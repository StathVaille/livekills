package com.github.stathvaille.livekills.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class KillPackage {
    private String killID;
    private KillMail killmail;
    private Zkb zkb;
}
