package org.example.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class User {
    private String name;
    private LocalDate birthday;
}
