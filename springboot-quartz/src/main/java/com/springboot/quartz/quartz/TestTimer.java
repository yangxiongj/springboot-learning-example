package com.springboot.quartz.quartz;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task run" +new Date());
            }
        };
        Timer timer  = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延时执行,这里是3秒执行一次
        timer.schedule(timerTask,10,3000);
    }
}
