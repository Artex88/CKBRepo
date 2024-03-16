package ru.CKBCourse.alexZ.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.CKBCourse.alexZ.common.Saleable;

@Service
@Log4j2
public class ShowServiceOne {

    @Autowired
    private Saleable item;

    @Autowired
    private Saleable employment;

    @PostConstruct
    public void init() {
        log.info("Goods shower created.");
    }

    @PreDestroy
    public void end() {
        log.info("Goods ended.");
    }
}
