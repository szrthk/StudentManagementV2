package com.szrthk.studentapi.student.dto;


import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.boot.web.servlet.ServletRegistration;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class StudentCreateRequest {
    @NotBlank @Size(max = 80)
    private String name;
    @NotBlank @Email
    private String email;
    @Min(16) @Max(100)
    private int age;
}
