package com.novawind.estate.enums;

import lombok.Getter;

/**
 * @author Jeremy Xiong<br>
 * 2019-06-08 18:16
 */
@Getter
public enum SwitchStatus {

    OFF(0), ON(1);

    private Integer code;

    SwitchStatus (Integer code) {
        this.code = code;
    }

}
