package com.travel.jar.controller;
import java.util.List;
import com.travel.jar.model.BookHotel;
import com.travel.jar.repository.BookHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private BookHotelRepository bookHotelRepository;

    @PostMapping("/book")
    public String bookHotel(@RequestBody BookHotel booking) {
        bookHotelRepository.save(booking);
        return "Hotel Booked Successfully!";
    }
    @PutMapping("/pay/{username}")
    public String payHotel(@PathVariable String username) {
        java.util.List<BookHotel> bookings = bookHotelRepository.findByUsername(username);
        for (BookHotel b : bookings) {
            b.setStatus("Confirmed");
            bookHotelRepository.save(b);
        }
        return "Hotel Payment Confirmed";
    }
    @GetMapping("/all")
    public List<BookHotel> getAllHotelBookings() {
        return bookHotelRepository.findAll();
    }
    
}