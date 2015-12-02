package parkingticketammended;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVFile
{
    User user;

    public CSVFile(User user)
    {
        this.user = user;
    }

    public void Run()
    {

        try
        {
            PrintWriter ticket = new PrintWriter(new FileOutputStream(new File("ParkingTicket.txt"), true));
            ticket.println();
            ticket.print(user.getTransActionNumber());
            ticket.print(",");
            ticket.print(user.getRegNumber());
            ticket.print(",");
            ticket.print(user.getDate());
            ticket.print(",");
            ticket.print(user.getArrivalMins());
            ticket.print(",");
            ticket.print(user.getArrivalMins());
            ticket.print(",");
            ticket.print(user.getLeaveHour());
            ticket.print(",");
            ticket.print(user.getLeaveMins());
            ticket.print(",");
            ticket.print(user.getLengthOfStayHours());
            ticket.print(",");
            ticket.print(user.getLengthOfStayMins());
            ticket.print(",");
            ticket.print(user.getTotalCost());

            ticket.close();
        }
        catch (IOException e)
        {

            e.getMessage();
        }

    }

}
