/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.domain.Film;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Bean
    CommandLineRunner commandLineRunner(final JPAStreamer jpaStreamer) {
        return args -> {
            jpaStreamer.stream(Film.class)
                    .forEach(System.out::println);
            long count = jpaStreamer.stream(Film.class).count();
            System.out.println(count);
        };
    }
}
