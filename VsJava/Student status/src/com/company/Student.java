package com.company;
public class Student {

    String major;
    double gpa;
    int creditHours;

        public double getGpa ( double gpa){
            return gpa;
        }
        public int GetCreditHours(){
            return this.creditHours;
        }
        public String getYear ( int creditHours){
            if (creditHours < 32) {
                return "Freshman";
            } else if (creditHours >= 32) {
                return "Sophomore";
            } else if (creditHours >= 64) {
                return "junior";
            } else if (creditHours >= 96) {
                return "Senior";
            }else{
                return "Error";
            }


        }
    }


