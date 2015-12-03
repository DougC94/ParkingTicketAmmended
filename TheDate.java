package parkingticketammended;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TheDate
{
    private String thedate;

    public TheDate()
    {

        Date date = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd.MM.yyyy");
        this.thedate = d.format(date);
    }

    public String getDate()
    {

        return thedate;
    }

}
