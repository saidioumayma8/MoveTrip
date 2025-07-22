package org.budgetmanager.backend.repository;

import org.budgetmanager.backend.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> { }

