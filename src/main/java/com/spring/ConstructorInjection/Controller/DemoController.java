package com.spring.ConstructorInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ConstructorInjection.Interface.Coach;

@RestController
public class DemoController {
    // define a private field for the dependency 

    private Coach myCoach;

    //define a constructor for dependency injection

    @Autowired  // tells Spring to inject dependency
                //@Qualifier -- we have multiple classes like: BaseballCoach, etc ,.. 
                // when getting coach which one will it gets baseball,tennis,  so we use Qualifier to specify which field 
                // naming convention is Same as class but first character lower-case **that's for Constructor injection. 
    // public DemoController(@Qualifier("trackCoach") Coach theCoach){
    //     myCoach = theCoach;
    // }
                // Setter Injection: 
    public void setCoach( Coach theCoach){
            myCoach = theCoach;
        }

        // Here we resolve it by Using @Qualifier too be very specific coach name
            // but there must be alternative solution..??
            // i just need a coach .. if there is multiple tell me who is primary 
            // so we use @Primary in interfaceImp class to specify which is primary
            //So can we have multiple primary ...no 
            //what about mix @Qualifier and @Primary .. @Qualifier will overide @Primary (@Qualifier hav priority) 

/*
 * so which one to use @Primary or @Qualifier??
 * @Primary leaves it up to the implementation classes->> also can lead to error with multiple @primary
 * 
 * @Qualifier has to very specific on which bean u want
 * So generally @Qualifier is recommended   -->  More specific and higher priority.
 */
        

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }




}
