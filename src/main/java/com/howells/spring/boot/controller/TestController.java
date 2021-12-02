package com.howells.spring.boot.controller;

import com.howells.spring.boot.service.UserService;
import com.howells.spring.boot.entity.Cars;
import com.howells.spring.boot.entity.Person;
import com.howells.spring.boot.entity.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chrish on 15/02/2020.
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private UserService userService;

    @Operation(description = "Get a name" )
    @GetMapping(path = "/name/{car}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getName(@RequestHeader(name = "name") @Parameter(required = true, example = "Paul") String name, @Parameter Cars car) {
        Map<String, String> result = new HashMap<>();
        result.put(name, userService.getName());
        return result;
    }


    @Operation(description = "Get age" )
    @GetMapping(path = "/age", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getAge() {
        Response response = new Response(21);
        log.info("Get age called");
        return response;
    }

    @Operation(description = "Set a name")
    @PostMapping(path = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> setName(@RequestBody @io.swagger.v3.oas.annotations.parameters.RequestBody(required = true, description = "Name to set") Person person) {
        List<String> result = new ArrayList<>();
        result.add(person.getAddress());
        return result;
    }

}
