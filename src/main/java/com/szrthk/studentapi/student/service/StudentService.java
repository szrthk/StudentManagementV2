package com.szrthk.studentapi.student.service;

import com.szrthk.studentapi.student.dto.StudentCreateRequest;
import com.szrthk.studentapi.student.dto.StudentResponse;

public interface StudentService {
    StudentResponse create(StudentCreateRequest dto);
    StudentResponse getbyid(String id);
}
