package com.travel.jar.controller;

import com.travel.jar.model.Account;
import com.travel.jar.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AccountRepository accountRepository;

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody Account account) {
        Account user = accountRepository.findByUsernameAndPassword(account.getUsername(), account.getPassword());
        if (user != null) {
            return "Success";
        }
        return "Invalid Username or Password!";
    }

    // SIGNUP API
    @PostMapping("/signup")
    public String signup(@RequestBody Account account) {
        // Check agar pehle se username hai
        if(accountRepository.existsById(account.getUsername())) {
            return "Username already exists!";
        }
        accountRepository.save(account);
        return "Account Created Successfully!";
    }

    // 1. GET SECURITY QUESTION API
    @GetMapping("/question/{username}")
    public String getSecurityQuestion(@PathVariable String username) {
        Account user = accountRepository.findById(username).orElse(null);
        if (user != null) {
            return user.getSecurityQuestion();
        }
        return "User not found";
    }

    // 2. UPDATE PASSWORD API
    @PostMapping("/update-password")
    public String updatePassword(@RequestBody Account accountRequest) {
        Account user = accountRepository.findById(accountRequest.getUsername()).orElse(null);
        if (user != null) {
            // Answer ko case-insensitive match kar rahe hain (taaki capital/small ki dikkat na ho)
            if (user.getAnswer().equalsIgnoreCase(accountRequest.getAnswer())) {
                user.setPassword(accountRequest.getPassword()); // Naya password set karo
                accountRepository.save(user);
                return "Password updated successfully!";
            } else {
                return "Incorrect Security Answer!";
            }
        }
        return "User not found";
    }
}