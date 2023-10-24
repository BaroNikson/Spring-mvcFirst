package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> carList;


    public CarService() {
        // Создайте и инициализируйте список машин
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2019));
        carList.add(new Car("Ford", "F-150", 2021));
        carList.add(new Car("Chevrolet", "Malibu", 2018));
        carList.add(new Car("Nissan", "Altima", 2020));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
