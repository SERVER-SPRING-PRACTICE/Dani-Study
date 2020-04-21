package me.dani.springbootgettingstarted;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println("Application is starting");
        System.out.println("=======================");
    }
    //ApplicationContext가 만들어지기 이전에 발생한 이벤트는 bean으로 등록한다하더라도 동작을 안 함.
}
