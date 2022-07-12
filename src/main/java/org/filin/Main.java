package org.filin;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Log4j2
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        log.trace("level-1");
        log.debug("level-2");
        log.info("level-3");
        log.warn("level-4");
        log.error("level-5");
        log.fatal("level-6");
    }
}
