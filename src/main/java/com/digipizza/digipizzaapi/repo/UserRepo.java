package com.digipizza.digipizzaapi.repo;

import com.digipizza.digipizzaapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM user u WHERE u.email = ?1", nativeQuery = true)
    User findByEmail(String email);
}
