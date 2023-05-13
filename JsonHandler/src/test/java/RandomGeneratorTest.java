import org.example.RandomGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomGeneratorTest {
    @Test
    void testRandomGenerator() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int result = randomGenerator.generate();
    }
}
