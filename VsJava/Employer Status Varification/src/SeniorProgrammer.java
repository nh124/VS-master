public class SeniorProgrammer extends Programmer {
    public double getSalary(){
        return super.getSalary() + 21000;
    }
    public int getVacationDays(){
        return super.getVacationDays() + 5;
    }
    public String getVacationForm(){
        return super.getVacationForm() + 4;
    }
    public String toString(){
        return getSalary() + " " + getVacationDay() + " " + getVacationForm();
    }
}
