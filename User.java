package parkingticketammended;

public class User
{

    private String regno, date;

    private int transaction, arrivalhours, arrivalmins, leavinghours, leavingmins, staytimehours, staytimemins;

    private double price;

    public User()
    {

        CreateTransactionNumber transaction = new CreateTransactionNumber();
        RegistrationNumber reg = new RegistrationNumber();
        TheDate date = new TheDate();
        ArrivalTime arrival = new ArrivalTime();
        LeaveTime leave = new LeaveTime();
        LengthOfStay length = new LengthOfStay();
        TotalPrice price = new TotalPrice();

        this.transaction = transaction.getTransactionNumber();
        this.regno = reg.getRegNumber();
        this.date = date.getDate();
        this.arrivalhours = arrival.getArrivalHours();
        this.arrivalmins = arrival.getArrivalMinutes();
        this.leavinghours = leave.getLeaveHour();
        this.leavingmins = leave.getLeaveMinute();
        this.staytimehours = length.getLengthofStayHours();
        this.staytimemins = length.getLengthofStayMins();
        this.price = price.getTotalCost();

    }

    public int getTransactionNumber()
    {

        return transaction;
    }

    public String getRegNumber()
    {

        return regno;
    }

    public String getDate()
    {

        return date;
    }

    public String getArrivalTime()
    {

        return arrivalhours + ":" + arrivalmins;
    }

    public String getLeaveTime()
    {

        return leavinghours + ":" + leavingmins;
    }

    public String getLengthOfStay()
    {

        return staytimehours + ":" + staytimemins;
    }

    public double getTotalPrice()
    {

        return price;
    }

    public String getUser()
    {

        return "Transaction number: " + transaction + ", Registration number: " + regno + ", Arrival time: "
                + arrivalhours + ":" + arrivalmins + ", Exit time: " + leavinghours + ":" + leavingmins
                + ", Length of stay: " + staytimehours + ":" + staytimemins + ", Total Cost: " + price;
    }

}
