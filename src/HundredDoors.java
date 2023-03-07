import java.io.PrintStream;
import java.io.PrintWriter;

public class HundredDoors {
    // Ejemplo tomado de rosettacode: https://rosettacode.org/wiki/100_doors#With_an_array_of_boolean
    public static void main(String[] args) {
        final PrintWriter out = new PrintWriter(System.out);
        hundredDoors(out);
        out.flush();
    }

    public static void hundredDoors(PrintWriter out) {
        boolean[] doors = new boolean[101];

        for (int i = 1; i < doors.length; i++) {
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
        }

        printOpened(out, doors);
    }

    private static void printOpened(PrintWriter out, boolean[] doors) {
        for (int i = 1; i < doors.length; i++) {
            if (doors[i]) {
                out.printf("Door %d is open.%n", i);
            }
        }
    }
}