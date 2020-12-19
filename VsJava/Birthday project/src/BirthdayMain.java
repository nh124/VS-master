public class BirthdayMain {
    public static void main(String[] args){
    person1 p1 = new person1();
    person2 p2 = new person2();
    Birthday B = new Birthday();
    System.out.println(B.toString());
    System.out.println(p1.toString());
    System.out.println();
    p2.person2();
    System.out.println(p2.toString());
    comparison();
    }
    public static void comparison(){
        if(person1.age > person2.age ){
            System.out.println();
            System.out.println("Person 1 is older!");
        }else if(person1.age < person2.age){
            System.out.println();
            System.out.println("Person 2 is older!");
        }else{
            System.out.println();
            System.out.println("They are the same age!");
        }
    }
}
