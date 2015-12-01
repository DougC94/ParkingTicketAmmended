package parkingticketammended;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TheDate
{
    private String thedate;

    public TheDate()
    {

        Date date = new Date();
        SimpleDateFormat d = new SimpleDateFormat("yyyy.dd.mm");
        this.thedate = d.format(date);
    }

    public String getDate()
    {

        return thedate;
    }

}
