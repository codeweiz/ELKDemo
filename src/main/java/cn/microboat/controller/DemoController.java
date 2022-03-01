package cn.microboat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouwei
 */
@RestController
@Slf4j
public class DemoController {

    @GetMapping("/test")
    public void test() {
        log.info("message1");
        log.warn("message2");
        log.error("message3");
    }
}
