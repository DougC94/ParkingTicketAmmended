package parkingticketammended;

import java.util.Calendar;

public class CostOfParking
{
    private double weekcost, weekendcost, cost;

    HasUserPrePaid prepaid;

    private String statement;

    LengthOfStay hours;

    public CostOfParking(LengthOfStay hours)
    {
        this.hours = hours;

        if (hours.getLengthofStayHours() <= 1)
        {

            this.weekcost = 4.80;
        }
        else if (hours.getLengthofStayHours() <= 2)
        {
            this.weekcost = 7.40;
        }
        else if (hours.getLengthofStayHours() <= 4)
        {
            this.weekcost = 10.30;
        }
        else if (hours.getLengthofStayHours() <= 6)
        {
            this.weekcost = 14.80;
        }
        else if (hours.getLengthofStayHours() <= 9)
        {
            this.weekcost = 17.80;
        }
        else if (hours.getLengthofStayHours() <= 12)
        {
            this.weekcost = 20.20;
        }
        else if (hours.getLengthofStayHours() <= 24)
        {
            this.weekcost = 23.70;
        }

        if (hours.getLengthofStayHours() <= 1)
        {

            this.weekendcost = 4.80;
        }
        else if (hours.getLengthofStayHours() <= 2)
        {
            this.weekendcost = 7.40;
        }
        else if (hours.getLengthofStayHours() <= 4)
        {
            this.weekendcost = 10.30;
        }
        else if (hours.getLengthofStayHours() <= 6)
        {
            this.weekendcost = 14.80;
        }
        else if (hours.getLengthofStayHours() <= 9)
        {
            this.weekendcost = 17.80;
        }
        else if (hours.getLengthofStayHours() <= 12)
        {
            this.weekendcost = 20.20;
        }
        else if (hours.getLengthofStayHours() <= 24)
        {
            this.weekendcost = 23.70;
        }

    }

    public double getCostOfParking()
    {

        Calendar day = Calendar.getInstance();
        if (day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        {
            this.cost = this.weekcost;
        }
        else
        {
            this.cost = this.weekendcost;
        }

        return this.cost;

    }

}
