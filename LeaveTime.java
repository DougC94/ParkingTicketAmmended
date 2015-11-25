package parkingticketammended;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeaveTime
{
    private int hour, minute;

    public LeaveTime()
    {

        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        this.hour = calendar.get(calendar.HOUR_OF_DAY);
        this.minute = calendar.get(calendar.MINUTE);

    }

    public int getLeaveHour()
    {

        return hour;
    }

    public int getLeaveMinute()
    {

        return minute;
    }

}
