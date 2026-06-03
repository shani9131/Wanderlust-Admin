package com.travel.jar.repository;

import com.travel.jar.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    // Ye ek line automatically 'SELECT * FROM account WHERE username = ? AND password = ?' query generate kar degi!
    Account findByUsernameAndPassword(String username, String password);
}