package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    Base base;
    Helpers helpers;

    public Hooks(Base base){
//        base = new Base();
        this.base = base;
        this.helpers = base.helpers;
    }

    @Before
    public void beforeScenario(Scenario scenario){
        scenario.log("Starting scenario: " + scenario.getName());
//        base.createScenarioContext();
//        base.setScenario(scenario);
        base.openApp();
    }


    @After
    public void afterScenario(Scenario scenario){
        scenario.log("Scenario status: " + scenario.getStatus());
        base.closeApp();
    }

}
