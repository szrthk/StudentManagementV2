package com.szrthk.studentapi.student.service;

import com.szrthk.studentapi.student.dto.StudentCreateRequest;
import com.szrthk.studentapi.student.dto.StudentResponse;
import com.szrthk.studentapi.student.model.StudentEntity;
import com.szrthk.studentapi.student.repo.StudentRepositery;
import com.szrthk.studentapi.student.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepositery repo;

public StudentServiceImpl(StudentRepositery repo){
    this.repo = repo;
}


@Override
public StudentResponse create(StudentCreateRequest d){
    var e = new StudentEntity(null, d.getName(), d.getEmail(), d.getAge());
    var saved = repo.save(e);
    return toResponse(saved);
}
@Override
public StudentResponse getbyid(String id){
  var e = repo.findById(id).orElseThrow(() -> new NotFoundException("student not found"));
  return toResponse(e);
}
private StudentResponse toResponse(StudentEntity e) {
    return StudentResponse.builder()
            .id(e.getId())
            .name(e.getName())
            .email(e.getEmail())
            .age(e.getAge())
            .build();
}
}