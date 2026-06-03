package com.travel.jar.repository;

import com.travel.jar.model.BookPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPackageRepository extends JpaRepository<BookPackage, Long> {
    java.util.List<BookPackage> findByUsername(String username);
}