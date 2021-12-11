package com.fernando.atividade01JPA.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    private final Logger log = LoggerFactory.getLogger(Home.class);

    @GetMapping(value={"/", "/login"})
    public ModelAndView home() {
        log.info("Página inicial aberta");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}