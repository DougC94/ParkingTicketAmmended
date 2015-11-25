package parkingticketammended;

public class LengthOfStay
{
    private int hours, mins;

    public LengthOfStay()
    {
        System.out.print("Please enter how long you stayed for in hours: ");
        int hours = Utils.scanner.nextInt();

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
