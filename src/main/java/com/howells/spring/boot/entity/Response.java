package com.howells.spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.java.Log;

/**
 * Created by chrish on 11/10/2021.
 */

@AllArgsConstructor
@Log
@EqualsAndHashCode
public class Response {

    @Getter
    private int age;
}
