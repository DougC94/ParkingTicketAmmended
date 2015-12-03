package parkingticketammended;

public class LengthOfStay
{
    private int hours, mins;

    private boolean prepaid;

    public LengthOfStay(HasUserPrePaid prepaid)
    {
        this.prepaid = prepaid.getHasUserPrePaid();
        if (this.prepaid == false)
        {
            System.out.print("Please enter how long you stayed for in hours: ");
            int hours = Utils.scanner.nextInt();
        }
        else if (this.prepaid == true)
        {
            System.out.print("Please enter how long you paid for in hours: ");
            int hours = Utils.scanner.nextInt();
        }
        System.out.print("And minutes: ");
        int mins = Utils.scanner.nextInt();

        if (mins > 0)
        {
            hours++;
        }
        this.hours = hours;
        this.mins = mins;
    }

    public int getLengthofStayHours()
    {

        return hours;
    }

    public int getLengthofStayMins()
    {

        return mins;
    }

}
