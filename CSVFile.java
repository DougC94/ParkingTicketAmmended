package parkingticketammended;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVFile
{

    public void Run()
    {
        User user = new User();
        try
        {
            PrintWriter ticket = new PrintWriter(new FileOutputStream(new File("ParkingTicket.txt"), true));
            ticket.append(user.getUser());
            ticket.close();
        }
        catch (IOException e)
        {

            e.getMessage();
        }

    }

    // //public static void main(String args[])
    // {
    //
    // //CSVFile file = new CSVFile();
    // file.Run();
    // }
}
