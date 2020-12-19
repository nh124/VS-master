package com.company;

public class Undergraduate extends Student {
    boolean honors;

    public boolean isHonors(double gpa){

        if(gpa >= 3.5){
            return true;
        }else{
            return false;
        }

    }
    public Undergraduate(String major, double gpa, int creditHours, boolean honors){
        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
        this.honors = honors;
    }
    public String toString(){
        return"[major = " + major + "gpa = " + gpa + "credithours = " + creditHours + "honor = " + honors + "]" ;

    }
}
