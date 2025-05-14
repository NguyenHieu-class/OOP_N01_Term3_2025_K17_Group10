# 🚗 Car Rental System - Entity Overview

This project defines a car rental system using Spring Boot and JPA. The three core entities are:

- `User`: Represents the customer or vehicle owner.
- `Car`: Contains information about the car available for rent.
- `Booking`: Represents the rental booking made by a user.

---

## 📘 Entity: User

### 🔑 Attributes

| Field             | Type      | Description                          |
|------------------|-----------|--------------------------------------|
| `idUser`         | `int`     | Unique identifier for the user       |
| `username`       | `String`  | Login username                       |
| `password`       | `String`  | Encrypted password                   |
| `nameDisplay`    | `String`  | Display name                         |
| `image`          | `String`  | Profile image URL                    |
| `phone`          | `String`  | Phone number                         |
| `email`          | `String`  | Email address                        |
| `address`        | `String`  | Physical address                     |
| `dateOfBirth`    | `String`  | Birthdate                            |
| `drivingLicense` | `String`  | License number                       |
| `ImgDrivingLicense` | `String`| License image                        |
| `sex`            | `boolean` | Gender (true = male, false = female) |
| `createDate`     | `Date`    | Date user was created                |
| `updateDate`     | `Date`    | Date user was last updated           |
| `totalMoney`     | `int`     | Total money spent                    |
| `booking`        | `List<Booking>` | Bookings made by user        |
| `cars`           | `List<Car>` | Cars owned by the user              |

---

## 🚗 Entity: Car

### 🔑 Attributes

| Field                   | Type      | Description                              |
|------------------------|-----------|------------------------------------------|
| `idCar`                | `int`     | Car ID                                   |
| `nameCar`              | `String`  | Name of the car                          |
| `overviewCar`          | `String`  | Short description                        |
| `price`                | `int`     | Standard price                           |
| `promotionalPrice`     | `int`     | Discount price                           |
| `oldPromotionalPrice`  | `int`     | Previous promotion                       |
| `licensePlates`        | `String`  | Car license plate                        |
| `modelYear`            | `int`     | Year of manufacture                      |
| `status`               | `int`     | Rental status                            |
| `fuel`                 | `boolean` | Fuel type: true = gasoline               |
| `fuelFor100km`         | `float`   | Fuel consumption                         |
| `maxDistanceDelivery`  | `int`     | Max delivery range                       |
| `deliveryFeeFor1km`    | `int`     | Delivery cost per km                     |
| `maximumKilometersperDay` | `int` | Max km per day                           |
| `limitCrossingfee1Km`  | `int`     | Extra fee per km                         |
| `numberOfSeats`        | `int`     | Number of seats                          |
| `manualTransmissionCar`| `boolean` | Transmission type                        |
| `driver`               | `boolean` | With driver or not                       |
| `addressCar`           | `String`  | Parking location                         |
| `avatarCar` / `imageCar`| `String` | Images                                   |
| `createDate` / `updateDate` | `Date`| Dates                                    |
| `brandCar`             | `BrandCar`| Car brand                                |
| `user`                 | `User`    | Car owner                                |
| `booking`              | `List<Booking>` | Bookings of this car              |

### 🚘 Features (booleans):
Includes: bluetooth, GPS, dashCam, reverseCam, 360 camera, sunroof, DVD screen, baby seat, spare tire, airbags, etc.

---

## 📄 Entity: Booking

### 🔑 Attributes

| Field           | Type    | Description                     |
|----------------|---------|---------------------------------|
| `idBooking`     | `int`   | Unique booking ID               |
| `phone`         | `String`| Contact phone                   |
| `address`       | `String`| Delivery address                |
| `statusBill`    | `int`   | Status of booking               |
| `dateStart`     | `Date`  | Rental start date               |
| `dateEnd`       | `Date`  | Rental end date                 |
| `billTotal`     | `int`   | Total bill amount               |
| `createDate`    | `Date`  | Creation time                   |
| `updateDate`    | `Date`  | Last updated time               |
| `car`           | `Car`   | Booked car                      |
| `user`          | `User`  | Customer who made the booking   |

---

## 📦 Repository Interfaces

Each entity has a corresponding `JpaRepository` interface for database interaction:
- `UserRepository`
- `CarRepository`
- `BookingRepository`

They include custom queries for filtering by status, searching by name, time range queries, and revenue statistics.

---

## 🧩 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / PostgreSQL

---

## 🔗 Relationships

- `User` 1 --- * `Booking`
- `User` 1 --- * `Car`
- `Car` 1 --- * `Booking`

---

> Created as part of the Car Rental Management System — feel free to extend functionality such as payment, review system, or real-time availability checking.

