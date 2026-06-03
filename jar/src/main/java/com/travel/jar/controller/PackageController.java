package com.travel.jar.controller;
import java.util.List;
import com.travel.jar.model.BookPackage;
import com.travel.jar.repository.BookPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/packages")
@CrossOrigin("*")
public class PackageController {

    @Autowired
    private BookPackageRepository bookPackageRepository;

    @PostMapping("/book")
    public String bookPackage(@RequestBody BookPackage bookPackage) {
        bookPackageRepository.save(bookPackage);
        return "Package Booked Successfully!";
    }

    @PutMapping("/pay/{username}")
    public String payPackage(@PathVariable String username) {
        java.util.List<BookPackage> bookings = bookPackageRepository.findByUsername(username);
        for (BookPackage b : bookings) {
            b.setStatus("Confirmed");
            bookPackageRepository.save(b);
        }
        return "Package Payment Confirmed";
    }
    @GetMapping("/all")
    public List<BookPackage> getAllPackageBookings() {
        return bookPackageRepository.findAll();
    }
}