import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void flipsCorrectlyForHundredDoors() {
        var doorsFlipper = new DoorsFlipper(100);
        doorsFlipper.flipAll();

        final List<Integer> opened = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
        for (int doorPosition = 1; doorPosition <= 100; doorPosition++)
            assertEquals(!opened.contains(doorPosition),doorsFlipper.isClosed(doorPosition));
    }
}