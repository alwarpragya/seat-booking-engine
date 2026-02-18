package com.pragya.seat_booking_engine.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;
    private boolean isBooked;

    @Version // CRITICAL: This enables Optimistic Locking
    private Long version;
}