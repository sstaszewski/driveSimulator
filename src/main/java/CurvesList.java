public enum CurvesList {
    STRAIGHT("Straight", 1, 1),DEGREES30("30 degrees", 1, 0.9),DEGREES60("60 degrees", 1, 0.7),DEGREES90("90 degrees"
            , 1, 0.5), DEGREES180("'U'-turn", 1, 0.2);
    private String name;
    private double length;
    private double speedLossParameter;

    CurvesList(String name, double length, double speedLossParameter) {
        this.name = name;
        this.length = length;
        this.speedLossParameter = speedLossParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSpeedLossParameter() {
        return speedLossParameter;
    }

    public void setSpeedLossParameter(double speedLossParameter) {
        this.speedLossParameter = speedLossParameter;
    }
}
