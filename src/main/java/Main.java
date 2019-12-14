import java.util.EnumMap;

public class Main {


    public static void main(String[] args) {
        SelectionServiceImpl selectionService = new SelectionServiceImpl();
        UI ui = new UI(selectionService, selectionService, new GameEngine());
        ui.play();

        Player player = new Player("sadasd", Car.MALUCH, SkillLevel.AMATEUR);

        EnumMap<Car, Integer> carListEnumMap = new EnumMap<Car, Integer>(Car.class);
        carListEnumMap.put(Car.MALUCH, 1);
        carListEnumMap.put(Car.ENZO, 2);
        carListEnumMap.put(Car.MUSTANG, 3);  // znalezc sposob na automatyczne dodawanie

        EnumMap<Curve, Integer> curvesListIntegerEnumMap = new EnumMap<Curve, Integer>(Curve.class);
        curvesListIntegerEnumMap.put(Curve.STRAIGHT, 1);
        curvesListIntegerEnumMap.put(Curve.DEGREES30, 2);
        curvesListIntegerEnumMap.put(Curve.DEGREES60, 3);
        curvesListIntegerEnumMap.put(Curve.DEGREES90, 4);
        curvesListIntegerEnumMap.put(Curve.DEGREES180, 5);

        EnumMap<SkillLevel, Integer> driverListIntegerEnumMap = new EnumMap<SkillLevel, Integer>(SkillLevel.class);
        driverListIntegerEnumMap.put(SkillLevel.NOOB, 1);
        driverListIntegerEnumMap.put(SkillLevel.AMATEUR, 2);
        driverListIntegerEnumMap.put(SkillLevel.SKILLED, 3);
        driverListIntegerEnumMap.put(SkillLevel.PRO, 4);
        driverListIntegerEnumMap.put(SkillLevel.JESUSTAKESTHEWHEEL, 5);


        //        Map<String, Class> carMap = new HashMap<String, Class>();
        //        carMap.put("key1", CarList.class);
        //        String inputType = "car1";
        //        Class c = carMap.get(inputType);
        //        assert(CarList.MALUCH, )


        //    TreeMap<String, CarList> carMap = new TreeMap<String, CarList>();
        //carMap.put("key1", CarList.class);


    }

}
