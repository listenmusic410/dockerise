package com.dockerise.dockerise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<users, Long> {
    users findByEmail(String email);
    users findByEmailAndPassword(String email, String password);
}
