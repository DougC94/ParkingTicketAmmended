package parkingticketammended;

public class RegistrationNumber
{
    private String regno;

    public RegistrationNumber()
    {

        System.out.println("Please enter your registration number: ");
        regno = Utils.scanner.nextLine();

    }

    public String getRegNumber()
    {

        return regno;
    }

}
