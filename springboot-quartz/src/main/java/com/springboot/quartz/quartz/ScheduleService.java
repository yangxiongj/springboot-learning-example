package com.springboot.quartz.quartz;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduleService {
    private Logger logg = LoggerFactory.getLogger(ScheduleService.class);
    @Scheduled(cron="0/5* * * * *")  //通过表达式来配置任务执行时间
    public void scheduled(){
        logg.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 5000)//定义一个频率执行
    public void scheduled2(){
        logg.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
    }














}
