public class graduate extends student
{
    String degree;
    String concentration;
    int year;

    public graduate(String degree, String concentration, int year, double gpa, String major){
        this.degree = degree;
        this.concentration = concentration;
        this.year = year;
        super.gpa = gpa;
        super.major = major;
    }


    public String getConcentration() {
        return concentration;
    }
    public int getYearNumber(){
        return year;
    }
    public String toString()
    {
        return "Zooey's degrees is" + degree + "she is a " + year + "year" + "Her gpa is " + gpa + "her major is " + "major" + "and her concentration is" + concentration;
    }
}



