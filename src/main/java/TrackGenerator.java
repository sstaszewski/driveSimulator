import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TrackGenerator {

    private TrackGenerator() {
    }

    public static Queue<Curve> generate(int segmentCount) {
        int countOfPossibleSegments = Curve.values().length;
        Queue<Curve> generatedTrack = new LinkedList<Curve>();
        for (int i = 0; i < segmentCount; i++) {
            Random random = new Random();
            int i1 = random.nextInt(countOfPossibleSegments);
            generatedTrack.add(Curve.values()[i1]);
        }
        return generatedTrack;
    }


}
