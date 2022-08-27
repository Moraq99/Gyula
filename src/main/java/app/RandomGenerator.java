package app;

import java.util.Scanner;

public class RandomGenerator {

    public int throwTheDice(int size) {
        int dice = (int) (Math.random()* size+1);
        return dice;
    }

    public int throwTheDiceWithD6() {
        return throwTheDice(6);



    }
}
