package com.example.kkk.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "flight_bookings")
public class FlightBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Column(nullable = false, name = "customer_id")
    private Integer customerId;

    @Column(nullable = false, name = "flight_id")
    private Integer flightId;


    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "flight_id", insertable = false, updatable = false)
    private Flight flight;

    public FlightBook() {
    }

    public FlightBook(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}