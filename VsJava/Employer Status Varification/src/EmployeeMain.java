public class EmployeeMain {
    public static void main(String[] args){

        Employee p = new Programmer();
        SeniorProgrammer sp = new SeniorProgrammer();
        printEmployee(p);
        sp.code();

    }
    public static void printEmployee(Employee e){
        if(e instanceof Programmer){
            System.out.println(e.toString());
        }
    }
}
