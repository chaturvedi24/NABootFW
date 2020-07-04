package managers;

import io.cucumber.java.Scenario;

public class ScenarioMgr {

    private Scenario scenario;

    public ScenarioMgr() {
        scenario = null;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

}
