public class emailClient {
    public static void main(String[] args)
    {
        email e = new email(email.firstName, email.lastName, email.department, email.company);
        System.out.println(e.toString());
    }
}
