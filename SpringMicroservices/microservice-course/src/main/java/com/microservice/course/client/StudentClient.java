package com.microservice.course.client;

import com.microservice.course.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "afhb-student", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/serach-by-course/{idCourse}")
    List<StudentDTO> findAllStudenByCourse(@PathVariable Long idCourse);
}
