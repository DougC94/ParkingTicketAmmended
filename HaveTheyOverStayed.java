package parkingticketammended;

public class HaveTheyOverStayed
{
    private boolean overstayed = false;

    private String statement;

    AloudLeavingTime aloudleaving;

    LeaveTime leaving;

    public HaveTheyOverStayed(AloudLeavingTime aloudleaving, LeaveTime leave)
    {
        this.aloudleaving = aloudleaving;
        this.leaving = leave;

        if (aloudleaving.getCounter() > 0)
        {

            this.overstayed = true;

        }

        if (leaving.getLeaveHour() < aloudleaving.getAloudLeavingHours())
        {

            this.overstayed = true;
        }

        if ((leaving.getLeaveHour() == aloudleaving.getAloudLeavingHours())
                && leaving.getLeaveMinute() > aloudleaving.getAloudLeavingMinutes())
        {
        }

        this.overstayed = true;

    }

    public boolean getHaveTheyOverstayed()
    {

        return overstayed;
    }

    public void setOverstayedStatement()
    {

        if (this.overstayed == true)
        {

            this.statement = "User has overstayed. You will be charged for your extra time.";

        }
        else
        {

            this.statement = "User leaving within allotted time.";
        }
    }

    public String getOverstayedStatement()
    {

        return statement;
    }

}
