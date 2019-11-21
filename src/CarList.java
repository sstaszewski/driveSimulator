public enum CarList {
    MALUCH("Maluch", 100, 20, 0), MUSTANG("Mustang", 250, 50, 0), ENZO("Enzo", 320, 70, 0);

    private String name;
    private double topSpeed;
    private double acceleration;
    private double currentSpeed;

    CarList(String name, double topSpeed, double acceleration, double currentSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.currentSpeed = currentSpeed;
    }
}
