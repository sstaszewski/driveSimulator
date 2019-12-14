public enum Curve {
    STRAIGHT("Straight", 1000, 1), DEGREES30("30 degrees", 1000, 0.9), DEGREES60("60 degrees", 1000, 0.7), DEGREES90("90 degrees"
            , 1000, 0.5), DEGREES180("'U'-turn", 1000, 0.2);
    private String name;
    private double length;
    private double speedLossParameter;

    Curve(String name, double length, double speedLossParameter) {
        this.name = name;
        this.length = length;
        this.speedLossParameter = speedLossParameter;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getSpeedLossParameter() {
        return speedLossParameter;
    }
}
