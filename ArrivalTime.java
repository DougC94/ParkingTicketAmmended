package parkingticketammended;

public class ArrivalTime
{
    private int hours, minutes;

    public ArrivalTime()
    {

        System.out.print("Please enter your arrival time hours: ");
        this.hours = Utils.scanner.nextInt();
        System.out.print("And minutes: ");
        this.minutes = Utils.scanner.nextInt();

    }

    public int getArrivalHours()
    {

        return hours;
    }

    public int getArrivalMinutes()
    {

        return minutes;
    }

}
