package com.example.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    private final JPAStreamer jpaStreamer;

    public FilmService(JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }
}
