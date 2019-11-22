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

    public double drive() {
        currentSpeed =
                (currentSpeed + CarList.MALUCH.getAcceleration()) * CurvesList.DEGREES90.getSpeedLossParameter() * DriverList.JESUSTAKESTHEWHEEL.getSkillLevel();

        return currentSpeed;
    }

    public void checkSpeed(){
        if(currentSpeed>=CarList.MALUCH.getTopSpeed()){
            currentSpeed=CarList.MALUCH.getTopSpeed();
        }
        // jaki else?   {currentSpeed = currentSpeed ??
    }
}
