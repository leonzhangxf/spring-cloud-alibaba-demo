package com.leonzhangxf.alidemo.svca;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SvcaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SvcaApplication.class).run(args);
    }
}
