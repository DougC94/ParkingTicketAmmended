package parkingticketammended;

public class AloudLeavingTime
{

    private int timehours, timeminutes;

    private int counter = 0;

    LengthOfStay length;

    ArrivalTime time;

    public AloudLeavingTime(LengthOfStay length, ArrivalTime time)
    {
        this.length = length;
        this.time = time;
        this.timehours = (time.getArrivalHours() + length.getLengthofStayHours());
        this.timeminutes = (time.getArrivalMinutes() + length.getLengthofStayMins());
        if (timeminutes > 59)
        {

            this.timeminutes = (timeminutes - 60);
            this.timehours++;

        }

        if (timehours > 23)
        {

            this.timehours = (timehours - 24);
            this.counter++;
        }
    }

    public int getAloudLeavingHours()
    {

        return timehours;
    }

    public int getAloudLeavingMinutes()
    {

        return timeminutes;
    }

    public int getCounter()
    {

        return counter;

    }
}
