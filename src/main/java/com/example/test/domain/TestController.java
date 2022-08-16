package com.example.test.domain;

import ch.qos.logback.classic.Logger;
import com.example.test.TestApplication;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ResponseEntity test() {
        logger.info("Hello Controller");

        return new ResponseEntity("Okay", HttpStatus.OK);

    }
}
