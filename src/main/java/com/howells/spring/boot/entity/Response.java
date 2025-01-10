package com.howells.spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.java.Log;

/**
 * Created by chrish on 11/10/2021.
 */

@Getter
@AllArgsConstructor
@Log
@EqualsAndHashCode
public class Response {

    private int age;
}
