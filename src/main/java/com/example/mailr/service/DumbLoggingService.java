package com.example.mailr.service;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DumbLoggingService {

    public void executeLogging() throws JobExecutionException {

        log.info("The logging has begun...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            log.error("Error while logging", e);
            throw new JobExecutionException(e);
        } finally {
            log.info("Logging has finished...");
        }
    }
}