package com.example.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from sprin container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println ("\n Ponting to the same object: " + result);
        System.out.println ("\n Memory location for theCoach: " + theCoach);
        System.out.println ("\n Memory location for alphaCoach:  "+ alphaCoach);
        context.close();

    }
}
