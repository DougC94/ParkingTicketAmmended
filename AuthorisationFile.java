package parkingticketammended;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthorisationFile
{

    Authorisation authorisation;

    public AuthorisationFile(Authorisation authorisation)
    {

        this.authorisation = authorisation;
    }

    public void Run()
    {

        try
        {

            PrintWriter ticket = new PrintWriter(new FileOutputStream(new File("AuthorisationFile.txt"), true));
            ticket.println();
            ticket.print(authorisation.getTransactionNumber());
            ticket.print(",");
            ticket.print(authorisation.getTypeOfTransaction());
            ticket.print(",");
            ticket.print(authorisation.getOverstayedStatement());
            ticket.print(",");
            ticket.print(authorisation.getCardNumber());
            ticket.print(",");
            ticket.print(authorisation.getCardExpiry());
            ticket.print(",");
            ticket.print(authorisation.getDate());
            ticket.print(",");
            ticket.print(authorisation.getIsRequestInvalid());
            ticket.print(",");
            ticket.print(authorisation.getReasonForFailure());
            ticket.close();
        }
        catch (IOException e)
        {

            e.getMessage();
        }

    }

}
