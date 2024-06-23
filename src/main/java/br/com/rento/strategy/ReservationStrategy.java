package br.com.rento.strategy;

import br.com.rento.dto.ReservationRequest.ReservationData;
import br.com.rento.dto.ReservationResponse;

public interface ReservationStrategy {
    void validateData();

    void checkAvailability();

    void calculatePrice();

    void confirmReservation();

    void sendNotification();

    ReservationResponse reserve(ReservationData data);
}
