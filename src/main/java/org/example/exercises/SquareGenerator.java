package org.example.exercises;

public class SquareGenerator {
    public static Square[] generate(double side, int amount) {
        Square[] squares = new Square[amount];
        for (int i = 0; i < amount; i++) {
            squares[i] = new Square(side);
        }
        return squares;
    }
}
