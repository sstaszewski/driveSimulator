import java.util.LinkedList;
import java.util.List;

public class Driver {

    private List<Driver> drivers;

    public Driver() {
        drivers = new LinkedList();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }
}