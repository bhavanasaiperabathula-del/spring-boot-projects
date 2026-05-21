package com.example.authorization.utility;

import com.example.authorization.entity.Roles;
import com.example.authorization.entity.Users;
import com.example.authorization.repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInit {

    @Bean
    public CommandLineRunner createAdminUser(UserDetailsRepository userRepository, PasswordEncoder passwordEncoder){
        return args -> {
            if(userRepository.findByUsername("admin").isEmpty()){
                Users admin = new Users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole(Roles.ADMIN);

                userRepository.save(admin);
                System.out.println("Default admin user created!");
            }else if(userRepository.findByUsername("user").isEmpty()){
                Users user = new Users();
                user.setUsername("user");
                user.setPassword(passwordEncoder.encode("user123"));
                user.setRole(Roles.USER);
                userRepository.save(user);
                System.out.println("user created!");
            }
        };
    }
}