package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List<Car> cars;
    private CarControlManager controlManager;

    private GameManager() {
        this.cars = new ArrayList<>();
        this.controlManager = new CarControlManager();
    }

    public static GameManager create() {
        return new GameManager();
    }

    public void addCar(String name) {
        Car car = new Car(name);
        car.setCarName(name);
        cars.add(car);
    }
}
