public enum CarList {
    MALUCH("Maluch", 100, 20), MUSTANG("Mustang", 250, 50), ENZO("Enzo", 320, 70);

    private String name;
    private double topSpeed;
    private double acceleration;

    CarList(String name, double topSpeed, double acceleration) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
}
