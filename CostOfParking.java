package parkingticketammended;

import java.util.Calendar;

public class CostOfParking
{
    private double weekCost, weekendCost, cost;

    HasUserPrePaid prepaid;

    private String statement;

    private int hours;

    public CostOfParking(LengthOfStay hours)
    {
        this.hours = hours.getLengthofStayHours();

        if (this.hours <= 1)
        {

            this.weekCost = 4.80;
        }
        else if (this.hours <= 2)
        {
            this.weekCost = 7.40;
        }
        else if (this.hours <= 4)
        {
            this.weekCost = 10.30;
        }
        else if (this.hours <= 6)
        {
            this.weekCost = 14.80;
        }
        else if (this.hours <= 9)
        {
            this.weekCost = 17.80;
        }
        else if (this.hours <= 12)
        {
            this.weekCost = 20.20;
        }
        else if (this.hours <= 24)
        {
            this.weekCost = 23.70;
        }

        if (this.hours <= 1)
        {

            this.weekendCost = 4.80;
        }
        else if (this.hours <= 2)
        {
            this.weekendCost = 7.40;
        }
        else if (this.hours <= 4)
        {
            this.weekendCost = 10.30;
        }
        else if (this.hours <= 6)
        {
            this.weekendCost = 14.80;
        }
        else if (this.hours <= 9)
        {
            this.weekendCost = 17.80;
        }
        else if (this.hours <= 12)
        {
            this.weekendCost = 20.20;
        }
        else if (this.hours <= 24)
        {
            this.weekendCost = 23.70;
        }

    }

    public void setCostOfParking()
    {
        double i;
        Calendar day = Calendar.getInstance();
        if (day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        {
            i = this.weekCost;
        }
        else
        {
            i = this.weekendCost;
        }

        this.cost = i;

    }

    public double getCostOfParking()
    {

        return cost;
    }

    public void setCostStatement()
    {

        this.statement = "You will be charged " + getCostOfParking() + "0 for parking.";
    }

    public String getCostStatment()
    {

        return statement;
    }

}
