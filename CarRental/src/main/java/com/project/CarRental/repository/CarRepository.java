package com.project.CarRental.repository;

import java.util.List;

import com.project.CarRental.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> getAllCarOrderByNameCarAsc();

    void changeStatusCar(int status, int id_car);

    List<Car> getAllCarWithUserAndBrandOrderByNameCarAsc();

    List<Car> getAllCarByDriverOderByName(boolean driver);

    List<Car> getAllCarByDriverAndStatusCarOderByName(boolean driver, int status);

    List<Car> getAllCarByDriverInAddressOderByName(boolean driver, String address);

    List<Car> getAllCarByDriverInAddressAndPromotionalPriceOderByName(boolean driver, String address);

    List<Car> findCarByUserIdUserOrderByNameCarAsc(int id_user);

    List<Car> findCarByUserIdUserAndStatusOrderByNameCar(int id_user, int status);

    List<Car> findCarOnTimeByDriverAndAddress(boolean driver, String address, String dateStart, String dateEnd, int status );

    int countByAddressCarContaining(String address);

    int countByAddressCarContainingAndDriver(String address, boolean driver);
    long count();

    void updatePromotionalPriceCar(int promotionalPrice);

    void resetPromotionalPriceCar(int promotionalPrice, int idCar ) ;

    List<Car> findCarByNameCarContaining(String nameCar);
}
