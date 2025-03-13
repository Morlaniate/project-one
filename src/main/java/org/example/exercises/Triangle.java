package org.example.exercises;

import lombok.Getter;

@Getter

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalArgumentException {
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA))
            throw new IllegalArgumentException();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


}
