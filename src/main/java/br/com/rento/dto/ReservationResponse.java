package br.com.rento.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationResponse {
    private String message;
    private String customerId;
    private String startDate;
    private String endDate;
    private String location;
    private String additionalInfo;

}
