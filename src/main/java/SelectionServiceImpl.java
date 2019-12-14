public class SelectionServiceImpl implements SelectionService {
    public SelectionServiceImpl() {
    }

    public void randomDriverGenerator(SkillLevel skillLevel, Driver driver) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * skillLevel.ordinal() + 1;
        int randomDriverId = (int) randomDouble;
        // przyrownac id w enumie do wylosowanego id
        for (int i = 0; i <= skillLevel.ordinal()+1; i++) {
            if (i == randomDriverId) {
                Driver driver1;
            }
        }
    }

    public void randomCarGenerator(Car carList, Car car) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * carList.ordinal() + 1;
        int randomCarId = (int) randomDouble;
        for (int i = 0; i < carList.ordinal(); i++) {
            if(i==randomCarId){
                Car car1;
            }
        }
    }

    public void randomCurveGenerator(Curve curvesList, Curve curve) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * curvesList.ordinal() + 1;
        int randomCurveId = (int) randomDouble;
        for (int i = 0; i < curvesList.ordinal(); i++) {
            if(i==randomCurveId){
                Curve curve1;
            }
        }
    }


    //
    //    @Override
    //    public void selectDriver(String nickname, double skillLevel){
    //        this.selectDriver("das",2.3);
    //    }

}
