package com.example.mailr.scheduling;

import com.example.mailr.service.DumbLoggingService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoggingJob implements Job {

    @Autowired
    private DumbLoggingService loggingService;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        loggingService.executeLogging();
    }
}