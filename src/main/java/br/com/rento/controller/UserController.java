// package br.com.rento.controller;

// import br.com.rento.model.User;
// import br.com.rento.service.UserService;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/users")
// public class UserController {

// @Autowired
// private final UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("/me")
// @PreAuthorize("isAuthenticated()")
// public ResponseEntity<User> authenticatedUser() {
// Authentication authentication =
// SecurityContextHolder.getContext().getAuthentication();

// User currentUser = (User) authentication.getPrincipal();

// return ResponseEntity.ok(currentUser);
// }

// @GetMapping("/list")
// @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
// public ResponseEntity<List<User>> allUsers() {
// List<User> users = userService.findAll();

// return ResponseEntity.ok(users);
// }
// }