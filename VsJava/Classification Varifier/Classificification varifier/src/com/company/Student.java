package com.company;
public class Student {
    String major;
    double gpa;
    int creditHours;

    public void setMajor(String major){
        this.major = major;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }
    public double getGpa(){
        return gpa;
    }
    public String getYears(){
        if(creditHours < 32){
            return "freshman";
        }else if(creditHours < 64){
            return "Sophomore";
        }else if(creditHours < 96){
            return "junior";
        }else if(creditHours >= 96){
            return "senior";
        }else{
            return "Error";
        }
    }


}
