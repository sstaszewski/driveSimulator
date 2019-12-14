import java.time.Duration;
import java.util.Queue;

public class Player {
    private String playerName;
    private Car car;
    private SkillLevel driver;

    public Player(String playerName, Car car, SkillLevel driver) {
        this.playerName = playerName;
        this.car = car;
        this.driver = driver;
    }


    public Player playerGenerator(Player player, Car carList, Car car) {
        return player;
    }

    public double getPossibleAcceleration(Car car, double averageSpeed) {
        double temporaryAcceleration;

        if (averageSpeed < 0.8 * car.getTopSpeed()) {
            temporaryAcceleration = car.getAcceleration() * 0.3;
        } else if (averageSpeed < 0.5 * car.getTopSpeed()) {
            temporaryAcceleration = car.getAcceleration() * 0.7;
        } else {
            temporaryAcceleration = car.getAcceleration();
        }
        return temporaryAcceleration;
    }

    public Duration measureTimeOn(Queue<Curve> generatedTrack) {

        long totalTime = 0;
        double currentSpeed = 0;
        for (Curve currentCurve : generatedTrack) {
            currentSpeed =
                    (currentSpeed + getPossibleAcceleration(car, currentSpeed)) * currentCurve.getSpeedLossParameter() * driver.getSkillLevel();
            currentSpeed = ensureThatTopSpeedNotExided(currentSpeed);
            totalTime = totalTime + (long) (currentCurve.getLength() / currentSpeed);
        }
        return Duration.ofSeconds(totalTime);
    }

    public double ensureThatTopSpeedNotExided(double averageSpeed) {
        return Math.min(averageSpeed, car.getTopSpeed());
    }

}
