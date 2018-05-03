package com.czc.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by shiqian on 2018-04-27
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "0/5 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}