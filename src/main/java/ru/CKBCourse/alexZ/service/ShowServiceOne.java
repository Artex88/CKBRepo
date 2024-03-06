package ru.CKBCourse.alexZ.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.CKBCourse.alexZ.common.Employment;
import ru.CKBCourse.alexZ.common.Item;

@Service
@Log4j2
public class ShowServiceOne {

    @Autowired
    private Item item;

    @Autowired
    private Employment employment;

    @PostConstruct
    public void init() {
        log.info("Goods shower created.");
    }

    @PreDestroy
    public void end() {
        log.info("Goods ended.");
    }
}
