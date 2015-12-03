package parkingticketammended;

public class HasUserPrePaid
{
    private boolean isPrepaid;

    private String paid;

    public HasUserPrePaid()
    {
        boolean prepaid = false;
        String s = "";
        System.out.print("Has your ticket been prepaid for? yes/no: ");
        String p = Utils.scanner.next();

        if (p.equalsIgnoreCase("yes"))
        {
            s = "User has prepaid.";
            prepaid = true;
        }
        else if (p.equalsIgnoreCase("no"))
        {
            s = "User has not prepaid.";
        }

        this.paid = s;
        this.isPrepaid = prepaid;
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
