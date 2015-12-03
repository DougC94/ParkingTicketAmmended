package parkingticketammended;

public class Authorisation
{
    boolean prepaid;

    boolean overstayed;

    String cardNumber;

    int cardMonth, cardYear;

    boolean checkExpiry, checkNumber;

    String date;

    boolean invalid = false;

    String prepaidStatement, overstayedStatement;

    String failureReason = "";

    int transNo;

    public Authorisation(CreateTransactionNumber transno, HasUserPrePaid prepaid, HaveTheyOverStayed overstayed,
            PaymentMethod payment, PaymentChecker checkpay, TheDate date)
    {

        this.transNo = transno.getTransactionNumber();
        this.prepaid = prepaid.getHasUserPrePaid();
        this.overstayed = overstayed.getHaveTheyOverstayed();
        this.cardNumber = payment.getCardnumber();
        this.cardMonth = payment.getExpiryMonth();
        this.cardYear = payment.getExpiryYear();
        this.checkExpiry = checkpay.getCreditCardExpired();
        this.checkNumber = checkpay.getInvalidCardNumber();
        this.date = date.getDate();
    }

    public int getTransactionNumber()
    {

        return transNo;
    }

    public void setTypeOfTransaction()
    {

        if (prepaid == false)
        {

            this.prepaidStatement = "D";
        }

    }

    public String getTypeOfTransaction()
    {

        return prepaidStatement;
    }

    public void setOverstayedStatement()
    {

        if (overstayed == true)
        {

            this.overstayedStatement = "O";
        }
    }

    public String getOverstayedStatement()
    {

        return overstayedStatement;
    }

    public String getCardNumber()
    {

        return cardNumber;
    }

    public String getCardExpiry()
    {

        return cardMonth + "/" + cardYear;
    }

    public void setIsRequestInvalid()
    {

        if (this.checkExpiry == true || this.checkNumber == true)
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

            if (this.checkExpiry == true)
            {

                this.failureReason = "The card has expired.";
            }
            else if (this.checkNumber == true)
            {
                this.failureReason = "The card number is invalid.";
            }
        }

    }

    public String getReasonForFailure()
    {

        return failureReason;
    }

    public String getDate()
    {

        return date;
    }

}
