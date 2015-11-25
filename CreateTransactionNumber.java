package parkingticketammended;

import java.util.Random;

public class CreateTransactionNumber
{
    private int transno;

    public CreateTransactionNumber()
    {
        Random transno = new Random();
        this.transno = 1 + transno.nextInt(999);

    }

    public int getTransactionNumber()
    {

        return transno;
    }

}
