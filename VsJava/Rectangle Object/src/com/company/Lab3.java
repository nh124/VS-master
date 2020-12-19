package com.company;

import java.util.*;
public class Lab3 {

    public static void main(String[] args){
        //setField();
        Lan3 n = new Lan3();
        n.SetX(12);
        n.SetY(14);
        n.SetNewHeight(20);
        n.SetNewWidth( 18);
        System.out.println(n.getX()+ "," +n.getY() + ", " + n.getNewHeight() + ", " + n.getNewWidth());
    }



    public static void setField(int newx, int newy,int newweight, int newheight ){
        Scanner console = new Scanner(System.in);
        System.out.println("please imput the the x coordinate of the ractangle: ");
        newx = console.nextInt();
        System.out.println("please imput the the y coordinate of the ractangle: ");
        newy = console.nextInt();
        System.out.println("please imput the the Wegith of the ractangle: ");
        newweight = console.nextInt();
        System.out.println("please imput the the Height of the ractangle: ");
        newheight = console.nextInt();
        System.out.println("x = " + newx + "y = " + newy +"weigth = " + newweight +"Height = " + newheight );
    }


}
// ctrl b