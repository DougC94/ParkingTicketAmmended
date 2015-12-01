package parkingticketammended;

public class OverstayedPrice
{
    private double cost;

    OverstayedTime time;

    public OverstayedPrice(OverstayedTime time)
    {
        this.time = time;

        if (time.getOverstayedHours() <= 1)
        {

            this.cost = 4.80;
        }
        else if (time.getOverstayedHours() <= 2)
        {
            this.cost = 7.40;
        }
        else if (time.getOverstayedHours() <= 4)
        {
            this.cost = 10.30;
        }
        else if (time.getOverstayedHours() <= 6)
        {
            this.cost = 14.80;
        }
        else if (time.getOverstayedHours() <= 9)
        {
            this.cost = 17.80;
        }
        else if (time.getOverstayedHours() <= 12)
        {
            this.cost = 20.20;
        }
        else if (time.getOverstayedHours() <= 24)
        {
            this.cost = 23.70;
        }

    }

    public double getExtraCost()
    {

        return cost;

    }
}
