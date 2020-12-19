package com.company;

public class Graduate extends Student {
    String degree;
    String Concentration;
    int years;


    public int getYears(){
        return this.years;
    }
    public String GetConcentrations(){
        return this.Concentration;
    }
    public String getMajor(){
        return this.major;


    }
    public Graduate(int years, double gpa, String major, String concentration){
        this.years = years;
        this.gpa = gpa;
        this.major = major;
        this.Concentration = concentration;

        public String toString(){
            return"[Year = " + years + "gpa = " + gpa + "major = " + major + "Concentration = " + concentration + "]";

        }
    }
}
// getters have no perimeters
