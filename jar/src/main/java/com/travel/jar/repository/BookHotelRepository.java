package com.travel.jar.repository;

import com.travel.jar.model.BookHotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookHotelRepository extends JpaRepository<BookHotel, Long> {
    java.util.List<BookHotel> findByUsername(String username); // Hotel wale mein
// Aur Package wale mein: java.util.List<BookPackage> findByUsername(String username);
}