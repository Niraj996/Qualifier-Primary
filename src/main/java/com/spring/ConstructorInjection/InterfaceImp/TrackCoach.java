package com.spring.ConstructorInjection.InterfaceImp;

import org.springframework.stereotype.Component;

import com.spring.ConstructorInjection.Interface.Coach;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
    
}
