package singleton;

import java.util.List;

public class EventManagerThreadSafe {
    private String EventManagerName;
    private int numberOfEvents;
    private List<String> availableLocations;

    private static EventManagerThreadSafe instance = null;

    private EventManagerThreadSafe(String eventManagerName, int numberOfEvents, List<String> availableLocations) {
        EventManagerName = eventManagerName;
        this.numberOfEvents = numberOfEvents;
        this.availableLocations = availableLocations;
    }

    public static synchronized EventManagerThreadSafe getInstance(String eventManagerName,int numberOfEvents, List<String> availableLocations) {
        if(instance == null){
            instance = new EventManagerThreadSafe(eventManagerName,numberOfEvents,availableLocations);
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
