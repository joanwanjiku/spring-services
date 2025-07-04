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

    // define a constructor for dependency injection
    public DemoController(@Qualifier("trackCoach") Coach theCoach) {
        myCoach = theCoach;
    }

//    setter injection
//    @Autowired
//    public void setMyCoach(Coach theCoach) {
//        this.myCoach = theCoach;
//    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/trackmeet")
    public String getTrackWorkout() {
        return myCoach.getDailyWorkout();
    }
}
