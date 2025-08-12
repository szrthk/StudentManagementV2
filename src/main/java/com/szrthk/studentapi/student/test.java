package com.szrthk.studentapi.student;

// The error "The import com.szrthk.studentapi.student.repository cannot be resolved" means that
// the package or class 'StudentRepository' does not exist at the specified path, or is not compiled.
// Make sure that:
// 1. The file StudentRepository.java exists in src/main/java/com/szrthk/studentapi/student/repository/
// 2. The class is named 'StudentRepository' and is public.
// 3. The build system (Maven/Gradle) has compiled the file.
// 4. There are no typos in the package or class name.

import com.szrthk.studentapi.student.model.StudentEntity;
import com.szrthk.studentapi.student.repo.StudentRepositery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SeedConfig {
  @Bean
  CommandLineRunner seed(StudentRepositery repo) {
    return args -> {
      if (repo.count() == 0) {
        repo.save(new StudentEntity(null, "Amit", "amit@example.com", 21));
      }
    };
  }
}
