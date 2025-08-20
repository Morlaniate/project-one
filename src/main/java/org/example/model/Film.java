package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class Film {
    private String name;
    private List<String> genres;
}
