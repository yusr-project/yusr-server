package com.github.yusrproject.driver.appletv.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FinalizePairingResponse implements Serializable {
    private boolean deviceHasPaired;
}
