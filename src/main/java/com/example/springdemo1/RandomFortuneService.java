package com.example.springdemo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String [] fortunes = {"Today is your lucky day!","Tomorrow is your lucky day", "Yesterday was your lucky day"};

    @Override
    public String getFortune() {
        final int idx = new Random().nextInt(fortunes.length);
        final String random = (fortunes[idx]);

        return random ;
    }
}
