package parkingticketammended;

import java.util.UUID;

public class CreateTransactionNumber
{
    String transno;

    public CreateTransactionNumber()
    {
        String uuid = UUID.randomUUID().toString();
        this.transno = uuid;
    }

    public String getTransactionNumber()
    {

        return transno;

    }

}
