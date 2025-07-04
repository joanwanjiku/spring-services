package com.springservices.ms_spring_core.rest;

import com.springservices.ms_spring_core.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // define a constructor for dependency injection
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
    @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("in constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

//    setter injection
//    @Autowired
//    public void setMyCoach(Coach theCoach) {
//        this.myCoach = theCoach;
//    }

    @GetMapping("/cricket")
    public String getDailyWorkout() {
        return anotherCoach.getDailyWorkout();
    }

    @GetMapping("/trackmeet")
    public String getTrackWorkout() {
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/hello")
    public String hello() {
        return "Comparing beans: myCoach == anotherCoach: " + (myCoach == anotherCoach);
    }
}
