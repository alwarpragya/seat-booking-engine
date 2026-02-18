package com.pragya.seat_booking_engine.controller;

import com.pragya.seat_booking_engine.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seats")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book/{id}")
    public ResponseEntity<String> bookSeat(@PathVariable Long id) {
        try {
            String message = bookingService.bookSeat(id);
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }
}