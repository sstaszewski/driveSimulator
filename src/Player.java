public class Player {
    private String playerName;
    private CarList car;
    private DriverList driver;
    private double currentSpeed;

    public Player(String playerName, CarList car, DriverList driver, double currentSpeed) {
        this.playerName = playerName;
        this.car = car;
        this.driver = driver;
        this.currentSpeed = currentSpeed;
    }

    public double checkPossibleAcceleration() {
        double temporaryAcceleration;
        if (currentSpeed < 0.8 * CarList.MALUCH.getTopSpeed()) {
            temporaryAcceleration = CarList.MALUCH.getAcceleration() * 0.3;
        } else if (currentSpeed < 0.5 * CarList.MALUCH.getTopSpeed()) {
            temporaryAcceleration = CarList.MALUCH.getAcceleration() * 0.7;
        } else {
            temporaryAcceleration = CarList.MALUCH.getAcceleration();
        }
        return temporaryAcceleration;
    }

    public double drive() {
        currentSpeed =
                (currentSpeed + checkPossibleAcceleration()) * CurvesList.DEGREES90.getSpeedLossParameter() * DriverList.JESUSTAKESTHEWHEEL.getSkillLevel();

        return currentSpeed;
    }

    public void checkSpeed() {
        if (currentSpeed >= CarList.MALUCH.getTopSpeed()) {
            currentSpeed = CarList.MALUCH.getTopSpeed();
        }
        // jaki else?   {currentSpeed = currentSpeed ??
    }

}
