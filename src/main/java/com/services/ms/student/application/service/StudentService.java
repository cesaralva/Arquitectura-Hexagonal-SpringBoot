package com.services.ms.student.application.service;

import com.services.ms.student.application.ports.input.StudentServicePort;
import com.services.ms.student.application.ports.output.StudentPersistencePort;
import com.services.ms.student.domain.exception.StudentNotFoundException;
import com.services.ms.student.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort {


    private final StudentPersistencePort persistencePort;


    @Override
    public Student findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<Student> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Student save(Student student) {
        return persistencePort.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        return persistencePort.findById(id)
                .map(saveStudent -> {
                            saveStudent.setId(student.getId());
                            saveStudent.setFirstName(student.getFirstName());
                            saveStudent.setLastName(student.getLastName());
                            saveStudent.setAddress(student.getAddress());
                            saveStudent.setAge(student.getAge());
                            return persistencePort.save(saveStudent);
                        }

                ).orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new StudentNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
