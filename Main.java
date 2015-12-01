package parkingticketammended;

public class Main
{
    public static void main(String args[])
    {
        RegistrationNumber reg = new RegistrationNumber();
        ArrivalTime arrival = new ArrivalTime();
        HasUserPrePaid prepaid = new HasUserPrePaid();
        PaymentMethod payment = new PaymentMethod(prepaid);

        LengthOfStay length = new LengthOfStay();
        CreateTransactionNumber transno = new CreateTransactionNumber();
        CostOfParking cost = new CostOfParking(length);
        LeaveTime leave = new LeaveTime();
        AloudLeavingTime aloudleaving = new AloudLeavingTime(length, arrival);
        HaveTheyOverStayed overstayed = new HaveTheyOverStayed(aloudleaving, leave);
        OverstayedTime overstayedtime = new OverstayedTime(aloudleaving, leave, overstayed);
        OverstayedPrice extraprice = new OverstayedPrice(overstayedtime);
        TotalPrice total = new TotalPrice(cost, extraprice);
        TerminalDisplay display = new TerminalDisplay(transno, reg, length, total);
        System.out.println(display.getTerminalDisplay());
        ;

    }

}
