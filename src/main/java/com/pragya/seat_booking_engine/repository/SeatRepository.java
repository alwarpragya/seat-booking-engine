package com.pragya.seat_booking_engine.repository;

import com.pragya.seat_booking_engine.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}