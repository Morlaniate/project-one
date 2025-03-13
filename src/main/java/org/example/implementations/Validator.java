package org.example.implementations;

public interface Validator {
    boolean isValid(Object value);
    void required();
    void positive();
}