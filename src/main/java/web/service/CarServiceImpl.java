package web.service;

import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private final CarDAOImpl carDAO;

    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);

    }

}
