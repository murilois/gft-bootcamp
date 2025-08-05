package hrnANDplmf.exercise;

public class FamilyTicket extends Ticket{
    private int quantity;

    public FamilyTicket(double value, String movieName, String dubOrLeg, int quantity) {
        super(value, movieName,dubOrLeg );
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getFamilyValue(int quantity){
        double totalValue = 0;
        double familyValue = 0;
        if(quantity > 3){
            familyValue = this.value - (this.value * 0.05);
            totalValue = quantity * familyValue;
        }else{
            totalValue = quantity * this.value;
        }
        return totalValue;
    }
}
