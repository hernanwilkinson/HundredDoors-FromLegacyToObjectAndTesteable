import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

public class HundredDoorsTest {
    @Test
    public void shouldOutputOpenedDoors() {
        final StringWriter out = new StringWriter();
        HundredDoors.hundredDoors(new PrintWriter(out), 100);
        assertEquals("Door 1 is open.\n" +
                "Door 4 is open.\n" +
                "Door 9 is open.\n" +
                "Door 16 is open.\n" +
                "Door 25 is open.\n" +
                "Door 36 is open.\n" +
                "Door 49 is open.\n" +
                "Door 64 is open.\n" +
                "Door 81 is open.\n" +
                "Door 100 is open.\n", out.toString());
    }
}