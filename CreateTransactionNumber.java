package parkingticketammended;

public class CreateTransactionNumber
{
    private int transno = 0;

    public CreateTransactionNumber()
    {

    }

    public int getTransactionNumber()
    {
        transno++;
        return transno;

    }

}
