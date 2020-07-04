package managers;

import java.util.HashMap;
import java.util.Map;

public class AutomationContext {

    public AutomationContext(ScenarioMgr scenarioMgr) {
        this.scenarioMgr = scenarioMgr;
    }

    public ScenarioMgr getScenarioMgr() {
        return scenarioMgr;
    }

    ScenarioMgr scenarioMgr;
    private Map<String, String> contextMap = new HashMap<>();

    public String getContextMap(String key) {
        return contextMap.get(key);
    }

    public void setContextMap(String key, String value) {
        contextMap.put(key, value);
    }

}
