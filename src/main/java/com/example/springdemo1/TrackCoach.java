package com.example.springdemo1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;


    public TrackCoach(){}
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it :" + fortuneService.getFortune();
    }

    public void doMyStartUpStuff (){
        System.out.println("Trackcoach: inside method doMyStartupStuff");
    }

    public void doMyCleanUpStuff (){
        System.out.println("Trackcoach: inside method doMyCleanUpStuff");
    }
}

