package com.project.CarRental.repository;

import java.util.List;
import java.util.Date;

import com.project.CarRental.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findBookingByUserIdUserOrderByDateStartDesc(int idUser);

    List<Booking> findBookingByUserIdUserAndStatusBillOrderByDateStartDesc(int idUser, int statusBill);

    void changeStatusBill(int statusBill, int idBooking);

    List<Booking> getAllBookingWithCarOwner(int idUser);

    List<Booking> getAllBookingWithCarOwnerAndStatusBill(int idUser, int statusBill);

    List<Booking> getAllBookingByStatusBill(int statusBill);

    List<Booking> findBookingByCarIdCarAndDateStartGreaterThanEqualAndDateEndLessThanEqual(int idCar, Date dateStart, Date dateEnd);

    List<Booking> checkBillExistOnTime(int idCar, String dateStart, String dateEnd);

    List<Booking> getAllBookingOnTime(String dateStart, String dateEnd);

    int countByCarIdCar(int idCar);
    long count();

    List<Booking> findBookingByStatusBill(int statusBill);

    String[] sumRevenueOnTime(String dateStart, String dateEnd, int statusBill);

    String[] sumRevenueOnTimeByIdUser(String dateStart, String dateEnd, int statusBill, int idUser);

    List<Booking> getAllBookingOnTimeByIdUserHaveCar(String dateStart, String dateEnd, int statusBill, int idUser);

    List<Booking> getBookingOnTimeByStatusBill(String dateStart, String dateEnd, int statusBill);
}
