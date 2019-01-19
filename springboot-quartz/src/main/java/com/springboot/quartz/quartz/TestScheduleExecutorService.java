package com.springboot.quartz.quartz;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduleExecutorService {
    public static void main(String[] args){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //参数：1，任务体，2首次执行的延长时间
        service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+new Date()), 0, 3, TimeUnit.SECONDS);
    }
}
