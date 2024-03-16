package ru.CKBCourse.alexZ.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.CKBCourse.alexZ.common.Saleable;

@Service
@Log4j2
public class ShowServiceTwo {

    private Saleable item;

    private Saleable employment;

    @Autowired
    public void setEmployments(Saleable employment) {
        this.employment = employment;
    }
    @Autowired
    public void setItems(Saleable item) {
        this.item = item;
    }

    @PostConstruct
    public void init() {
        log.info("Goods shower created.");
    }

    @PreDestroy
    public void end() {
        log.info("Goods ended.");
    }
}
