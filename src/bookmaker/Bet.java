package bookmaker;

public class Bet {
    private String user;
    private double amount;
    private String event;
    private boolean win;

    public Bet(String user, double amount, String event) {
        this.user = user;
        this.amount = amount;
        this.event = event;
        this.win = false;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public double calculatePayout(double odds) {
        return win ? amount * odds : 0;
    }

    public String getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public String getEvent() {
        return event;
    }

    public boolean isWin() {
        return win;
    }
}
