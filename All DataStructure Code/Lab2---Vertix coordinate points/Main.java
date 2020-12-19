import java.util.*;

public class Main {
    public static void main(String[] args) {
        ////objects for all the classes/////////////////////////////////////////////////
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Pentagon pentagon = new Pentagon();
        Hexagon hexagon = new Hexagon();
        Octagon octagon = new Octagon();
        ////////////////////////////////////////////////////////////////////////////////

        boolean error = true;
        do { // if a wrong input does occur just runs the algorithm again until a correct input has been entered.
            try { // check for wrong inputs
                Scanner console = new Scanner(System.in);
                System.out.println("Please enter how many sides the object has:");
                int input = console.nextInt();
                /// Triangle ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (input == 3) {
                    ArrayList<Double> listOfSides = new ArrayList<>();
                    Scanner comparison = new Scanner(System.in);
                    System.out.println("Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' ");
                    System.out.println("This program is built to only compare 2 Polygons");
                    System.out.println("--------------------------------------------------------------------------");
                    int ComparisonDecision = comparison.nextInt();
                    if(ComparisonDecision != -1) { // checks if the user want to compare.
                        for(int i = 0; i < 2; i++) {
                            Scanner dimensions = new Scanner(System.in);
                            System.out.println("Please enter 3 vertices as coordinate points corresponding to 2 side lengths for triangle number " + (i + 1)  + ": " );
                            System.out.println("--------------------------------------------------------------------------");
                            int x_1 = dimensions.nextInt();
                            int y_1 = dimensions.nextInt();
                            int x_2 = dimensions.nextInt();
                            int y_2 = dimensions.nextInt();
                            int x_3 = dimensions.nextInt();
                            int y_3 = dimensions.nextInt();
                            Triangle Triangle = new Triangle(x_1, y_1, x_2, y_2, x_3, y_3);
                            if(Triangle.getBase() == Triangle.getSide()) {
                                System.out.println("The area of the Equilateral triangle  is: " + equilateralTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the Equilateral triangle is: " + equilateralTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                listOfSides.add(Triangle.getBase());
                                listOfSides.add(Triangle.getSide());
                            } else {
                                System.out.println("The area of the isosceles triangle is: " + isoscelesTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the isosceles triangle is: " + isoscelesTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                listOfSides.add(Triangle.getBase());
                                listOfSides.add(Triangle.getSide());
                            }

                        }
                        for(int i = 0; i < listOfSides.size() - 1; i++) { // checks if the ration for a side of one polygon is equal to another.
                            System.out.println( "The ratio of base  for the two triangles: " + listOfSides.get(i)/ listOfSides.get(i + 2) );
                            System.out.println("The ratio of side  for the two triangles: " + listOfSides.get(i + 1)/ listOfSides.get(i + 3));
                            System.out.println("--------------------------------------------------------------------------");

                            if(listOfSides.get(i)/ listOfSides.get(i + 2) == listOfSides.get(i + 1)/ listOfSides.get(i + 3)){
                                System.out.println("Since the ratio of both triangles are same. The triangles are similar");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            }else{
                                System.out.println("Since the ratio of both triangles are not same. The triangles are not similar");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            }
                        }
                    }else{ // if the user does not want to compare just runs the algorithm once.
                        Scanner dimensions = new Scanner(System.in);
                        System.out.println("Please enter 3 vertices as  coordinate points corresponding to 2 side lengths : ");
                        System.out.println("--------------------------------------------------------------------------");
                        int x_1 = dimensions.nextInt();
                        int y_1 = dimensions.nextInt();
                        int x_2 = dimensions.nextInt();
                        int y_2 = dimensions.nextInt();
                        int x_3 = dimensions.nextInt();
                        int y_3 = dimensions.nextInt();
                        Triangle Triangle = new Triangle(x_1, y_1, x_2, y_2, x_3, y_3);
                        System.out.println(Triangle.getBase());
                        System.out.println(Triangle.getSide());
                        if (Triangle.getBase() == Triangle.getSide()) {
                            System.out.println("The area of the Equilateral triangle  is: " + equilateralTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the Equilateral triangle is: " + equilateralTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                        } else {
                            System.out.println("The area of the isosceles triangle is: " + isoscelesTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the isosceles triangle is: " + isoscelesTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                        }
                    }

                ///// Quadrilateral //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                } else if (input == 4) {
                    ArrayList<Double> listOfSides = new ArrayList<>();
                    Scanner comparison = new Scanner(System.in);
                    System.out.println("Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' ");
                    System.out.println("This program is built to only compare 2 Polygons");
                    System.out.println("--------------------------------------------------------------------------");
                    int comparisonDecision = comparison.nextInt();
                    if(comparisonDecision != -1){
                        for(int i = 0; i < 2; i++) {
                            Scanner dimensions = new Scanner(System.in);
                            System.out.println("Please enter 3 vertices as coordinate points corresponding to 2 side lengths for square number " + (i + 1) + ": " );
                            System.out.println("--------------------------------------------------------------------------");
                            int x_1 = dimensions.nextInt();
                            int y_1 = dimensions.nextInt();
                            int x_2 = dimensions.nextInt();
                            int y_2 = dimensions.nextInt();
                            int x_3 = dimensions.nextInt();
                            int y_3 = dimensions.nextInt();
                            Quadrilateral quadrilateral = new Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                            if (quadrilateral.getBase() == quadrilateral.getSide()) {
                                System.out.println("The area of the square is: " + square.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the square is: " + square.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                listOfSides.add(quadrilateral.getBase());
                                listOfSides.add(quadrilateral.getSide());
                            } else {
                                System.out.println("The area of the rectangle is: " + rectangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the rectangle is: " + rectangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                listOfSides.add(quadrilateral.getBase());
                                listOfSides.add(quadrilateral.getSide());
                            }
                        }
                        for(int i = 0; i < listOfSides.size() - 1; i++) {
                            System.out.println("The ratio of the quadrilateral's base is equal to: " + listOfSides.get(i) / listOfSides.get(i + 2));
                            System.out.println("The ration of the quadrilateral's side is equal to: " + listOfSides.get(i + 1) / listOfSides.get(i + 3));

                            if (listOfSides.get(i) / listOfSides.get(i + 2) == listOfSides.get(i + 1) / listOfSides.get(i + 3)) {
                                System.out.println("since the ratio of both the quadrilateral is the same, the quadrilaterals are symmetrical");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            } else {
                                System.out.println("since the ratio of both the quadrilateral is not the same, he quadrilaterals are not symmetrical");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            }
                        }

                    }else{
                        Scanner dimensions = new Scanner(System.in);
                        System.out.println("Please enter 3 vertices as coordinate points corresponding to 2 side lengths : ");
                        System.out.println("--------------------------------------------------------------------------");
                        int x_1 = dimensions.nextInt();
                        int y_1 = dimensions.nextInt();
                        int x_2 = dimensions.nextInt();
                        int y_2 = dimensions.nextInt();
                        int x_3 = dimensions.nextInt();
                        int y_3 = dimensions.nextInt();
                        Quadrilateral quadrilateral = new Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                        if (quadrilateral.getBase() == quadrilateral.getSide()) {
                            System.out.println("The area of the square is: " + square.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the square is: " + square.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                        } else {
                            System.out.println("The area of the rectangle is: " + rectangle.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the rectangle is: " + rectangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                        }
                    }
                ///////// Quadrilateral with 5 or more side lengths ////////////////////////////////////////////////////////////////////////////
                } else if (input > 4 && input < 9) {
                    ArrayList<Double> listOfSides = new ArrayList<>();
                    Scanner compare = new Scanner(System.in);
                    System.out.println("Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' ");
                    System.out.println("This program is designed to only compare 2 polynomials");
                    System.out.println("--------------------------------------------------------------------------");
                    int comparisonDecision = compare.nextInt();
                    if (comparisonDecision != -1) {
                        for(int i = 0; i < 2; i++){
                            Scanner dimensions = new Scanner(System.in);
                            System.out.println("Please enter 3 vertices as coordinate points corresponding to 2 side lengths for polygon number " + (i + 1) + " making sure both sides are symmetrical: ");
                            System.out.println("--------------------------------------------------------------------------");
                            int x_1 = dimensions.nextInt();
                            int y_1 = dimensions.nextInt();
                            int x_2 = dimensions.nextInt();
                            int y_2 = dimensions.nextInt();
                            int x_3 = dimensions.nextInt();
                            int y_3 = dimensions.nextInt();
                            Quadrilateral quadrilateral = new Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                            listOfSides.add(quadrilateral.getBase());
                            listOfSides.add(quadrilateral.getSide());
                            //// Pentagon ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            if (input == 5) {
                                System.out.println("The area of the pentagon is: " + pentagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the pentagon is: " + pentagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                //// Hexagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            } else if (input == 6) {
                                System.out.println("The area of the hexagon is: " + hexagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the hexagon is: " + hexagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                                //// Octagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            } else if (input == 8) {
                                System.out.println("The area of the octagon is: " + octagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("The perimeter of the octagon is: " + octagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                                System.out.println("--------------------------------------------------------------------------");
                            }
                        }
                        for(int i = 0; i < listOfSides.size(); i++) {
                            System.out.println("The ratio of the quadrilateral's base is equal to " + listOfSides.get(i) / listOfSides.get(i + 2));
                            System.out.println("The ration of the quadrilateral's side is equal to " + listOfSides.get(i + 1) / listOfSides.get(i + 3));
                            System.out.println("--------------------------------------------------------------------------");
                            if (listOfSides.get(i) / listOfSides.get(i + 2) == listOfSides.get(i + 1) / listOfSides.get(i + 3)) {
                                System.out.println("since the ratio of both the quadrilateral is the same, the quadrilaterals are symmetrical");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            }else{
                                System.out.println("since the ratio of both the quadrilateral is not the same, the quadrilaterals are not symmetrical");
                                System.out.println("--------------------------------------------------------------------------");
                                break;
                            }
                        }
                    }else{
                        System.out.println("would you like to compare. Enter Yes/No");
                        Scanner dimensions = new Scanner(System.in);
                        System.out.print("Please enter 3 vertices as coordinate points corresponding to 2 side lengths making sure both sides are symmetrical: ");
                        System.out.println("--------------------------------------------------------------------------");
                        int x_1 = dimensions.nextInt();
                        int y_1 = dimensions.nextInt();
                        int x_2 = dimensions.nextInt();
                        int y_2 = dimensions.nextInt();
                        int x_3 = dimensions.nextInt();
                        int y_3 = dimensions.nextInt();
                        //// Pentagon ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        if (input == 5) {
                            System.out.println("The area of the pentagon is: " + pentagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the pentagon is: " + pentagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                            //// Hexagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        } else if (input == 6) {
                            System.out.println("The area of the hexagon is: " + hexagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the hexagon is: " + hexagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                            //// Octagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        } else if (input == 8) {
                            System.out.println("The area of the octagon is: " + octagon.area(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("The perimeter of the octagon is: " + octagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3));
                            System.out.println("--------------------------------------------------------------------------");
                        }
                    }
                }
            // Catch wrong inputs ///////////////////////////////////////////////////////////////////////
            } catch (Exception e) {
                error = false;
                System.out.println("Wrong input. Please try again!");
                System.out.println("--------------------------------------------------------------------------");
                System.out.println();
            }
        }while(!error);
    }
}
