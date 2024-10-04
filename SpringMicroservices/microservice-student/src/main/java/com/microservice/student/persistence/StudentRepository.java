package com.microservice.student.persistence;

import com.microservice.student.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    // --> Listar todos los estudiante que esten en ese curos del id <--

    // Sin utlizar los queryMethod
    @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    List<Student> findAllByStudnet(Long idCourse);

    // Utilizando queryMethod
    //List<String> findAllByCourseId (long idCurso);
}
