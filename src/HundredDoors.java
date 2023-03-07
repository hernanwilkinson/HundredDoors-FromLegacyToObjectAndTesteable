import java.io.PrintWriter;

public class HundredDoors {
    // Ejemplo tomado de rosettacode: https://rosettacode.org/wiki/100_doors#With_an_array_of_boolean
    public static void main(String[] args) {
        final PrintWriter out = new PrintWriter(System.out);
        hundredDoors(out, 100);
        out.flush();
    }

    public static void hundredDoors(PrintWriter out, int numberOfDoors) {
        boolean[] doors = new DoorsFlipper(numberOfDoors).invoke();

        printOpened(out, doors);
    }

    private static void printOpened(PrintWriter out, boolean[] doors) {
        for (int i = 1; i < doors.length; i++) {
            if (doors[i]) {
                out.printf("Door %d is open.%n", i);
            }
        }
    }

    private static class DoorsFlipper {
        private int numberOfDoors;

        public DoorsFlipper(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        public boolean[] invoke() {
            boolean[] doors = new boolean[numberOfDoors +1];

            for (int i = 1; i < doors.length; i++) {
                for (int j = i; j < doors.length; j += i) {
                    doors[j] = !doors[j];
                }
            }
            return doors;
        }
    }
}