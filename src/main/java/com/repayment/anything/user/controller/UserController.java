package com.repayment.anything.user.controller;

import com.repayment.anything.user.dto.UserSignUpRequest;
import com.repayment.anything.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public String userSignUp(@RequestBody @Validated UserSignUpRequest userSignUpRequest){
        return userService.userSignUp(userSignUpRequest);
    }
}
