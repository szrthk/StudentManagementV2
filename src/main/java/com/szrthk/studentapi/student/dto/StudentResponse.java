package com.szrthk.studentapi.student.dto;

@lombok.Value @lombok.Builder
public class StudentResponse {
    String id;
    String name;
    String email;
    int age;
}
