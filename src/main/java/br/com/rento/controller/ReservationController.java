package br.com.rento.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rento.dto.ReservationRequest;
import br.com.rento.dto.ReservationResponse;
import br.com.rento.service.ReservationContext;
import br.com.rento.strategy.CarReservationStrategy;
import br.com.rento.strategy.ClothReservationStrategy;
import br.com.rento.strategy.GenericProductReservationStrategy;
import br.com.rento.strategy.PropertyReservationStrategy;
import br.com.rento.strategy.ReservationType;

@RestController
@RequestMapping("/api")
public class ReservationController {

    private final ReservationContext reservationContext;
    private final CarReservationStrategy carReservationStrategy;
    private final ClothReservationStrategy clothReservationStrategy;
    private final PropertyReservationStrategy propertyReservationStrategy;
    private final GenericProductReservationStrategy genericProductReservationStrategy;

    public ReservationController(ReservationContext reservationContext,
            CarReservationStrategy carReservationStrategy,
            PropertyReservationStrategy propertyReservationStrategy,
            ClothReservationStrategy clothReservationStrategy,
            GenericProductReservationStrategy genericProductReservationStrategy) {
        this.reservationContext = reservationContext;
        this.carReservationStrategy = carReservationStrategy;
        this.propertyReservationStrategy = propertyReservationStrategy;
        this.clothReservationStrategy = clothReservationStrategy;
        this.genericProductReservationStrategy = genericProductReservationStrategy;
    }

    @PostMapping("/reservations")
    public ReservationResponse reserve(@RequestBody ReservationRequest request) {
        ReservationType type = request.getType();
        switch (type) {
            case CAR:
                reservationContext.setReservationStrategy(carReservationStrategy);
                break;
            case PROPERTY:
                reservationContext.setReservationStrategy(propertyReservationStrategy);
                break;
            case CLOTH:
                reservationContext.setReservationStrategy(clothReservationStrategy);
                break;
            case GENERIC:
                reservationContext.setReservationStrategy(genericProductReservationStrategy);
                break;
            default:
                throw new IllegalArgumentException("Invalid reservation type: " + type);
        }
        return reservationContext.executeReservation(request.getData());
    }
}
