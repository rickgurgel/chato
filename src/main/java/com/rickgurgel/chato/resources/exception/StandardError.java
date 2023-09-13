package com.rickgurgel.chato.resources.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String error;
    private String path;

}
