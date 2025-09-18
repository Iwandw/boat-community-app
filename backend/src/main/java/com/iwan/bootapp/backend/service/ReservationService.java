package com.iwan.bootapp.backend.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import com.iwan.bootapp.backend.repository.ReservationRepository;
import com.iwan.bootapp.backend.model.Reservation;
import com.iwan.bootapp.backend.model.User;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    
    public Reservation createReservation (User user, LocalDate startDate, LocalDate endDate) {
    Reservation reservation = new Reservation(startDate, endDate, user);
    return reservationRepository.save(reservation);
    }
}
