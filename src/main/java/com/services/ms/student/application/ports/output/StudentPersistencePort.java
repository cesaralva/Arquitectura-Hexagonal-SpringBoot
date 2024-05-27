package com.services.ms.student.application.ports.output;

import com.services.ms.student.domain.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentPersistencePort {

    //Persistencia estrictamente
    Optional<Student> findById(Long id);

    List<Student> findAll();

    Student save(Student student);

    void deleteById(Long id);


}
