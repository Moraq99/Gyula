package app;

import java.util.Scanner;

public class GameField {

    private RandomGenerator generator;
    public Scanner scanner;

    public GameField(RandomGenerator generator){
        this.generator =generator;
        this.scanner = new Scanner(System.in);
    }
    private String winner(int userTurn, int computer) {
        if (userTurn> computer){
            return "Nyertél";
        } else if (userTurn< computer) {
            return "Vesztettél";
        }
        return "Döntetlen";
    }

    public String play() {
        System.out.println("Dobjál! ok?");

    int userTurn = generator.throwTheDiceWithD6();
    int computer = generator.throwTheDiceWithD6();

        System.out.println("A te dobásod:" + userTurn + " Az én dobásom:" + computer);

        return winner(userTurn, computer);
    }
}
