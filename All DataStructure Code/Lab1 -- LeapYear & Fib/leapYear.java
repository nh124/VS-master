// Leap Year class------------------------------------------------------------------------------------------------------------------
public class leapYear {
    public boolean year (int n)
    {
        if((n % 400 == 0) || ((n % 100) != 0 && (n % 4 == 0)))
        {
            return true;
        }
    /* 
        // for(int i = 0; i <= 8; i++)
        // {
        // int leapYear = n % 10;
        // int even = i % 2;
        // if(even == 0)
        // {
        // if(i == leapYear)
        // {
        // return true;
        // }
        // }
        //
        // }
    */
    return false;
    }
}
    