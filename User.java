package parkingticketammended;

public class User
{

    CreateTransactionNumber transaction;

    RegistrationNumber reg;

    TheDate date;

    ArrivalTime arrivalhours, arrivalmins;

    LeaveTime leavehours, leavemins;

    LengthOfStay lengthhours, lengthmins;

    TotalPrice price;

    HaveTheyOverStayed overstayed;

    public User(CreateTransactionNumber transaction, RegistrationNumber reg, TheDate date, ArrivalTime arrivalhours,
            ArrivalTime arrivalmins, LeaveTime leavehours, LeaveTime leavemins, LengthOfStay lengthhours,
            LengthOfStay lengthmins, TotalPrice price)
    {

        this.transaction = transaction;
        this.reg = reg;
        this.date = date;
        this.arrivalhours = arrivalhours;
        this.arrivalmins = arrivalmins;
        this.leavehours = leavehours;
        this.leavemins = leavemins;
        this.lengthhours = lengthhours;
        this.lengthmins = lengthmins;
        this.price = price;

    }

    public int getTransActionNumber()
    {

        return transaction.getTransactionNumber();
    }

    public String getRegNumber()
    {

        return reg.getRegNumber();
    }

    public String getDate()
    {

        return date.getDate();
    }

    public int getArrivalHour()
    {

        return arrivalhours.getArrivalHours();
    }

    public int getArrivalMins()
    {

        return arrivalmins.getArrivalMinutes();
    }

    public int getLeaveHour()
    {

        return leavehours.getLeaveHour();
    }

    public int getLeaveMins()
    {

        return leavemins.getLeaveMinute();
    }

    public int getLengthOfStayHours()
    {

        return lengthhours.getLengthofStayHours();
    }

    public int getLengthOfStayMins()
    {
        return lengthmins.getLengthofStayMins();
    }

    public double getTotalCost()
    {

        return price.getTotalCost();
    }

}
