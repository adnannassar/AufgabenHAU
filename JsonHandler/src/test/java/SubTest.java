
import org.example.Calc;
import org.example.Sub;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SubTest {

    @Test
    void testSubPositiveNumbers() {
        Sub sub = new Sub(10, 2);
        int result = sub.calc();
        assertEquals(result, 8);
    }
    @Test
    void testSubNegativeNumbers1() {
        Sub sub = new Sub(-20, -30);
        int result = sub.calcNegative();
        assertEquals(result, 10);
    }

    @Test
    void testSubNegativeNumbers2() {
        Sub sub = new Sub(10, -30);
        int result = sub.calcNegative();
        assertEquals(result, -1);
    }


}


