package parkingticketammended;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PaymentChecker
{
    PaymentMethod payment;

    private boolean expired = false;

    private boolean invalidcard = false;

    public PaymentChecker(PaymentMethod payment)
    {

        this.payment = payment;
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        if (payment.getExpiryYear() > calendar.get(calendar.YEAR))
        {
            this.expired = true;
        }
        else if ((payment.getExpiryYear() == calendar.get(calendar.YEAR))
                && (payment.getExpiryMonth() > calendar.get(calendar.MONTH)))
        {
            this.expired = true;
        }

        if (payment.getCardnumber().length() != 16)
        {
            this.invalidcard = true;
        }

    }

    public boolean getCreditCardExpired()
    {
        return expired;
    }

    public boolean getInvalidCardNumber()
    {

        return invalidcard;
    }
}
