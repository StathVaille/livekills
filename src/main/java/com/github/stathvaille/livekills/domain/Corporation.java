package com.github.stathvaille.livekills.domain;

import lombok.Data;

@Data
public class Corporation {
    private int id;
    private String name;
    private Icon icon;
    private String href;
}
