/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.domain.Film;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AppTest {

    @Autowired
    JPAStreamer jpaStreamer;

    @Test void japStreamerReady() {
        assertNotNull(jpaStreamer);
        List<Film> list = jpaStreamer.stream(Film.class).toList();
        assertEquals(list.size(), 0);

    }
}
