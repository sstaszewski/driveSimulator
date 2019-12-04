import java.util.LinkedList;
import java.util.List;

public class Car {

    private List<Car> cars= new LinkedList();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }



}
