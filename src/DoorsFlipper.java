class DoorsFlipper {
    private boolean[] doors;

    public DoorsFlipper(int numberOfDoors) {
        doors = new boolean[numberOfDoors + 1];
    }

    public boolean[] invoke() {
        for (int i = 1; i < doors.length; i++) {
            flipEvery(i);
        }
        return doors;
    }

    private void flipEvery(int i) {
        for (int j = i; j < doors.length; j += i) {
            doors[j] = !doors[j];
        }
    }
}
