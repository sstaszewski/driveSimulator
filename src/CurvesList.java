public enum CurvesList {
    STRAIGHT("Straight", 1, 1),DEGREES30("30 degrees", 1, 0.9),DEGREES60("60 degrees", 1, 0.7),DEGREES90("90 degrees"
            , 1, 0.5), DEGREES180("'U'-turn", 1, 0.2);
    private String name;
    private double lenght;
    private double speedLossParameter;

    CurvesList(String name, double lenght, double speedLossParameter) {
        this.name = name;
        this.lenght = lenght;
        this.speedLossParameter = speedLossParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getSpeedLossParameter() {
        return speedLossParameter;
    }

    public void setSpeedLossParameter(double speedLossParameter) {
        this.speedLossParameter = speedLossParameter;
    }
}
