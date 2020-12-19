public class student
{
    String major;
    double gpa;
    int creditHours;

    public double gpa()
    {
        return gpa;

    }
    public String getYear()
    {
        if(creditHours < 32 )
        {
            return "Freshman";
        }
        else if(creditHours  <= 32 && creditHours < 64)
        {
           return "Sophomore";
        }
        else  if(creditHours  <= 64 && creditHours < 96)
        {
            return "junior";
        }
        else{
                return "senior";
        }
    }

}