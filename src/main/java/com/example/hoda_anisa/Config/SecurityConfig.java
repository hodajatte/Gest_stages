package com.example.hoda_anisa.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
     private PasswordEncoder passwordEncoder;
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(User.withUsername("user1").password(passwordEncoder.encode("2000")).roles("ADMIN").build(),
                User.withUsername("user2").password(passwordEncoder.encode("123")).roles("Stagiaires").build(),
                User.withUsername("user3").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
                // Si on veut pas utiliser encoder on fait {noop}
                // User.withUsername("user1").password("{noop}2000").roles("ADMIN").build(),


        );
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.formLogin().loginPage("/login").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/static/**").permitAll();
       httpSecurity.authorizeHttpRequests().requestMatchers("css/style-responsive.css").permitAll();
      httpSecurity.authorizeHttpRequests().requestMatchers("css/style.css").permitAll();
     httpSecurity.authorizeHttpRequests().requestMatchers("img/bg-1.jpg").permitAll();
     httpSecurity.authorizeHttpRequests().requestMatchers("css/line-icons.css").permitAll();
     httpSecurity.authorizeHttpRequests().requestMatchers("css/style-responsive.css").permitAll();
    httpSecurity.authorizeHttpRequests().requestMatchers("css/font-awesome.css").permitAll();
     httpSecurity.authorizeHttpRequests().requestMatchers("css/elegant-icons-style.css").permitAll();
     httpSecurity.authorizeHttpRequests().requestMatchers("css/bootstrap.min.css").permitAll();
      //httpSecurity.authorizeHttpRequests().requestMatchers("js/html5shiv.js").permitAll();
    // httpSecurity.authorizeHttpRequests().requestMatchers("js/respond.min.js").permitAll();
       // httpSecurity.authorizeHttpRequests().requestMatchers("").permitAll();
        //httpSecurity.authorizeHttpRequests().requestMatchers(" img/bg-1.jpg").permitAll();

       /* httpSecurity.authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER");
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN");*/
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
                return httpSecurity.build();

    }

}
