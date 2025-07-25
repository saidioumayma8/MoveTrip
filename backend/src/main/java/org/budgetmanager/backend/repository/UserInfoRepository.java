package org.budgetmanager.backend.repository;

// FIX: Change this import
// import com.ey.springboot3security.entity.UserInfo;
import org.budgetmanager.backend.model.UserInfo; // <-- CORRECTED IMPORT

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String email); // Use 'email' if that is the correct field for login
}