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

            this.cost = 4.32;
        }
        else if (time.getOverstayedHours() <= 2)
        {
            this.cost = 6.66;
        }
        else if (time.getOverstayedHours() <= 4)
        {
            this.cost = 9.27;
        }
        else if (time.getOverstayedHours() <= 6)
        {
            this.cost = 13.32;
        }
        else if (time.getOverstayedHours() <= 9)
        {
            this.cost = 16.02;
        }
        else if (time.getOverstayedHours() <= 12)
        {
            this.cost = 18.18;
        }
        else if (time.getOverstayedHours() <= 24)
        {
            this.cost = 21.33;
        }

    }

    public double getExtraCost()
    {

        return cost;

    }
}
