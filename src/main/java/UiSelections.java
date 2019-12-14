import java.util.Scanner;

public class UiSelections {

    private UiSelections() {
    }

    public static SkillLevel skillSelection() {
        System.out.println("Wybierz umiejetnosci kierowcy:");
        for (SkillLevel skillLevel : SkillLevel.values()) {
            System.out.println(skillLevel.ordinal() + " - " + skillLevel.getNickname());
        }
        final int selection = selection();
        return SkillLevel.values()[selection];
    }

    public static Car carSelection() {
        System.out.println("Wybierz auto:");
        for (Car car : Car.values()) {
            System.out.println(car.ordinal() + " - " + car.getName());
        }
        final int selection = selection();
        return Car.values()[selection];
    }

    private static int selection() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
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
