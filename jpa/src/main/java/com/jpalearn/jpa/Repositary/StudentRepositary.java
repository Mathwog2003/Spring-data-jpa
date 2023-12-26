package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepositary extends JpaRepository<Student,Long>{

     List<Student> findByFirstName(String firstName);
     List<Student> findByFirstNameContaining(String name);
     List<Student> findByGuardianName(String guardianName);
     List<Student> findByFirstNameAndLastName(String firstName, String LastName);
     //JPQL
     @Query("select s from Student s where s.mailId = ?1")
     Student getStudentEmailQuery(String email);



}


