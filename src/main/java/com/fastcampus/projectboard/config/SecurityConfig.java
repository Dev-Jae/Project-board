package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(autn -> autn.anyRequest().permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());


                /*.formLogin((formLogin) -> formLogin
                        .loginPage("/login")
                        .defaultSuccessUrl("/articles"))
                .logout((logout) -> logout
                        .logoutSuccessUrl("/logout")
                        .invalidateHttpSession(true));*/

        return httpSecurity.build();
    }
}
