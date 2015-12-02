package parkingticketammended;

public class Main
{
    public static void main(String args[])
    {
        CreateTransactionNumber transno = new CreateTransactionNumber();
        TheDate date = new TheDate();
        RegistrationNumber reg = new RegistrationNumber();
        ArrivalTime arrival = new ArrivalTime();

        LengthOfStay length = new LengthOfStay();
        LeaveTime leave = new LeaveTime();
        AloudLeavingTime aloudleaving = new AloudLeavingTime(length, arrival);

        HasUserPrePaid prepaid = new HasUserPrePaid();
        HaveTheyOverStayed overstayed = new HaveTheyOverStayed(aloudleaving, leave);
        overstayed.setOverstayedStatement();
        System.out.println(overstayed.getOverstayedStatement());
        if (!prepaid.getHasUserPrePaid() || overstayed.getHaveTheyOverstayed() == true)
        {
            PaymentMethod payment = new PaymentMethod();
            PaymentChecker paycheck = new PaymentChecker(payment);
            Authorisation authorisation = new Authorisation(transno, prepaid, overstayed, payment, paycheck, date);
            AuthorisationFile authfile = new AuthorisationFile(authorisation);
            authfile.Run();
        }

        CostOfParking cost = new CostOfParking(length);

        OverstayedTime overstayedtime = new OverstayedTime(aloudleaving, leave, overstayed);
        OverstayedPrice extraprice = new OverstayedPrice(overstayedtime);
        TotalPrice total = new TotalPrice(cost, extraprice);
        TerminalDisplay display = new TerminalDisplay(transno, reg, length, total);
        System.out.println(display.getTerminalDisplay());
        User user = new User(transno, reg, date, arrival, arrival, leave, leave, length, length, total);
        CSVFile file = new CSVFile(user);
        file.Run();
    }

}
