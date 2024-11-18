package bookmaker;

public class Main {
    public static void main(String[] args) {
        Event footballMatch = new Event("Football Match", 2.0);
        Bet bet1 = new Bet("Alice", 100, footballMatch.getEventName());
        Bet bet2 = new Bet("Bob", 50, footballMatch.getEventName());
        bet1.setWin(true);
        bet2.setWin(false);
        System.out.println("User " + bet1.getUser() + " won " + bet1.calculatePayout(footballMatch.getOdds()));
        System.out.println("User " + bet2.getUser() + " won " + bet2.calculatePayout(footballMatch.getOdds()));
    }
}
