package com.szrthk.studentapi.student.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Document("students")
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private int age;
}
