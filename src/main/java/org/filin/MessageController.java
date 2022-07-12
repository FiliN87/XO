package org.filin;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/heyfilin")
@Log4j2
public class MessageController {

    @PostMapping("/youcool")
    @CrossOrigin(origins = "*")
    public String userName(@RequestBody UserNameRequest rq) {
        //System.out.println("login hyu:" + rq.getAnal());
        log.info("log:" + rq);
        return "visit site-https://rt.pornhub.com/";
    }

}