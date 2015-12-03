package parkingticketammended;

public class TotalPrice
{
    private double total = 0;

    private double extra = 0;

    public TotalPrice(CostOfParking cost, OverstayedPrice extra)
    {

        this.extra = extra.getExtraCost();
        this.total = cost.getCostOfParking();

        if (extra.getExtraCost() > 0)
        {

            this.total = extra.getExtraCost() + cost.getCostOfParking();
        }
    }

    public double getTotalCost()
    {

        return total;
    }

}
