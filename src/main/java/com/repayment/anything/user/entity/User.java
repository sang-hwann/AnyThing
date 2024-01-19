package com.repayment.anything.user.entity;

import com.repayment.anything.user.dto.UserSignUpRequest;
import com.repayment.anything.user.type.UserStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity //엔티티 선언
@Getter
public class User {
    @Id //아이디 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) //JPA 기본키 생성
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userEmail", nullable = false, unique = true)
    private String userEmail;
    @Column(name = "userPassWord", nullable = false)
    private String userPassWord;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "userNickName", nullable = false, unique = true)
    private String userNickName;

    @Column(name = "userBrithDate")
    private LocalDateTime userBrithDate;

    @Column(name = "userGender", nullable = false, columnDefinition = "ENUM('MALE', 'FEMALE')")
    private String userGender;

    @Column(name = "userCreatedAt")
    private LocalDateTime userCreatedAt;

    @Column(name = "userUpdatedAt")
    private LocalDateTime userUpdatedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "userStatus", nullable = false, columnDefinition = "ENUM('USER', 'ADMIN')")
    private UserStatus userStatus;


    //생성자
    public User(UserSignUpRequest userSignUpRequest) {
        this.userEmail = userSignUpRequest.getUserEmail();
        this.userPassWord = userSignUpRequest.getUserPassWord();
        this.userName = userSignUpRequest.getUserName();
        this.userNickName = userSignUpRequest.getUserNickName();
        this.userBrithDate = userSignUpRequest.getUserBirthDate();
        this.userGender = userSignUpRequest.getUserGender();

    }

    public User() {

    }
}
