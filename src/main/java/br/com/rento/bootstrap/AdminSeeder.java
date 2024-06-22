// package br.com.rento.bootstrap;

// import org.springframework.context.ApplicationListener;
// import org.springframework.context.event.ContextRefreshedEvent;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Component;

// import br.com.rento.model.Role;
// import br.com.rento.model.RoleName;
// import br.com.rento.model.User;
// import br.com.rento.repository.RoleRepository;
// import br.com.rento.repository.UserRepository;

// import java.util.HashSet;
// import java.util.Set;

// @Component
// public class AdminSeeder implements
// ApplicationListener<ContextRefreshedEvent> {
// private final RoleRepository roleRepository;
// private final UserRepository userRepository;

// private final PasswordEncoder passwordEncoder;

// public AdminSeeder(
// RoleRepository roleRepository,
// UserRepository userRepository,
// PasswordEncoder passwordEncoder) {
// this.roleRepository = roleRepository;
// this.userRepository = userRepository;
// this.passwordEncoder = passwordEncoder;
// }

// @Override
// public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
// this.createSuperAdministrator();
// }

// private void createSuperAdministrator() {

// // Create new user's account
// User user = new User("superadmin",
// "superadmin@example.com",
// passwordEncoder.encode("12345678"));

// Set<Role> roles = new HashSet<>();
// roles.add();

// user.setRoles(roles);
// userRepository.save(user);

// }
// }