package com.example.kkk.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "flight_number", length = 100, nullable = false, unique = true)
    private String number;

    @Column(length = 200, nullable = false)
    private String aircraft;

    @Column(nullable = false, name = "total_aircraft_seats")
    private Integer totalAircraftSeats;

    @Column(nullable = false, name = "flight_mileage")
    private Integer mileage;

    public Flight() {
    }

    public Flight(String number, String aircraft, Integer totalAircraftSeats, Integer mileage) {
        this.number = number;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.mileage = mileage;
    }

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }
}