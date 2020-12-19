public class Lawyer extends Employee{
    public int getVacationDays(){
        return super.getVacationDay() +5;
    }
    public String getVacationForm(){
        return "Pink!";
    }
    public void sue(){
        System.out.println("I'll see you in court!");
    }
    public String toString(){
        return getVacationDay() + " " + getVacationForm();
    } // do a .toString method for each subclass

}
