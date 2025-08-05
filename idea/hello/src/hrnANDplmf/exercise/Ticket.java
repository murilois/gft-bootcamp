package hrnANDplmf.exercise;

public class Ticket{
    protected double value;
    protected String movieName;
    protected String dubOrLeg;

    public Ticket(double value, String movieName, String dubOrLeg) {
        this.value = value;
        this.movieName = movieName;
        this.dubOrLeg = dubOrLeg;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDubOrLeg() {
        return dubOrLeg;
    }

    public void setDubOrLeg(String dubOrLeg) {
        this.dubOrLeg = dubOrLeg;
    }
}
