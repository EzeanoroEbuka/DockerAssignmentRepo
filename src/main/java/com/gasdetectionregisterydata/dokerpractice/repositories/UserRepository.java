package com.gasdetectionregisterydata.dokerpractice.repositories;

import com.gasdetectionregisterydata.dokerpractice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
