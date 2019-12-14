import java.util.Scanner;

public class UI {
    private final RandomSkillGenerator randomSkillGenerator;
    private final RandomCarGenerator randomCarGenerator;
    private final GameEngine gameEngine;

    public UI(RandomSkillGenerator randomSkillGenerator, RandomCarGenerator randomCarGenerator, GameEngine gameEngine) {
        this.randomSkillGenerator = randomSkillGenerator;
        this.randomCarGenerator = randomCarGenerator;
        this.gameEngine = gameEngine;
    }

    public void firstChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wolisz wybrać, czy grać losowo?");

        System.out.println("1 - wybrać");
        System.out.println("2 - losowo");
        int choosenOption = scanner.nextInt();
        switch (choosenOption) {
            case (1):
                //wybieranie dupereli
//                driverSelection(); //cos tu zjebalem
//                carSelection(); //tu tez, ten sam blad
//                trackLengthSelection();
                break;
            case (2):
                SkillLevel skillLevel = randomSkillGenerator.randomSkillLevel();
                Car car = randomCarGenerator.randomCarGenerator();
                Player player = new Player("asd",car,skillLevel);
                System.out.println(gameEngine.measureTime(player, 10));
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
