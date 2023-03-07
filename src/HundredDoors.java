import java.io.PrintStream;

public class HundredDoors {
    // Ejemplo tomado de rosettacode: https://rosettacode.org/wiki/100_doors#With_an_array_of_boolean
    public static void main(String[] args) {
        hundredDoors(System.out);
    }

    private static void hundredDoors(PrintStream out) {
        boolean[] doors = new boolean[101];

        for (int i = 1; i < doors.length; i++) {
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
        }

        for (int i = 1; i < doors.length; i++) {
            if (doors[i]) {
                out.printf("Door %d is open.%n", i);
            }
        }
    }
}