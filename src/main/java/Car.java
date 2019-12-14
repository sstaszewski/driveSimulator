public enum Car {
    MALUCH("Maluch", 28, 5.5), MUSTANG("Mustang", 70, 14), ENZO("Enzo", 90, 19.5);

    private String name;
    private double topSpeed;
    private double acceleration;

    Car(String name, double topSpeed, double acceleration) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }
}
