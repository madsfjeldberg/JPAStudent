package dev.jpastudent.config;

import dev.jpastudent.model.Student;
import dev.jpastudent.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student("John", LocalDate.of(1990, 1, 1), LocalTime.of(12, 0));
        studentRepository.save(s1);
        studentRepository.save(new Student("Mary", LocalDate.of(1991, 2, 2), LocalTime.of(13, 0)));
        studentRepository.save(new Student("Peter", LocalDate.of(1992, 3, 3), LocalTime.of(14, 0)));
        studentRepository.save(new Student("Paul", LocalDate.of(1993, 4, 4), LocalTime.of(15, 0)));
        studentRepository.save(new Student("James", LocalDate.of(1994, 5, 5), LocalTime.of(16, 0)));


    }
}
