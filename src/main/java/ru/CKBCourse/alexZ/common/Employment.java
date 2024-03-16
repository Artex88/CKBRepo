package ru.CKBCourse.alexZ.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employment implements Saleable{

    private long id;
    private String name;

    private String performerName;

    public Employment(long id, String name, String performerName) {
        this.id = id;
        this.name = name;
        this.performerName = performerName;
    }

    @PostConstruct
    public void init() {
        log.info("This is a service {}. The performer will be {} ", name, performerName);
    }

    @Override
    @PreDestroy
    public void sold() {
        log.info("Thanks for buy a service {} . Good luck.", name);
    }
}
