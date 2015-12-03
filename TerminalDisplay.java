package parkingticketammended;

public class TerminalDisplay
{
    private String display;

    TotalPrice cost;

    RegistrationNumber regno;

    LengthOfStay length;

    public String transno;

    public TerminalDisplay(CreateTransactionNumber transno, RegistrationNumber regno, LengthOfStay length,
            TotalPrice cost)
    {
        this.cost = cost;
        this.regno = regno;
        this.length = length;
        this.transno = transno.getTransactionNumber();

        this.display = "Transaction " + this.transno + ", Registartion " + regno.getRegNumber() + ", Length of Stay "
                + length.getLengthofStayHours() + " hours " + length.getLengthofStayMins() + ", Amount due: £"
                + cost.getTotalCost();

    }

    public String getTerminalDisplay()
    {

        return display;

    }

}
