package com.corespring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String name;

    @Override
    public String getDailyWorkout() {
        return "Get Daily workout by Tennis";
    }

    public String getFortuneService(){
        return fortuneService.getFortune();
    }

    public String getInfo(){
        return "email: "+email+" name: "+name;
    }
}
