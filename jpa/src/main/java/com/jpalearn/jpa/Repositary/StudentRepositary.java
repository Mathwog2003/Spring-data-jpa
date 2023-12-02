package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepositary extends JpaRepository<Student,Long>{

    public List<Student> findByFirstName(String firstName);
    public List<Student> findByFirstNameContaining(String name);
}
