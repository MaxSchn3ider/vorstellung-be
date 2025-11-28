package de.arvato.Max_Schneider.ratings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(cors -> cors.configure(http)) // Aktiviert CORS
                .csrf(AbstractHttpConfigurer::disable) // Deaktiviert CSRF
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().permitAll() // Erlaubt alle Anfragen ohne Authentifizierung
                );
        return http.build();
    }
}