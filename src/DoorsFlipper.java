class DoorsFlipper {
    private boolean[] doors;

    public DoorsFlipper(int numberOfDoors) {
        doors = new boolean[numberOfDoors + 1];
    }

    public boolean[] flipAll() {
        for (int step = 1; step < doors.length; step++) {
            flipEvery(step);
        }
        return doors;
    }

    private void flipEvery(int i) {
        for (int j = i; j < doors.length; j += i) {
            doors[j] = !doors[j];
        }
    }
}
