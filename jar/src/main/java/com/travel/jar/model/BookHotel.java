package com.travel.jar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_hotel")
public class BookHotel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Booking ka unique ticket number
    
    private String username;
    private String hotelName;
    private int persons;
    private int days;
    private String ac;
    private String totalPrice;
    private String status = "Pending";

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }

    public int getPersons() { return persons; }
    public void setPersons(int persons) { this.persons = persons; }

    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }

    public String getAc() { return ac; }
    public void setAc(String ac) { this.ac = ac; }

    public String getTotalPrice() { return totalPrice; }
    public void setTotalPrice(String totalPrice) { this.totalPrice = totalPrice; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}