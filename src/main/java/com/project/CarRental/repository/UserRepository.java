package com.project.CarRental.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.CarRental2.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllUserOrderbyUsername();
    void updateTotalMoney(int totalMoney, int idUser );
    long count();

    Optional<User> findUserByUsername(String username);

    User getUserByIdCar(int idCar);
    Optional<User> findByUsername(String username);
}
