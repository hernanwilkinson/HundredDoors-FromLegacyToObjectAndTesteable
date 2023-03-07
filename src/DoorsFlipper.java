class DoorsFlipper {
    private int numberOfDoors;

    public DoorsFlipper(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean[] invoke() {
        boolean[] doors = new boolean[numberOfDoors + 1];

        for (int i = 1; i < doors.length; i++) {
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
        }
        return doors;
    }
}
