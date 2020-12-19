public class Programmer extends Employee {
    public double getSalary(){
        return super.getSalary() + 30000;
    }
    public int getVacationDays(){
        return super.getVacationDay() - 5;
    }
    public void code(){
        System.out.println("Coding");
    }
    public String toString(){
        return "The salary is: " +  getSalary() + " " + ".They get " + getVacationDay() + " vacation days";
    }
}
