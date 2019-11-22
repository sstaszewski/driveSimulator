import java.util.LinkedList;
import java.util.List;

public class Car {

    private List<Car> cars;

    public Car(){
        cars = new LinkedList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }
}
