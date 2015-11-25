package parkingticketammended;

import java.util.Calendar;

public class CostOfParking
{
    private double weekcost, weekendcost;

    public CostOfParking()
    {
        LengthOfStay hours = new LengthOfStay();

        double array[] =
        {hours.getLengthofStayHours() };
        array[1] = (this.weekcost = 23.70);
        array[2] = (this.weekcost = 7.40);
        array[3] = (this.weekcost = 10.30);
        array[4] = (this.weekcost = 10.30);
        array[5] = (this.weekcost = 14.80);
        array[6] = (this.weekcost = 14.80);
        array[7] = (this.weekcost = 17.80);
        array[8] = (this.weekcost = 17.80);
        array[9] = (this.weekcost = 17.80);
        array[10] = (this.weekcost = 20.20);
        array[11] = (this.weekcost = 20.20);
        array[12] = (this.weekcost = 20.20);
        array[13] = (this.weekcost = 23.70);
        array[14] = (this.weekcost = 23.70);
        array[15] = (this.weekcost = 23.70);
        array[16] = (this.weekcost = 23.70);
        array[17] = (this.weekcost = 23.70);
        array[18] = (this.weekcost = 23.70);
        array[19] = (this.weekcost = 23.70);
        array[20] = (this.weekcost = 23.70);
        array[21] = (this.weekcost = 23.70);
        array[22] = (this.weekcost = 23.70);
        array[23] = (this.weekcost = 23.70);
        array[24] = (this.weekcost = 23.70);

        double array2[] =
        {hours.getLengthofStayHours() };
        array2[1] = (this.weekendcost = 23.70);
        array2[2] = (this.weekendcost = 7.40);
        array2[3] = (this.weekendcost = 10.30);
        array2[4] = (this.weekendcost = 10.30);
        array2[5] = (this.weekendcost = 14.80);
        array2[6] = (this.weekendcost = 14.80);
        array2[7] = (this.weekendcost = 17.80);
        array2[8] = (this.weekendcost = 17.80);
        array2[9] = (this.weekendcost = 17.80);
        array2[10] = (this.weekendcost = 20.20);
        array2[11] = (this.weekendcost = 20.20);
        array2[12] = (this.weekendcost = 20.20);
        array2[13] = (this.weekendcost = 23.70);
        array2[14] = (this.weekendcost = 23.70);
        array2[15] = (this.weekendcost = 23.70);
        array2[16] = (this.weekendcost = 23.70);
        array2[17] = (this.weekendcost = 23.70);
        array2[18] = (this.weekendcost = 23.70);
        array2[19] = (this.weekendcost = 23.70);
        array2[20] = (this.weekendcost = 23.70);
        array2[21] = (this.weekendcost = 23.70);
        array2[22] = (this.weekendcost = 23.70);
        array2[23] = (this.weekendcost = 23.70);
        array2[24] = (this.weekendcost = 23.70);

    }

    public double getCostOfParking()
    {
        double cost;
        Calendar day = Calendar.getInstance();
        if (day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        {
            cost = this.weekcost;
        }
        else
        {
            cost = this.weekendcost;
        }

        return cost;

    }
}
