package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.Course;
import com.jpalearn.jpa.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositaryTest {

    @Autowired
    CourseMaterialRepositary courseMaterialRepositary;

    @Test
    public void saveCourseMaterial()
    {
        Course course = Course.builder()
                .title("python")
                .credit(5)
                .build();

        CourseMaterial courseMaterial =   CourseMaterial.builder()
                .url("www.course.com")
                .course(course)
                .build();

        courseMaterialRepositary.save(courseMaterial);
    }


}