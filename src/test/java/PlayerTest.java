import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;

class PlayerTest {

    @Test
    void name() {
        Player player = new Player("kowalski", Car.ENZO, SkillLevel.AMATEUR);
        int segmentsCount = 10;
        Queue<Curve> generatedTrack = TrackGenerator.generate(segmentsCount);
        long finalTime = player.measureTimeOn(generatedTrack);

        assertThat("Final time is not 0 ms", finalTime > 0);
    }

    @Test
    @DisplayName("Dla zadanej trasy powinnien obliczyc czas")
    void powinienZwrocicCzasDlaTrasy() {

        Queue<Curve> track = new LinkedList<>();
        track.add(Curve.STRAIGHT);

        Player player = new Player("kowalski", Car.ENZO, SkillLevel.AMATEUR);
        long measuredTime = player.measureTimeOn(track);

        assertThat("Measured time should be 12341", measuredTime == 1000);
    }
}