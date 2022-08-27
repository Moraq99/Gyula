package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameField gameField = new GameField(new RandomGenerator());
        System.out.println(gameField.play());


}


}
