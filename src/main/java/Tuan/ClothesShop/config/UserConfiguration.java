package Tuan.ClothesShop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class UserConfiguration{
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
//		
//		authenticationManagerBuilder
		
		http
			.authorizeHttpRequests((requests) -> requests
					.requestMatchers("/resources/**", "/static/**", "/assets/**", "/css/**", "/js/**").permitAll()
					.requestMatchers("/", "/trang-chu", "/lien-he", "/dang-ky", "/quen-mat-khau").permitAll()
					.anyRequest().authenticated()
			)
			.formLogin((form) -> form
					.loginPage("/dang-nhap")
					.permitAll()
			).logout((logout) -> logout.permitAll());
		return http.build();
	}
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
//		authenticationManagerBuilder.passwordEncoder(passwordEncoder());
//		AuthenticationManager authenticationManager = authenticationManagerBuilder.build();
//		http
//			.csrf(AbstractHttpConfigurer::disable)
//			.authorizeHttpRequests( author ->
//					author.requestMatchers(PathRequest.toStaticResources().atCommonLocations())
//	}
}
