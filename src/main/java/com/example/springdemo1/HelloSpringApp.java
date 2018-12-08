package com.example.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        //load the string configuration file
       ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container
       Coach theCoach = context.getBean("myCoach",Coach.class);

        //call methods on the bean
       System.out.println(theCoach.getDailyWorkout());
       System.out.println(theCoach.getDailyFortune());
       //close context
        context.close();
    }
}
