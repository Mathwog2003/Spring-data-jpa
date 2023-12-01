package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student,Long>{
}
