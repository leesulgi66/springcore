package com.sparta.springcore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor  // 주석코드
public class KakaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

//    public KakaoUserInfoDto(Long id, String nickname, String email) {
//        this.id = id;
//        this.nickname = nickname;
//        this.email = email;
//    }   롬복의 AllArgsConstructor 이 위의 생성자 코드를 대신 해 준다.

}
