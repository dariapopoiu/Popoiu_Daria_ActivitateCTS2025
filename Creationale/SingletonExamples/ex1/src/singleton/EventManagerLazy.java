package singleton;

import java.util.ArrayList;
import java.util.List;

public class EventManagerLazy {
    private String EventManagerName;
    private int numberOfEvents;
    private List<String> availableLocations;

    private static EventManagerLazy instance = null;

    private EventManagerLazy(String eventManagerName, int numberOfEvents, List<String> availableLocations) {
        EventManagerName = eventManagerName;
        this.numberOfEvents = numberOfEvents;
        this.availableLocations = availableLocations;
    }

    public static EventManagerLazy getInstance() {

        if(instance == null){
            instance = new EventManagerLazy("IaBilet",100,new ArrayList<>());
        }

        return instance;
    }

    public String getEventManagerName() {
        return EventManagerName;
    }

    public void setEventManagerName(String eventManagerName) {
        EventManagerName = eventManagerName;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public List<String> getAvailableLocations() {
        return availableLocations;
    }

    public void setAvailableLocations(List<String> availableLocations) {
        this.availableLocations = availableLocations;
    }
}
