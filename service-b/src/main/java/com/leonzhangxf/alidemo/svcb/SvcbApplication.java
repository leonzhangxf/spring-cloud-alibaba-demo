package com.leonzhangxf.alidemo.svcb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SvcbApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SvcbApplication.class).run(args);
    }
}
