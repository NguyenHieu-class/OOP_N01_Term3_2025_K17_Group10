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

    // km tối đa trên ngày
    private int maximumKilometersperDay;
    private int limitCrossingfee1Km;

    private String polyUseCar;

    private String addressCar;

    private String avatarCar;

    private String imageCar;

    // số ghế ngồi
    private int numberOfSeats;

    // bluetooth
    private boolean bluetooth;
    // camerea hành trình
    private boolean dashCamera;
    // camera lùi
    private boolean reverseCamera;
    // camera 360
    private boolean camera360;
    // cam cập lề
    private boolean parkingCamera;
    // cảm biến ám suât lốp
    private boolean tpms;
    // cảnh báo tốc độ
    private boolean speedWarning;
    // gps
    private boolean gpsLocator;
    // Cửa sổ trời
    private boolean sunroof;
    // màn hình dvd
    private boolean dvdScreen;
    // tự lái hoặc có tài
    private boolean driver;
    // map
    private boolean maps;
    // ghế tre em
    private boolean babyseat;
    // lốp dự phòng
    private boolean spareTire;
    // usb
    private boolean usb;
    // cảnh báo va chạm
    private boolean impactSensor;
    // nắp thùng xe bán tải
    private boolean bonnet;
    // thu phí không dừng
    private boolean etc;
    // túi khí an toàn
    private boolean airbags;
    // số sàn hoặc tự dộng
    private boolean manualTransmissionCar;

    private Date createDate;
    private Date updateDate;

    private BrandCar brandCar;

    private List<Booking> booking;

    private User user;

}
