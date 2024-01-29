package com.repayment.anything.user.service;

import com.repayment.anything.user.dto.UserSignUpRequest;
import com.repayment.anything.user.entity.User;
import com.repayment.anything.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String userSignUp(UserSignUpRequest userSignUpRequest) {
        if (userRepository.existsUserByUserEmail(userSignUpRequest.getUserEmail())) {
            return "중복된 이메일입니다.";
        }
        String password = passwordEncoder.encode(userSignUpRequest.getUserPassWord());

        User user = new User(userSignUpRequest, password);
        userRepository.save(user);
        return "회원가입 완료";
    }
}
