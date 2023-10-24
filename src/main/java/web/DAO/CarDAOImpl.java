package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{private final List<Car> carList;

    public CarDAOImpl() {

        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2019));
        carList.add(new Car("Ford", "F-150", 2021));
        carList.add(new Car("Chevrolet", "Malibu", 2018));
        carList.add(new Car("Nissan", "Altima", 2020));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

}
