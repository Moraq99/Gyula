package app;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TDD {

    @Test
    void test_sample(){
        assertEquals(0,MyUnit.getNumber(new int[0]));
        assertEquals(1,MyUnit.getNumber(new int[]{1}));
        assertEquals(1,MyUnit.getNumber(new int[]{1,2}));
        assertEquals(3,MyUnit.getNumber(new int[]{3,2,4,11}));
    }

    @Test
    void test_again() {
        assertEquals(0, MyUnit.sum(null));
        assertEquals(0, MyUnit.sum(new int[0]));
        assertEquals(1, MyUnit.sum(new int[]{1}));
        assertEquals(2, MyUnit.sum(new int[]{2}));
        assertEquals(2, MyUnit.sum(new int[]{1,1}));
        assertEquals(3, MyUnit.sum(new int[]{1,1,1}));
        assertEquals(7, MyUnit.sum(new int[]{1,2,3,1}));
    }

    @Test
    void reverseString() {
        String text = "kiscica";
        String result = g(text);

        assertEquals(text, result);

        text = "I am the best";
        result = g(text);

        assertEquals(text,result);

    }
    public String g (String text) {
        if(text == null){
            return null;
        }
        List<String> list = new ArrayList<>();


        int lastSpace = text.lastIndexOf(" ");

        if (lastSpace == -1){
            return text;
        }
        String result = "";
        while (lastSpace > 1){
        lastSpace = text.lastIndexOf("");
        String lastWord = text.substring(lastSpace+1);
        result+= lastWord;
        text = text.substring(0,lastSpace);
        }

        result += text;

        return result;
        }


}
