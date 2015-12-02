package parkingticketammended;

public class Authorisation
{
    boolean prepaid;

    boolean overstayed;

    String cardnumber;

    int cardmonth, cardyear;

    boolean checkexpiry, checknumber;

    String date;

    boolean invalid = false;

    String prepaidstatement, overstayedstatement;

    String failurereason = "";

    int transno;

    public Authorisation(CreateTransactionNumber transno, HasUserPrePaid prepaid, HaveTheyOverStayed overstayed,
            PaymentMethod payment, PaymentChecker checkpay, TheDate date)
    {

        this.transno = transno.getTransactionNumber();
        this.prepaid = prepaid.getHasUserPrePaid();
        this.overstayed = overstayed.getHaveTheyOverstayed();
        this.cardnumber = payment.getCardnumber();
        this.cardmonth = payment.getExpiryMonth();
        this.cardyear = payment.getExpiryYear();
        this.checkexpiry = checkpay.getCreditCardExpired();
        this.checknumber = checkpay.getInvalidCardNumber();
        this.date = date.getDate();
    }

    public int getTransactionNumber()
    {

        return transno;
    }

    public void setTypeOfTransaction()
    {

        if (prepaid == false)
        {

            this.prepaidstatement = "D";
        }

    }

    public String getTypeOfTransaction()
    {

        return prepaidstatement;
    }

    public void setOverstayedStatement()
    {

        if (overstayed == true)
        {

            this.overstayedstatement = "O";
        }
    }

    public String getOverstayedStatement()
    {

        return overstayedstatement;
    }

    public String getCardNumber()
    {

        return cardnumber;
    }

    public String getCardExpiry()
    {

        return cardmonth + "/" + cardyear;
    }

    public void setIsRequestInvalid()
    {

        if (this.checkexpiry == true || this.checknumber == true)
        {

            this.invalid = true;
        }
    }

    public String getIsRequestInvalid()
    {

        String s = "";
        if (this.invalid == true)
        {
            s = "The request has failed.";
        }
        if (this.invalid == false)
        {
            s = "The request has passed.";
        }
        return s;
    }

    public void setReasonForFailure()
    {

        if (this.invalid = true)
        {

            if (this.checkexpiry == true)
            {

                this.failurereason = "The card has expired.";
            }
            else if (this.checknumber == true)
            {
                this.failurereason = "The card number is invalid.";
            }
        }

    }

    public String getReasonForFailure()
    {

        return failurereason;
    }

    public String getDate()
    {

        return date;
    }

}
