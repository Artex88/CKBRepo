package ru.CKBCourse.alexZ.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Item implements Saleable{
    private long id;
    private String name;

    private String material;

    public Item(long id, String name, String material) {
        this.id = id;
        this.name = name;
        this.material = material;
    }

    @PostConstruct
    public void init() {
        log.info("This is a " + name + " made of " + material);
    }

    @Override
    @PreDestroy
    public void sold() {
        log.info("Thanks for bye item " + name + ". Good luck.");
    }
}
