import java.time.Duration;
import java.util.Queue;

public class GameEngine {

    public Duration measureTime(Player player, int segmentsCount) {
        Queue<Curve> generatedTrack = TrackGenerator.generate(segmentsCount);
        return player.measureTimeOn(generatedTrack);
    }
}
