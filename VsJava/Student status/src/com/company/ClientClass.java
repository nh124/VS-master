package com.company;

public class ClientClass {
    public static void main(String[] args) {
        Undergraduate John = new Undergraduate("Computer Science",  3.75,  40, false);
        Graduate Zooey = new Graduate(1,4, "computer science", "bioinfomatics");

        System.out.println(John.toString());
        System.out.println(Zooey.toString());


    }


}
