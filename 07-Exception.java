class PositiveException extends Exception 
{
    PositiveException(String msg) 
    {
        super(msg);
    }
}

public class Main 
{
    void disp(int i) throws PositiveException 
    {
        if (i < 0) 
        {
            throw new PositiveException("Number is negative");
        } 
        else 
        {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) 
    {
        Main t1 = new Main();

        try 
        {
            t1.disp(-6);
        } 
        catch (PositiveException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
