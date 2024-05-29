package com.services.ms.student.infrastructure.adapters.output.persistence.mapper;

import com.services.ms.student.domain.model.Student;
import com.services.ms.student.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {
    Student toStudent(StudentEntity studentEntity);
    StudentEntity toStudentEntity(Student student);
    List<Student> toStudentEntityList(List<StudentEntity> studentEntityList);

}
