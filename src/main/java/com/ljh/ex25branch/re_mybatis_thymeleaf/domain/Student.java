package com.ljh.ex25branch.re_mybatis_thymeleaf.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {

    private Long id;
    
    @NotBlank(message = "이름은 필수 입력 항목")
    private String name;
    
    @Email(message = "이메일은 @ 형식 필수")
    private String email;
    
    @Min(value = 1, message = "나이는 1세 이상만 입력 가능")
    private Integer age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
