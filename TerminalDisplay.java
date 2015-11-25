package parkingticketammended;

public class TerminalDisplay
{
    private String display;

    public TerminalDisplay()
    {
        CostOfParking cost = new CostOfParking();
        RegistrationNumber regno = new RegistrationNumber();
        LengthOfStay length = new LengthOfStay();
        CreateTransactionNumber transno = new CreateTransactionNumber();

        this.display = "Transaction " + transno.getTransactionNumber() + ", Registartion " + regno.getRegNumber()
                + ", Length of Stay " + length.getLengthofStayHours() + " hours " + length.getLengthofStayMins()
                + ", Amount due: £" + cost.getCostOfParking();

    }

    public String getTerminalDisplay()
    {

        return display;
    }

}
