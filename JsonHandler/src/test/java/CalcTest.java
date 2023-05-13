import org.example.Calc;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class CalcTest {

    @Test
    void testCalcAverageOfNumbers() {
        List<Integer> numbers = List.of(1, 4, 2, 4);
        Calc calc = new Calc(numbers);
        double result = calc.average();
        assertThat(result).isCloseTo(2.75,within(0.01));
    }





}
