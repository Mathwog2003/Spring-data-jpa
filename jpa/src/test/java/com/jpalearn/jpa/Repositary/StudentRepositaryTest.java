package com.jpalearn.jpa.Repositary;

import com.jpalearn.jpa.Entity.Guardian;
import com.jpalearn.jpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositaryTest {

    @Autowired
    StudentRepositary studentRepositary;

    @Test
    public void saveStudent()
    {
        Student student = Student.builder()
                .firstName("gowtham")
                .lastName("selva")
                .mailId("gowtham@gmail.com")
//                .guardianName("uma")
//                .GuardianMobile("9090909090")
//                .GuardianMailId("guardian@gmail.com")
                .build();

        studentRepositary.save(student);
    }

    @Test
    public void saveStudentWithGuardian()
    {
        Guardian guardian = Guardian.builder()
                .name("u")
                .email("guaean@gmail.com")
                .mobile("93939393939")
                .build();
        Student student = Student.builder()
                .firstName("g")
                .lastName("selva")
                .mailId("gowtm34@gmail.com")
                .guardian(guardian)
                .build();

        studentRepositary.save(student);
    }

    @Test
    public void getListOfStudents()
    {
        List<Student> studentList = studentRepositary.findAll();
        System.out.print("hiiii" +studentList);
    }

    @Test
    public void printfindByFirstName(){
        List<Student> student = studentRepositary.findByFirstName("gowtham");
        System.out.println(student);
    }

    @Test
    public void printfindByFirstNameContaining(){
        List<Student> student = studentRepositary.findByFirstNameContaining("go");
        System.out.println(student);
    }

    @Test
    public void printfindByGaurdiaName()
    {
        List<Student> student = studentRepositary.findByGuardianName("uma");
        System.out.println(student);
    }

    @Test
    public void PrintStudentByFirstNameandLastname()
    {
        List<Student> student = studentRepositary.findByFirstNameAndLastName("g","selva");
        System.out.println(student);
    }

}