package br.com.rento.service;

import br.com.rento.dto.ReservationRequest.ReservationData;
import br.com.rento.dto.ReservationResponse;
import br.com.rento.strategy.ReservationStrategy;
import org.springframework.stereotype.Service;

@Service
public class ReservationContext {

    private ReservationStrategy reservationStrategy;

    public void setReservationStrategy(ReservationStrategy reservationStrategy) {
        this.reservationStrategy = reservationStrategy;
    }

    public ReservationResponse executeReservation(ReservationData data) {
        if (reservationStrategy == null) {
            throw new IllegalStateException("Reservation strategy is not set");
        }
        return reservationStrategy.reserve(data);
    }
}
