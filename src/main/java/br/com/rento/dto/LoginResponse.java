package br.com.rento.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoginResponse {
    private String token;

    private Long expiresIn;

    // Getters and setters...
}