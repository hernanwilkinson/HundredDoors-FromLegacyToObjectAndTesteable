class DoorsFlipper {
    private boolean[] doors;

    public DoorsFlipper(int numberOfDoors) {
        doors = new boolean[numberOfDoors + 1];
    }

    public boolean[] flipAll() {
        for (int step = 1; step < doors.length; step++)
            flipEvery(step);

        return doors;
    }

    private void flipEvery(int step) {
        for (int doorPosition = step; doorPosition < doors.length; doorPosition += step)
            doors[doorPosition] = !doors[doorPosition];
    }

    public boolean isClosed(int doorPosition) {
        return !doors[doorPosition];
    }
}
