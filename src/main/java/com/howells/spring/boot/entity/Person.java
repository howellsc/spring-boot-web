package com.howells.spring.boot.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by chrish on 12/10/2021.
 */
@Schema(description = "Contains details of a person")
@Builder
@Data
@Entity(name = "PERSON")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @Column
    @Schema(description = "Name of person", example = "Jade", required = true)
    String name;
    @Column
    @Max(value = 90)
    @Min(value = 0)
    @Schema(description = "Age of person", example = "30", required = true)
    int age;
    @NotNull
    @Column
    String address;
}
