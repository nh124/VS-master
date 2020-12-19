// Student Management System
//        • Ask the user how many new students will be added to the database.
//        • The user should be prompted to enter a name and year for each student.
//        • The student should have a unique 5-digit id, with the first being their grade level.
//        • The student should have several course options to choose from.
//        • Each course costs $600 to enroll.
//        • The student should be able to check their balance and pay tuition.
//        • The status of the student should show their name, id, courses, and balance.

import java.util.*;

/*
Scanner for the number of students
courses with costs
Each student should have a account for paying tuition

 */

public class account{
    static int numb;
    static HashMap<String, Integer> students;
    static String nameOfStudent;
    static List<String> courses;
    static int cost;

    public static void main(String[] args)
    {
        menu();
    }
    public static void menu()
    {
        Scanner options = new Scanner(System.in);
        System.out.println("Please choose one of the options(Enter 1 or 2): ");
        System.out.println("1. Instructor");
        System.out.println("2. Student");
        int input = options.nextInt();



        if(input == 1)
        {
            System.out.println("Instructor menu ");
                numbOfStudents();
                menu();
        }else if(input == 2)
        {
            System.out.println("Student Account");
            studentMenu();
        }else{
            System.out.println("Wrong input!");
        }

    }
    public static void numbOfStudents()
    {
        students = new HashMap<>();
        Scanner student = new Scanner(System.in);
        System.out.println("Please enter how many student will be attending this year: ");
        numb = student.nextInt();


        // name and year
        for(int i = 1; i <= numb; i++)
        {
            Scanner nameID = new Scanner(System.in);
            System.out.println("Please enter  " + i + "  name of the student");
            String name = nameID.nextLine();
            System.out.println("Please enter the  " + i +  "  ID for the student");
            int id = nameID.nextInt();
            students.put(name, id);
        }

    }
    public static void studentMenu()
    {
       if(numb == 0)
       {
           System.out.println("You account has not been registered");
       }else{
           Scanner studentInfo = new Scanner(System.in);
           System.out.println("Enter 1 for name, and enter 2 for ID");
           int nameOrId = studentInfo.nextInt();
           if(nameOrId == 1)
           {
               Scanner studentName = new Scanner(System.in);
               System.out.println("Please enter you name: ");
               nameOfStudent = studentName.nextLine();
               boolean condition = students.containsKey(nameOfStudent);
               if(condition != true)
               {
                   System.out.println("You name was not found in the database");
               }else{
                   System.out.println(nameOfStudent);
                   students.get(nameOfStudent);
                   courseOptions();
               }
           }else{

               Scanner id = new Scanner(System.in);
               System.out.println("Please enter you ID");
               int idnNmb = id.nextInt();
               boolean condition = students.containsValue(idnNmb);
               if(condition != true){
                   System.out.println("You ID was not found in the database");
               }else{
                   System.out.println(nameOfStudent);
                   students.keySet();
                   courseOptions();
                   
               }
           }
       }
    }
    public static void courseOptions()
    {
        courses = new ArrayList<>();
        Scanner info = new Scanner(System.in);
        System.out.println("How many courses would you like to take?");
        int x = info.nextInt();

        for(int i = 1; i <= x; i++)
        {
            Scanner courseInput = new Scanner(System.in);
            System.out.println("Please enter the\t" + i + "\tCourse" );
            String subjects = courseInput.nextLine();
            courses.add(subjects);

        }
        cost =  x * 600;
        System.out.println("The courses you are taking for the semester: " + courses);
        System.out.println("It will cost you   " + cost);


        Scanner confirm = new Scanner(System.in);
        System.out.println("Please enter yes/no to either confirm or cancel.");
        String enter = confirm.nextLine();
        if(enter.equals("yes"))
        {
            System.out.println("Thank you!");
            menuOptions();
        }else if(enter.equals("No")){
            System.out.println("ok");
        }else{
            System.out.println("Wrong input!!");
        }
    }
    public static void menuOptions()
    {
        System.out.println("1. view courses");
        System.out.println("2. Add courses");
        System.out.println("3. Remove courses");
        System.out.println("4. View account information");
        System.out.println("5. Exit");

        Scanner menu = new Scanner(System.in);
        int menuInput = menu.nextInt();

        if(menuInput == 1)
        {
            if(courses.contains(null)){
                System.out.println("You have not added your courses yet.");
            }else{
                System.out.println(courses);
                menuOptions();
            }
        }else if(menuInput == 2)
        {
            courseOptions();
            menuOptions();
        }else if(menuInput == 3)
        {
            Scanner remove = new Scanner(System.in);
            System.out.println("Which course would you like to remove?");
            String removeCourse = remove.nextLine();
            if(!courses.contains(removeCourse)){
                System.out.println("The course you entered does not exist");
            }else if (courses.contains(removeCourse)){
                courses.remove(removeCourse);
            }else{
            System.out.println("Wrong input!");
            }
            menuOptions();
        }else if(menuInput == 4)
        {
            System.out.println("You current balance is   " + cost);
            menuOptions();
        }else if(menuInput == 5)
        {
            System.out.println("Goodbye");
        }else{
            System.out.println("Wrong input");
            menuOptions();
        }


    }



}
