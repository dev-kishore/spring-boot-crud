package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student studentOne = new Student(
				"Student One",
				"studentOne@mail.com",
				LocalDate.of(2000, Month.JANUARY, 01)
			);

            Student studentTwo = new Student(
				"Student Two",
				"studentTwo@mail.com",
				LocalDate.of(2000, Month.JANUARY, 02)
			);

            repository.saveAll(
                List.of(studentOne, studentTwo)
            );
        };
    }
}
