package parkingticketammended;

public class HasUserPrePaid
{
    private boolean isPrepaid;

    private String paid;

    public HasUserPrePaid()
    {

        System.out.print("Has your ticket been prepaid for? yes/no: ");
        String p = Utils.scanner.nextLine();

        if (p.equalsIgnoreCase("yes"))
        {
            this.paid = "User has prepaid.";
            isPrepaid = true;
        }
        else if (p.equalsIgnoreCase("no"))
        {
            this.paid = "User has not prepaid.";
            isPrepaid = false;
        }

    }

    public boolean getHasUserPrePaid()
    {

        return isPrepaid;
    }

    public String getPrePaidStatment()
    {

        return paid;
    }
}
