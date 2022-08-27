package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Mock
    private RandomGenerator generator;

    @InjectMocks
    private GameField field;

    @BeforeEach
    void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void tesztecske() {
        Mockito.when(generator.throwTheDiceWithD6())
                .thenReturn(4);


        String case3 = field.play();
        assertEquals("Döntetlen", case3);

    }
    @Test
    void tesztecske2() {
        Mockito.when(generator.throwTheDiceWithD6())
                .thenReturn(4)
                .thenReturn(6);

        String case3 = field.play();
        assertEquals("Vesztettél", case3);

    }
    @Test
    void tesztecske3() {
        Mockito.when(generator.throwTheDiceWithD6())
                .thenReturn(4)
                .thenReturn(2);

        String case3 = field.play();
        assertEquals("Nyertél", case3);

    }

    @Test
    void main() {

        RandomGenerator generator = new RandomGenerator();

        for ( int i = 0; i < 10000; i ++) {
            int dice = generator.throwTheDiceWithD6();

            assertTrue(dice >= 1);
            assertTrue(dice <= 6);
        }
    }



    @Test
    void diceTest2() {
        GameField field = new GameField(new RandomGenerator());

        String case1 = field.play();
        assertEquals("Nyertél", case1);

        String case2 = field.play();
        assertEquals("Vesztettél", case2);

        String case3 = field.play();
        assertEquals("Döntetlen", case3);



    }
}