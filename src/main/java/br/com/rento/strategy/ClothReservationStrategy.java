package br.com.rento.strategy;

import org.springframework.stereotype.Service;

import br.com.rento.dto.ReservationRequest.ReservationData;
import br.com.rento.dto.ReservationResponse;

@Service
public class ClothReservationStrategy implements ReservationStrategy {

    @Override
    public ReservationResponse reserve(ReservationData data) {
        // Implement your property reservation logic here using data

        // Implement other steps like validateData, checkAvailability, calculatePrice,
        // confirmReservation, sendNotification as needed

        ReservationResponse response = new ReservationResponse();
        response.setMessage("Cloth reserved successfully!");
        response.setCustomerId(data.getCustomerId());
        response.setStartDate(data.getStartDate());
        response.setEndDate(data.getEndDate());
        response.setLocation(data.getLocation());
        response.setAdditionalInfo(data.getAdditionalInfo());

        return response;

    }

    @Override
    public void validateData() {
        // Implementation of data validation for cloth reservation
        System.out.println("Validating cloth reservation data...");
    }

    @Override
    public void checkAvailability() {
        // Implementation of availability check for cloth
        System.out.println("Checking cloth availability...");
    }

    @Override
    public void calculatePrice() {
        // Implementation of price calculation for cloth reservation
        System.out.println("Calculating price for cloth reservation...");
    }

    @Override
    public void confirmReservation() {
        // Implementation of reservation confirmation for cloth
        System.out.println("Confirming cloth reservation...");
    }

    @Override
    public void sendNotification() {
        // Implementation of notification sending for cloth reservation
        System.out.println("Sending cloth reservation notification...");
    }
}
