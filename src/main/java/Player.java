public class Player {
    private String playerName;
    private CarList car;
    private DriverList driver;
    private double currentSpeed;

    public Player(String playerName, CarList car, DriverList driver) {
        this.playerName = playerName;
        this.car = car;
        this.driver = driver;
    }




    public Player playerGenerator(Player player, CarList carList, Car car){



        return player;
    }

    public double checkPossibleAcceleration(CarList car) {
        double temporaryAcceleration;
        if (currentSpeed < 0.8 * car.getTopSpeed()) {
            temporaryAcceleration = car.getAcceleration() * 0.3;
        } else if (currentSpeed < 0.5 * car.getTopSpeed()) {
            temporaryAcceleration = car.getAcceleration() * 0.7;
        } else {
            temporaryAcceleration = car.getAcceleration();
        }
        return temporaryAcceleration;
    }

    public double drive(CarList car, CurvesList curvesList, DriverList driver) {
        currentSpeed =
                (currentSpeed + checkPossibleAcceleration(car)) * curvesList.getSpeedLossParameter() * driver.getSkillLevel();

        return currentSpeed;
    }

    public void checkSpeed(CarList car) {
        if (currentSpeed >= car.getTopSpeed()) {
            currentSpeed = car.getTopSpeed();
        }       // jaki else?   {currentSpeed = currentSpeed ??
    }

}
