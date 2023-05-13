import org.example.UhrZeit;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Locale;

import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class UhrZeitTest {

    @Test
    void testPersonNeededAt16OClock() {
        UhrZeit uhrZeit = new UhrZeit();
        int result = uhrZeit.personsNeeded(LocalDateTime.of(2023,5,13,16,36));
        assertEquals(result, 4);
    }

    @Test
    void testPersonNeededAt3OClock() {
        UhrZeit uhrZeit = new UhrZeit();
        int result = uhrZeit.personsNeeded(LocalDateTime.of(2023,5,13,3,0));
        assertEquals(result, 2);
    }
}
