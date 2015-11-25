package parkingticketammended;

public class PaymentMethod
{
    private String cardno;

    private int expirymonth, expiryyear;

    public PaymentMethod()
    {

        HasUserPrePaid prepaid = new HasUserPrePaid();
        String card;
        int month, year;
        if (prepaid.getHasUserPrePaid() == false)
        {
            System.out.println("You need to pay for parking.Please insert your credit card details.");
            System.out.print("Transaction number: ");
            card = Utils.scanner.nextLine();
            System.out.print("Credit card expiry month: ");
            month = Utils.scanner.nextInt();
            System.out.print("And year: ");
            year = Utils.scanner.nextInt();

            this.cardno = card;
            this.expirymonth = month;
            this.expiryyear = year;
        }
    }

    public String getTransactionnumber()
    {

        return cardno;
    }

    public String getExpiryDate()
    {

        return expirymonth + "/" + expiryyear;
    }

}
