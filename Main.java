package parkingticketammended;

public class Main
{
    public static void main(String args[])
    {
        CreateTransactionNumber transno = new CreateTransactionNumber();

        TheDate date = new TheDate();
        System.out.println(date.getDate());
        RegistrationNumber reg = new RegistrationNumber();
        ArrivalTime arrival = new ArrivalTime();
        HasUserPrePaid prepaid = new HasUserPrePaid();
        LengthOfStay length = new LengthOfStay(prepaid);
        CostOfParking cost = new CostOfParking(length);
        cost.setCostOfParking();
        if (prepaid.getHasUserPrePaid() == false)
        {
            cost.setCostStatement();
            System.out.println(cost.getCostStatment());
        }
        LeaveTime leave = new LeaveTime();

        AloudLeavingTime aloudleaving = new AloudLeavingTime(length, arrival);

        HaveTheyOverStayed overstayed = new HaveTheyOverStayed(aloudleaving, leave);
        overstayed.setOverstayedStatement();

        if (!prepaid.getHasUserPrePaid())
        {
            PaymentMethod payment = new PaymentMethod();
            PaymentChecker paycheck = new PaymentChecker(payment);
            Authorisation authorisation = new Authorisation(transno, prepaid, overstayed, payment, paycheck, date);
            AuthorisationFile authfile = new AuthorisationFile(authorisation);
            authfile.Run();
        }

        System.out.println(overstayed.getOverstayedStatement());
        if (overstayed.getHaveTheyOverstayed() == true && prepaid.getHasUserPrePaid() == true)
        {
            PaymentMethod payment = new PaymentMethod();
            PaymentChecker paycheck = new PaymentChecker(payment);
            Authorisation authorisation = new Authorisation(transno, prepaid, overstayed, payment, paycheck, date);
            AuthorisationFile authfile = new AuthorisationFile(authorisation);
            authfile.Run();

        }

        OverstayedTime overstayedtime = new OverstayedTime(aloudleaving, leave, overstayed);
        OverstayedPrice extraprice = new OverstayedPrice(overstayedtime);
        System.out.println(extraprice.getExtraCost());
        TotalPrice total = new TotalPrice(cost, extraprice);
        TerminalDisplay display = new TerminalDisplay(transno, reg, length, total);
        System.out.println(display.getTerminalDisplay());
        User user = new User(transno, reg, date, arrival, arrival, leave, leave, length, length, total);
        CSVFile file = new CSVFile(user);
        file.Run();
    }

}
