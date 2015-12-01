package parkingticketammended;

public class OverstayedTime
{
    private int hours, minutes;

    AloudLeavingTime leaving;

    LeaveTime leave;

    HaveTheyOverStayed overstayed;

    public OverstayedTime(AloudLeavingTime leaving, LeaveTime leave, HaveTheyOverStayed overstayed)
    {
        this.overstayed = overstayed;
        this.leaving = leaving;
        this.leave = leave;
        if (overstayed.getHaveTheyOverstayed() == true)
        {

            this.minutes = leave.getLeaveMinute() - leaving.getAloudLeavingMinutes();
            this.hours = leave.getLeaveHour() - leaving.getAloudLeavingHours();
            if (this.minutes > 0)
            {

                this.hours++;
            }
        }

    }

    public int getOverstayedHours()
    {

        return hours;
    }
}
