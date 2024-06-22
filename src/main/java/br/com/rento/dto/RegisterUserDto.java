package br.com.rento.dto;

// import java.util.Set;

// import br.com.rento.model.Company;
// import br.com.rento.model.Role;
// import br.com.rento.model.Store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    // private Set<Role> roles;

    // private Company company;

    // private Store store;

    // getters and setters here...
}