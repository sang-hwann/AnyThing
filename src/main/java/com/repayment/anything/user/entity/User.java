package com.repayment.anything.user.entity;

import com.repayment.anything.user.type.UserStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity //엔티티 선언
public class User {
    @Id //아이디 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) //JPA 기본키 생성
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "userPassWord", nullable = false)
    private String userPassWord;

    @Column(name = "userEmail", nullable = false, unique = true)
    private String userEmail;

    @Column(name = "userBrithDate")
    private LocalDateTime userBrithDate;

    @Column(name = "userGender")
    private String userGender;

    @Column(name = "userCreatedAt")
    private LocalDateTime userCreatedAt;

    @Column(name = "userUpdatedAt")
    private LocalDateTime userUpdatedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "userStatus", nullable = false, columnDefinition = "ENUM('USER', 'ADMIN')")
    private UserStatus userStatus;


    //생성자
    public User(Long userId, String userName, String userPassWord, String userEmail, LocalDateTime userBrithDate, String userGender, LocalDateTime userCreatedAt, LocalDateTime userUpdatedAt, UserStatus userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userPassWord = userPassWord;
        this.userEmail = userEmail;
        this.userBrithDate = userBrithDate;
        this.userGender = userGender;
        this.userCreatedAt = userCreatedAt;
        this.userUpdatedAt = userUpdatedAt;
        this.userStatus = userStatus;
    }

}
