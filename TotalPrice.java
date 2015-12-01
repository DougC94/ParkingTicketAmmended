package parkingticketammended;

public class TotalPrice
{
    private double total;

    CostOfParking cost;

    OverstayedPrice extra;

    public TotalPrice(CostOfParking cost, OverstayedPrice extra)
    {
        this.cost = cost;
        this.extra = extra;
        this.total = cost.getCostOfParking();
        extra.getExtraCost();

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
