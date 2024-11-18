package bookmaker;

public class Event {
    private String eventName;
    private double odds;

    public Event(String eventName, double odds) {
        this.eventName = eventName;
        this.odds = odds;
    }

    public String getEventName() {
        return eventName;
    }

    public double getOdds() {
        return odds;
    }
}
