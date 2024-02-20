package com.spring.ConstructorInjection.InterfaceImp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.ConstructorInjection.Interface.Coach;

@Component
@Primary
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    
}
