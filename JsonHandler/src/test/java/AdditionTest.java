import org.junit.jupiter.api.Test;

import static org.example.Main.add;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdditionTest {

    @Test
     void testAddition(){
        int a = 5;
        int b = 3;
        int expectedResult = 8;
        int actualResult = add(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
     void testAdditionWithNegativeNumbers(){
        int a = 5;
        int b = -3;
        int expectedResult = 1;
        int actualResult = add(a, b);
        assertNotEquals(expectedResult, actualResult);
    }





}
