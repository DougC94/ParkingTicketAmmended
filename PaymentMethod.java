package parkingticketammended;

public class PaymentMethod
{
    private String cardno;

    private int expirymonth, expiryyear;

    boolean prepaid;

    public PaymentMethod()
    {

        String card;
        int month, year;
        System.out.println("Please insert your credit card.");
        System.out.print("Card number: ");
        card = Utils.scanner.next();
        System.out.print("Credit card expiry month: ");
        month = Utils.scanner.nextInt();
        System.out.print("And year: ");
        year = Utils.scanner.nextInt();

        this.cardno = card;
        this.expirymonth = month;
        this.expiryyear = year;
    }

    public String getCardnumber()
    {

        return cardno;
    }

    public int getExpiryMonth()
    {

        return expirymonth;
    }

    public int getExpiryYear()
    {

        return expiryyear;
    }

}
