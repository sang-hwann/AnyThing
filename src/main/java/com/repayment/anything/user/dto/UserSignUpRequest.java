package com.repayment.anything.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSignUpRequest {

    private String UserEmail;

    private String UserPassWord;

    private String UserName;

    private String userNickName;

}
