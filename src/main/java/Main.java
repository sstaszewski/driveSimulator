import java.util.EnumMap;

public class Main {


    public static void main(String[] args) {
        Player player = new Player("sadasd", CarList.MALUCH, DriverList.AMATEUR);

        EnumMap<CarList, Integer> carListEnumMap = new EnumMap<CarList, Integer>(CarList.class);
        carListEnumMap.put(CarList.MALUCH, 1);
        carListEnumMap.put(CarList.ENZO, 2);
        carListEnumMap.put(CarList.MUSTANG, 3);  // znalezc sposob na automatyczne dodawanie

        EnumMap<CurvesList, Integer> curvesListIntegerEnumMap = new EnumMap<CurvesList, Integer>(CurvesList.class);
        curvesListIntegerEnumMap.put(CurvesList.STRAIGHT, 1);
        curvesListIntegerEnumMap.put(CurvesList.DEGREES30, 2);
        curvesListIntegerEnumMap.put(CurvesList.DEGREES60, 3);
        curvesListIntegerEnumMap.put(CurvesList.DEGREES90, 4);
        curvesListIntegerEnumMap.put(CurvesList.DEGREES180, 5);

        EnumMap<DriverList, Integer> driverListIntegerEnumMap = new EnumMap<DriverList, Integer>(DriverList.class);
        driverListIntegerEnumMap.put(DriverList.NOOB, 1);
        driverListIntegerEnumMap.put(DriverList.AMATEUR, 2);
        driverListIntegerEnumMap.put(DriverList.SKILLED, 3);
        driverListIntegerEnumMap.put(DriverList.PRO, 4);
        driverListIntegerEnumMap.put(DriverList.JESUSTAKESTHEWHEEL, 5);


        //        Map<String, Class> carMap = new HashMap<String, Class>();
        //        carMap.put("key1", CarList.class);
        //        String inputType = "car1";
        //        Class c = carMap.get(inputType);
        //        assert(CarList.MALUCH, )


        //    TreeMap<String, CarList> carMap = new TreeMap<String, CarList>();
        //carMap.put("key1", CarList.class);


    }

}
