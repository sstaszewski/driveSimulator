import java.time.Duration;
import java.util.Random;
import java.util.Scanner;

public class UI {
    public static final int MAX_SEGMENTS = 40;
    private final RandomSkillGenerator randomSkillGenerator;
    private final RandomCarGenerator randomCarGenerator;

    private final GameEngine gameEngine;

    public UI(RandomSkillGenerator randomSkillGenerator, RandomCarGenerator randomCarGenerator, GameEngine gameEngine) {
        this.randomSkillGenerator = randomSkillGenerator;
        this.randomCarGenerator = randomCarGenerator;
        this.gameEngine = gameEngine;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wolisz wybrać, czy grać losowo?");

        System.out.println("1 - wybrać");
        System.out.println("2 - losowo");
        int choosenOption = scanner.nextInt();
        switch (choosenOption) {
            case (1):
                SkillLevel selectedSkill = UiSelections.skillSelection();
                Car selectedCar = UiSelections.carSelection();
                final Player player = new Player("asd", selectedCar, selectedSkill);
                int segmentsCount = new Random().nextInt(MAX_SEGMENTS);
                final Duration durationOfTrack = gameEngine.measureTime(player, new Random().nextInt(MAX_SEGMENTS));
                System.out.println("Trasa przebyta w " + durationOfTrack.getSeconds());
                break;
            case (2):
                final SkillLevel skillLevel = randomSkillGenerator.randomSkillLevel();
                final Car car = randomCarGenerator.randomCarGenerator();
                final Player randomizedPlayer = new Player("asd", car, skillLevel);
                final Duration durationOfRandomTrack = gameEngine.measureTime(randomizedPlayer, new Random().nextInt(MAX_SEGMENTS));
                System.out.println("Trasa przebyta w " + durationOfRandomTrack.getSeconds());
                break;
            default:
                System.out.println("No coś ci chyba nie wyszło, spróbuj jeszcze raz.");
        }
    }

//    public void driverSelection(SkillLevel skillLevel, Driver driver) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wybierz kierowcę:");
//        for (int i = 0; i < skillLevel.ordinal() + 1; i++) {
//            System.out.println(i + 1 + " - " + skillLevel.getNickname());//tu na bank nie zadziala
//        }
//        int choosenOption = scanner.nextInt();
//        for (int j = 0; j < skillLevel.ordinal() + 1; j++){
//            if (j==choosenOption){
//                Driver driver1; //  nie zadziala
//            }
//        }
//    }
//    public void carSelection(Car carList, Car car) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wybierz auto:");
//        for (int i = 0; i < carList.ordinal() + 1; i++) {
//            System.out.println(i + 1 + " - " + carList.getName());//tu na bank nie zadziala
//        }
//        int choosenOption = scanner.nextInt();
//        for (int j = 0; j < carList.ordinal() + 1; j++){
//            if (j==choosenOption){
//                Car car1; //  nie zadziala
//            }
//        }
//    }

//    public void trackLengthSelection(Curve curvesList, Curve curve){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jak długą trasę chcesz jechac?");
//        int choosenOption = scanner.nextInt();
//        for (int i = 0; i<=choosenOption;i++){
//            //metoda losowania odcinka
//        }
//    }

}
