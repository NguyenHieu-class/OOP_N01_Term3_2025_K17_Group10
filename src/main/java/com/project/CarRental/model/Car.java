package com.project.CarRental.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Car {

    // ID Car

    private int idCar;

    // Name Car
    private String nameCar;

    // Overview car
    private String overviewCar;

    // Price - Promotional - Old Promotional
    private int price;
    private int promotionalPrice;
    private int oldPromotionalPrice;

    // License Plates
    private String licensePlates;

    // Model year
    private int modelYear;

    // Status
    private int status;

    // Fuel: TRUE == Gasoline || FALSE == DIESEL
    private boolean fuel;

    // Fuel for 100 km
    private float fuelFor100km;

    // Quang duong giao xe
    private int maxDistanceDelivery;
    private int deliveryFeeFor1km;

    

}
