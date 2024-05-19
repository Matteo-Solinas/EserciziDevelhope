package com.exercise.CrudOperations.controllers;

import com.exercise.CrudOperations.entities.Car;
import com.exercise.CrudOperations.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        Car newCar = carRepository.saveAndFlush(car);
        return newCar;
    }

    @GetMapping
    public List<Car> getAllCars() {
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        if (carRepository.existsById(id)) {
            Car car = carRepository.getReferenceById(id);
            return car;
        } else {
            return new Car();
        }
    }

    @PutMapping("/{id}")
    public Car updateCarType(@PathVariable Long id, @RequestParam String type) {
        if (carRepository.existsById(id)) {
            Car car = carRepository.getReferenceById(id);
            car.setType(type);
            carRepository.saveAndFlush(car);
            return car;
        } else {
            return new Car();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) throws ResponseStatusException {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping
    public void deleteAllcars() {
        carRepository.deleteAll();
    }

}