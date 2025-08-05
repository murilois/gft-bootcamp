package hrnANDplmf.exercise;

public class HalfTicket extends Ticket {

    public HalfTicket(double value, String movieName, String dubOrLeg) {
        super(value, movieName,dubOrLeg);
    }

    public double getHalfValue() {
        return this.value * 0.5;
    }
}
