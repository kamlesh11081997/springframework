package com.corespring.framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportsConfig.class);
        TennisCoach theCoach=context.getBean("tennisCoach",TennisCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneService());
        System.out.println(theCoach.getInfo());
    }
}
