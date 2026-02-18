package com.pragya.seat_booking_engine.service;

import com.pragya.seat_booking_engine.entity.Seat;
import com.pragya.seat_booking_engine.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {

    @Autowired
    private SeatRepository seatRepository;

    @Transactional
    public String bookSeat(Long seatId) {
        Seat seat = seatRepository.findById(seatId)
                .orElseThrow(() -> new RuntimeException("Seat not found"));

        if (seat.isBooked()) {
            throw new RuntimeException("Seat already booked by another user!");
        }

        seat.setBooked(true);
        seatRepository.save(seat); // Hibernate automatically checks the 'version' here
        return "Seat " + seat.getSeatNumber() + " successfully booked!";
    }
}