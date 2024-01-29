package com.repayment.anything.global;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class WebSecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/public/**").permitAll() // /public/** 경로에 대해 로그인 없이 접근 허용
//                .anyRequest().authenticated() // 나머지는 로그인이 필요
//                .and()
//                .formLogin() // 폼 기반 로그인 활성화
//                .loginPage("/login") // 로그인 페이지 URL 지정
//                .permitAll()
//                .and()
//                .csrf().disable(); // CSRF 보안 비활성화 (개발 중에는 임시로 비활성화)
//    }
}
