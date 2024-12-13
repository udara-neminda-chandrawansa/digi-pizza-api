package com.digipizza.digipizzaapi.repo;

import com.digipizza.digipizzaapi.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

public interface PizzaRepo extends JpaRepository<Pizza, Integer> {

    // @Query(value = "SELECT * FROM user u WHERE u.email = ?1", nativeQuery = true)
    // User findByEmail(String email);
}
