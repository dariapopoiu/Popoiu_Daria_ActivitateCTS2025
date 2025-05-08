package singleton;

import java.util.ArrayList;
import java.util.List;

public class EventManagerEager {
    private String EventManagerName;
    private int numberOfEvents;
    private List<String> availableLocations;

    private static EventManagerEager instance = new EventManagerEager();

    private EventManagerEager() {
        EventManagerName = "IaBilet";
        this.numberOfEvents = 10;
        this.availableLocations = new ArrayList<>();
    }

    public static EventManagerEager getInstance() {
        return instance;
    }

    public List<String> getAvailableLocations() {
        return availableLocations;
    }

    public void setAvailableLocations(List<String> availableLocations) {
        this.availableLocations = availableLocations;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public String getEventManagerName() {
        return EventManagerName;
    }

    public void setEventManagerName(String eventManagerName) {
        EventManagerName = eventManagerName;
    }
}
