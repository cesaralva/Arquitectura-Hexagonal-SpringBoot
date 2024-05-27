package com.services.ms.student.application.ports.input;

import com.services.ms.student.domain.model.Student;

import java.util.List;

public interface StudentServicePort {


    //ESTO ES CASOS DE USO DE NEGOCIO
    Student findById(Long id);

    List<Student> findAll();

    Student save(Student student);

    Student update(Long id, Student student);

    void deleteById(Long id);

}
