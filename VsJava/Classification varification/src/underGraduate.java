public class underGraduate extends graduate
{
    boolean honors;

    public underGraduate(String major, double gpa, int year, boolean honors) {
        super.major = major;
        super.gpa = gpa;
        super.year = year;
        this.honors = honors;
    }

    public boolean isHonors(){
        return false;
    }
    public String toString(){
        return "John's major is " + major + "his GPA is" + gpa + "He has: " + creditHours + "credit hours" + "honors" + honors;
    }
}



