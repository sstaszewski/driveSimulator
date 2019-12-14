import java.util.Random;

public class SelectionServiceImpl implements RandomCarGenerator, RandomSkillGenerator {
    @Override
    public SkillLevel randomSkillLevel() {
        Random random = new Random();
        int randomValue = random.nextInt(SkillLevel.values().length);
        return SkillLevel.values()[randomValue];
    }

    @Override
    public Car randomCarGenerator() {
        Random random = new Random();
        int randomValue = random.nextInt(Car.values().length);
        return Car.values()[randomValue];
    }


}
