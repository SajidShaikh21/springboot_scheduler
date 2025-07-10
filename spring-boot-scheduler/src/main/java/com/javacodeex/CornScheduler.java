package com.javacodeex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CornScheduler {

    @Scheduled(cron = "* */2 * * * ?") // Correct 6-field cron expression
    public void task() {
        log.info("Cron Task - " + System.currentTimeMillis() / 1000);
    }

}
