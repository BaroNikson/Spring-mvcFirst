package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarService implements CarServiceImpl {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    public List<Car> getCars(Integer count) {
        List<Car> allCars = carDAO.getAllCars();
        if (count == null || count >= allCars.size()) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}
