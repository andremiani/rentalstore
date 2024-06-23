package br.com.rento.dto;

import br.com.rento.strategy.ReservationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequest {
    private ReservationType type;
    private ReservationData data;

    // Getters and setters

    @Getter
    @Setter
    public static class ReservationData {
        private String customerId;
        private String startDate;
        private String endDate;
        private String location;
        private String additionalInfo;

        // Getters and setters
    }

    // Getters and setters for type and data
}
