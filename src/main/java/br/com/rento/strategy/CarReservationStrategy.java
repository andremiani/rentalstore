package br.com.rento.strategy;

import org.springframework.stereotype.Service;

import br.com.rento.dto.ReservationRequest.ReservationData;
import br.com.rento.dto.ReservationResponse;

@Service
public class CarReservationStrategy implements ReservationStrategy {

    @Override
    public ReservationResponse reserve(ReservationData data) {
        // // Implement your property reservation logic here using data

        ReservationResponse response = new ReservationResponse();
        response.setMessage("Car reserved successfully!");
        response.setCustomerId(data.getCustomerId());
        response.setStartDate(data.getStartDate());
        response.setEndDate(data.getEndDate());
        response.setLocation(data.getLocation());
        response.setAdditionalInfo(data.getAdditionalInfo());

        return response;

        // Implement other steps like validateData, checkAvailability, calculatePrice,
        // confirmReservation, sendNotification as needed
    }

    @Override
    public void validateData() {
        // Implementation of data validation for car reservation
        System.out.println("Validating car reservation data...");
    }

    @Override
    public void checkAvailability() {
        // Implementation of availability check for car
        System.out.println("Checking car availability...");
    }

    @Override
    public void calculatePrice() {
        // Implementation of price calculation for car reservation
        System.out.println("Calculating price for car reservation...");
    }

    @Override
    public void confirmReservation() {
        // Implementation of reservation confirmation for car
        System.out.println("Confirming car reservation...");
    }

    @Override
    public void sendNotification() {
        // Implementation of notification sending for car reservation
        System.out.println("Sending car reservation notification...");
    }
}