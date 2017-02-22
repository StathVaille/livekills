package com.github.stathvaille.livekills.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KillWrapper {

   @JsonProperty("package")
   private KillPackage kill;
}
