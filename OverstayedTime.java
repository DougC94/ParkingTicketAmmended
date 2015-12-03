package parkingticketammended;

public class OverstayedTime
{

    private int hours = 0;

    private int minutes = 0;

    private int leavingHours = 0;

    private int leavingMins = 0;

    private int aloudLeavingHours = 0;

    private int aloudLeavingMins = 0;

    LeaveTime leave;

    boolean overstayed = false;

    public OverstayedTime(AloudLeavingTime leaving, LeaveTime leave, HaveTheyOverStayed overstayed)
    {
        this.overstayed = overstayed.getHaveTheyOverstayed();
        this.aloudLeavingHours = leaving.getAloudLeavingHours();
        this.aloudLeavingMins = leaving.getAloudLeavingMinutes();
        this.leavingHours = leave.getLeaveHour();
        this.leavingMins = leave.getLeaveMinute();

        if (overstayed.getHaveTheyOverstayed() == true)
        {

            this.minutes = this.leavingMins - this.aloudLeavingMins;
            this.hours = this.leavingHours - this.aloudLeavingHours;
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
