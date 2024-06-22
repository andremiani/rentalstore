// package br.com.rento.controller;

// import org.springframework.http.ResponseEntity;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import br.com.rento.dto.RegisterUserDto;
// import br.com.rento.model.User;
// import br.com.rento.service.UserService;

// @RequestMapping("/admins")
// @RestController
// public class AdminController {
// private final UserService userService;

// public AdminController(UserService userService) {
// this.userService = userService;
// }

// @PostMapping
// @PreAuthorize("hasRole('SUPER_ADMIN')")
// public ResponseEntity<User> createAdministrator(@RequestBody RegisterUserDto
// registerUserDto) {
// User createdAdmin = userService.createAdministrator(registerUserDto);

// System.out.println("aqui");
// System.out.println(createdAdmin);

// return ResponseEntity.ok(createdAdmin);
// }
// }