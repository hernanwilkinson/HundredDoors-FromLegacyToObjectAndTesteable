class DoorsFlipper {
    private int numberOfDoors;
    private boolean[] doors;

    public DoorsFlipper(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        doors = new boolean[numberOfDoors + 1];

    }

    public boolean[] invoke() {
        for (int i = 1; i < doors.length; i++) {
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
        }
        return doors;
    }
}
