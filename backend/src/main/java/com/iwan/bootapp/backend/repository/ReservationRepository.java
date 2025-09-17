package com.iwan.bootapp.backend.repository;

import com.iwan.bootapp.backend.model.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    
}
