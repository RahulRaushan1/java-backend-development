package com.cfs.Security_DemoP02.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth->auth
                .requestMatchers("/","/about","/contactUS").permitAll()
                .requestMatchers("/transfer","/admin").authenticated()
        ).httpBasic(Customizer.withDefaults());

        return http.build();
    }
}


