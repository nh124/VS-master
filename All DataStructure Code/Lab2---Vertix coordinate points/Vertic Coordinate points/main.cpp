#include <iostream>
#include <cmath>
#include <iterator>
#include <vector>
#include <iomanip>
// interface
class polygonInterface{
    public:
        Code utilizing Vertex coordinate points. 6
        virtual double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) = 0;
        virtual double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) = 0;
};
// Parent class Triangle
class Triangle : public polygonInterface{
    double base;
    double side;
    public:
    Triangle()
    {

    }
    public:
        Triangle(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3){
            base = pow(pow((x_2 - x_1),2) + pow((y_2 - y_1),2), (double)1/2);
            side = pow(pow((x_3 - x_2),2) + pow((y_3 - y_2),2), (double)1/2);
    }
    //@Override
    public:
    double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        double halfBase = base/2;
        double apothem = pow(side,2) - pow(halfBase,2);
        return (apothem * base)/2;
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            return base + (side * 2);
        }
    public:
        double getBase(){
            return base;
        }
    public:
        double getSide(){
            return side;
        }
};
// derived class EquilateralTriangle
class EquilateralTriangle : public Triangle{
    double base;
    double side;
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            base = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
            side = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
            double halfBase = base/2;
            double apothem = pow(side,2) - pow(halfBase,2);
            return (apothem * base)/2;
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            return base*3;
    }
};
// derived class IsoscelesTriangleTriangle
class IsoscelesTriangle : public Triangle{
    double base;
    double side;
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        base = pow(pow((x_2 - x_1),2) + pow((y_2 - y_1),2),(double)1/2);
        side = pow(pow((x_3 - x_2),2) + pow((y_3 - y_2),2),(double)1/2);
        return ((base)*pow((pow(side,2) - pow((base/2),2)),(double)1/2))/2;
    }
    //@Override
    public:
    double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        //return super.perimeter(x_1, y_1, x_2,y_2, x_3, y_3);
        return Triangle :: perimeter(x_1, y_1, x_2,y_2, x_3, y_3);
    }
};
// Parent class Quadrilateral
class Quadrilateral : public polygonInterface{
    double base;
    double side;
    public:
        Quadrilateral()
        {
        }
    public:
        Quadrilateral(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3){
            base = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
            side = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
    }
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3){
            base = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
            side = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
            return base * side;
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            Code utilizing Vertex coordinate points. 7
            return (2*base) + (2*side);
    }
    public:
        double getBase(){
            return base;
    }
    public:
        double getSide(){
            return side;
    }
};
// derived class Square
class Square : Quadrilateral{
    double side;
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            side = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
            return pow(side, 2);
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return 4*side;
    }
};
// derived class Rectangle
class Rectangle : public Quadrilateral{
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return Quadrilateral :: area(x_1, y_1, x_2,y_2, x_3, y_3);
        //return super.area(x_1, y_1, x_2,y_2, x_3, y_3);
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            return Quadrilateral :: perimeter(x_1, y_1, x_2,y_2, x_3, y_3);
            //return super.perimeter(x_1, y_1, x_2,y_2, x_3, y_3);
    }
};
// derived class Pentagon
class Pentagon : public Quadrilateral{
    double sideLength1;
    double sideLength2;
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        sideLength1 = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
        sideLength2 = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
        //Scanner console = new Scanner(System.in);
        if(sideLength1 == sideLength2) {
        double apothem = (sideLength1/2)/ (tan(2*M_PI/(5*2))) ; // -> M_PI -> pi
        return ((sideLength1 * 5) * apothem) / 2;
        }
        std::cout << "Please make sure the shape is symmetrical." << "\n"; //System.out.println("Please make sure the shape is symmetrical.");
        std::cout << "Please reenter the 3 vertices" << "\n"; //System.out.println("Please reenter the 3 vertices");
        std::cin >> sideLength1; //sideLength1 = console.nextInt();
        std::cin >> sideLength2; //sideLength2 = console.nextInt();
        return area(x_1, y_1,x_2, y_2, x_3, y_3);
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        //Scanner console = new Scanner(System.in);
        if(sideLength1 == sideLength2){
        return 5 * sideLength1;
        }
        return perimeter(x_1, y_1,x_2, y_2, x_3, y_3);
    }
};
// derived class Hexagon
class Hexagon : public Quadrilateral{
double sideLength1;
double sideLength2;
//@Override
public:
    double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        sideLength1 = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
        sideLength2 = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
        //Scanner console = new Scanner(System.in);
        if (sideLength1 == sideLength2) {
            double apothem = (sideLength1 / 2)/(tan(2*M_PI / (6 * 2)));
            return ((sideLength1 * 6) * apothem) / 2;
        }
        std::cout << "Please make sure the shape is symmetrical." << "\n"; //System.out.println("Please make sure the shape is symmetrical.");
        std::cout << "Please reenter the 3 vertices" << "\n"; //System.out.println("Please reenter the 3 vertices");
        std::cin >> sideLength1; //sideLength1 = console.nextInt();
        std::cin >> sideLength2; //sideLength2 = console.nextInt();
        return area(x_1, y_1,x_2, y_2, x_3, y_3);
        }
        //@Override
    
    double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        if (sideLength1 == sideLength2) {
            return 6 * sideLength1;
        }
        return perimeter(x_1, y_1,x_2, y_2, x_3, y_3);
    }
};
// derived class Octagon
class Octagon : public Quadrilateral{
    double sideLength1;
    double sideLength2;
    //@Override
    public:
        double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
            sideLength1 = sqrt(pow((x_2 - x_1),2) + pow((y_2 - y_1),2));
            sideLength2 = sqrt(pow((x_3 - x_2),2) + pow((y_3 - y_2),2));
            //Scanner console = new Scanner(System.in);
            if (sideLength1 == sideLength2) {
                double apothem = (sideLength1 / 2)/(tan(2*M_PI / (8 * 2)));
                return ((sideLength1 * 8) * apothem) / 2;
            }
            std::cout << "Please make sure the shape is symmetrical." << "\n"; //System.out.println("Please make sure the shape is symmetrical.");
            std::cout << "Please reenter the 3 vertices" << "\n"; //System.out.println("Please reenter the 3 vertices");
            std::cin >> sideLength1; //sideLength1 = console.nextInt();
            std::cin >> sideLength2; //sideLength2 = console.nextInt();
            return area(x_1, y_1,x_2, y_2, x_3, y_3);
    }
    //@Override
    public:
        double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        if (sideLength1 == sideLength2) {
            return 8 * sideLength1;
        }
        return perimeter(x_1, y_1,x_2, y_2, x_3, y_3);
    }
};
// main
int main() {
////objects for all the classes/////////////////////////////////////////////////
IsoscelesTriangle isoscelesTriangle = IsoscelesTriangle();
EquilateralTriangle equilateralTriangle = EquilateralTriangle();
bool error = true;

do { // if a wrong input does occur just runs the algorithm again until a correct input has been entered.
        try { // check for wrong inputs
            //Scanner console = new Scanner(System.in);
            std::cout << "This program is built to find the area and perimeter of various polygons and compare their similarities." << "\n";
            std::cout << "This program will require you to have the vertix points as coordinates to calculate the area and perimeter." << "\n";
            std::cout << "This program is designed to only compare 2 polygons." << "\n";
            std::cout << "------------------------------------------------------------------------------------------------------------" << "\n";
            std::cout << "Please enter how many sides the object has:" << "\n";
            int input;
            std::cin >> input;
            Square square = Square();
            Rectangle rectangle = Rectangle();
            Pentagon pentagon = Pentagon();
            Hexagon hexagon = Hexagon();
            Octagon octagon = Octagon();
            ////////////////////////////////////////////////////////////////////////////////
            /// Triangle ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (input == 3) {
                std::vector<double> listOfSides;
                std::cout << "Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' " << "\n";
                std::cout << "This program is built to only compare 2 Polygons" << "\n";
                std::cout << "--------------------------------------------------------------------------" << "\n";
                int ComparisonDecision;
                std::cin >> ComparisonDecision;
                if(ComparisonDecision != -1) { // checks if the user want to compare.
                for(int i = 0; i < 2; i++) {
                    std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for triangle number. "
                    << (i + 1) << ": " << "Please enter the coordinate points like so -> 'x_1' 'space' 'y_1',
                    Do this 3 times for all 3 coordinate points." <<"\n";
                    std::cout << "--------------------------------------------------------------------------" << "\n";
                    int x_1;
                    std:: cin >> x_1;
                    int y_1;
                    std:: cin >> y_1;
                    int x_2;
                    std:: cin >> x_2;
                    int y_2;
                    std:: cin >> y_2;
                    int x_3;
                    std:: cin >> x_3;
                    int y_3;
                    std:: cin >> y_3;
                    Triangle triangle = Triangle(x_1, y_1, x_2, y_2, x_3, y_3);
                    if(triangle.getBase() == triangle.getSide()) {
                        std::cout << "The area of the Equilateral triangle is: " << std::setprecision(3)
                        << equilateralTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the Equilateral triangle is: "<< std::setprecision(3)
                        << equilateralTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        listOfSides.push_back(triangle.getBase());
                        listOfSides.push_back(triangle.getSide());
                    } else {
                        std::cout << "The area of the isosceles triangle is: " << std::setprecision(3)
                        << isoscelesTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the isosceles triangle is: " << std::setprecision(3)
                        << isoscelesTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        listOfSides.push_back(triangle.getBase());
                        listOfSides.push_back(triangle.getSide());
                    }
                }
                for(int i = 0; i < listOfSides.size() - 1; i++) { // checks if the ratio for a side of one polygon is equal to another.
                    std::cout << "The ratio of base for the two triangles: "
                    << std::setprecision(3) << listOfSides[i]/ listOfSides[i + 2] << "\n";
                    std::cout << "The ratio of side for the two triangles: "
                    << std::setprecision(3) << listOfSides[i]/ listOfSides[i + 2] << "\n";
                    std::cout << "--------------------------------------------------------------------------" << "\n";
                    if(listOfSides[i]/ listOfSides[i + 2] == listOfSides[i + 1]/ listOfSides[i + 3]){
                        std::cout << "Since the ratio of both triangles are the same. The triangles are similar" << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        break;
                    }else{
                        std::cout << "Since the ratio of both triangles are not the same. The triangles are similar" << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        break;
                    }
                }
                }else{ // if the user does not want to compare just runs the algorithm once.
                    std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for the triangle.
                    Please enter the coordinate points like so -> 'x_1' 'space' 'y_1', Do this 3 times for all 3 coordinate points. " << "\n";
                    std::cout << "--------------------------------------------------------------------------" << "\n";
                    int x_1;
                    std:: cin >> x_1;
                    int y_1;
                    std:: cin >> y_1;
                    int x_2;
                    std:: cin >> x_2;
                    int y_2;
                    std:: cin >> y_2;
                    int x_3;
                    std:: cin >> x_3;
                    int y_3;
                    std:: cin >> y_3;
                    Triangle triangle = Triangle(x_1, y_1, x_2, y_2, x_3, y_3);
                    if(triangle.getBase() == triangle.getSide()) {
                        std::cout << "The area of the Equilateral triangle is: " << std::setprecision(3)
                        << equilateralTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the Equilateral triangle is: "<< std::setprecision(3)
                        << equilateralTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        listOfSides.push_back(triangle.getBase());
                        listOfSides.push_back(triangle.getSide());
                    } else {
                        std::cout << "The area of the isosceles triangle is: " << std::setprecision(3)
                        << isoscelesTriangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the isosceles triangle is: " << std::setprecision(3)
                        << isoscelesTriangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        listOfSides.push_back(triangle.getBase());
                        listOfSides.push_back(triangle.getSide());
                    }
                }
                ///// Quadrilateral //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            } else if (input == 4) {
                std::vector<double> listOfSides;
                std::cout << "Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' " << "\n";
                std::cout << "This program is built to only compare 2 Polygons" << "\n";
                std::cout << "--------------------------------------------------------------------------" << "\n";
                int comparisonDecision;
                std::cin >> comparisonDecision;
                if(comparisonDecision != -1){
                    for(int i = 0; i < 2; i++) {
                        std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for square number " << (i + 1) << ": "
                        << "Please enter the coordinate points like so -> 'x_1' 'space' 'y_1', Do this 3 times for all 3 coordinate points." << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        int x_1;
                        std:: cin >> x_1;
                        int y_1;
                        std:: cin >> y_1;
                        int x_2;
                        std:: cin >> x_2;
                        int y_2;
                        std:: cin >> y_2;
                        int x_3;
                        std:: cin >> x_3;
                        int y_3;
                        std:: cin >> y_3;
                        Quadrilateral quadrilateral = Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                        if (quadrilateral.getBase() == quadrilateral.getSide()) {
                            std::cout << "The area of the square is: : " << std::setprecision(3)
                            << square.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "The perimeter of the square is: " << std::setprecision(3)
                            << square.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            listOfSides.push_back(quadrilateral.getBase());
                            listOfSides.push_back(quadrilateral.getSide());
                        } else {
                            std::cout << "The area of the rectangle is: " << std::setprecision(3)
                            << rectangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "The perimeter of the rectangle is: " << std::setprecision(3)
                            << rectangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            listOfSides.push_back(quadrilateral.getBase());
                            listOfSides.push_back(quadrilateral.getSide());
                        }
                    }
                    for(int i = 0; i < listOfSides.size() - 1; i++) {
                        std::cout << "The ratio of the quadrilateral's base is equal to: " << std::setprecision(3)
                        << listOfSides[i] / listOfSides[i + 2] << "\n";
                        std::cout << "The ratio of the quadrilateral's side is equal to: " << std::setprecision(3)
                        << listOfSides[i + 1] / listOfSides[i + 3] << "\n";
                        if (listOfSides[i] / listOfSides[i + 2] == listOfSides[i + 1] / listOfSides[i + 3]) {
                            std::cout << "since the ratio of both the quadrilaterals are the same, the quadrilaterals are similar" << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            break;
                        } else {
                            std::cout << "since the ratio of both the quadrilaterals are not the same, the quadrilaterals are not similar" << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            break;
                        }
                    }
                }else{
                std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for the square.
                Please enter the coordinate points like so -> 'x_1' 'space' 'y_1', Do this 3 times for all 3 coordinate points. " << "\n" ;
                std::cout << "--------------------------------------------------------------------------" << "\n";
                int x_1;
                std:: cin >> x_1;
                int y_1;
                std:: cin >> y_1;
                int x_2;
                std:: cin >> x_2;
                int y_2;
                std:: cin >> y_2;
                Code utilizing Vertex coordinate points. 10
                int x_3;
                std:: cin >> x_3;
                int y_3;
                std:: cin >> y_3;
                Quadrilateral quadrilateral = Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                if (quadrilateral.getBase() == quadrilateral.getSide()) {
                std::cout << "The area of the square is: : " << std::setprecision(3)
                << square.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                std::cout << "The perimeter of the square is: " << std::setprecision(3)
                << square.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                std::cout << "--------------------------------------------------------------------------" << "\n";
                listOfSides.push_back(quadrilateral.getBase());
                listOfSides.push_back(quadrilateral.getSide());
                } else {
                std::cout << "The area of the rectangle is: " << std::setprecision(3)
                << rectangle.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                std::cout << "The perimeter of the rectangle is: " << std::setprecision(3)
                << rectangle.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                std::cout << "--------------------------------------------------------------------------" << "\n";
                listOfSides.push_back(quadrilateral.getBase());
                listOfSides.push_back(quadrilateral.getSide());
                }
                }
            ///////// Quadrilateral with 5 or more side lengths ////////////////////////////////////////////////////////////////////////////
            } else if (input > 4 && input < 9) {
                std::vector<double> listOfSides;
                std::cout << "Would you like to compare? Enter -1 for 'No'. Any other number for 'Yes' "<< "\n";
                std::cout << "This program is designed to only compare 2 polynomials" << "\n";
                std::cout << "--------------------------------------------------------------------------" << "\n";
                int comparisonDecision;
                std::cin >> comparisonDecision;
                if (comparisonDecision != -1) {
                    for(int i = 0; i < 2; i++){
                        std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for polygon number " << (i + 1)
                        << "Please enter the coordinate points like so -> 'x_1' 'space' 'y_1', Do this 3 times for all 3 coordinate points." <<
                        " making sure both sides are symmetrical: " << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        int x_1;
                        std:: cin >> x_1;
                        int y_1;
                        std:: cin >> y_1;
                        int x_2;
                        std:: cin >> x_2;
                        int y_2;
                        std:: cin >> y_2;
                        int x_3;
                        std:: cin >> x_3;
                        int y_3;
                        std:: cin >> y_3;
                        Quadrilateral quadrilateral = Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                        listOfSides.push_back(quadrilateral.getBase());
                        listOfSides.push_back(quadrilateral.getSide());
                        //// Pentagon ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        if (input == 5) {
                            std::cout << "The area of the pentagon is: " << std::setprecision(3) << pentagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "The perimeter of the pentagon is: " << std::setprecision(3) << pentagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            //// Hexagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        } else if (input == 6) {
                            std::cout <<"The area of the hexagon is: " << std::setprecision(3) << hexagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout <<"The perimeter of the hexagon is: " << std::setprecision(3) << hexagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout <<"--------------------------------------------------------------------------" << "\n";
                            //// Octagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        } else if (input == 8) {
                            std::cout << "The area of the octagon is: " << std::setprecision(3) << octagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout << "The perimeter of the octagon is: " << std::setprecision(3) << octagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                            std::cout <<"--------------------------------------------------------------------------" << "\n";
                        }
                    }
                    for(int i = 0; i < listOfSides.size(); i++) {
                        std::cout << "The ratio of the quadrilateral's base is equal to :" << std::setprecision(3) << listOfSides[i] / listOfSides[i + 2] << "\n";
                        std::cout << "The ratio of the quadrilateral's side is equal to :" << std::setprecision(3) << listOfSides[i + 1] / listOfSides[i + 3] << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                        if (listOfSides[i] / listOfSides[i + 2] == listOfSides[i + 1] / listOfSides[i + 3]) {
                            std::cout << "since the ratio of both the quadrilateral are the same, the quadrilaterals are similar" << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            break;
                        }else{
                            std::cout << "since the ratio of both the quadrilaterals are not the same, the quadrilaterals are not similar" << "\n";
                            std::cout << "--------------------------------------------------------------------------" << "\n";
                            break;
                        }
                    }
                }else{
                    //System.out.println("would you like to compare. Enter Yes/No");
                    std::cout << "Please enter 3 vertices as coordinate points corresponding to 2 side lengths for the polygon.
                    Please enter the coordinate points like so -> 'x_1' 'space' 'y_1', Do this 3 times for all 3 coordinate points." << "\n";
                    std::cout << "--------------------------------------------------------------------------" << "\n";
                    int x_1;
                    std:: cin >> x_1;
                    int y_1;
                    std:: cin >> y_1;
                    int x_2;
                    std:: cin >> x_2;
                    int y_2;
                    std:: cin >> y_2;
                    int x_3;
                    std:: cin >> x_3;
                    int y_3;
                    std:: cin >> y_3;
                    Quadrilateral quadrilateral = Quadrilateral(x_1, y_1, x_2, y_2, x_3, y_3);
                    listOfSides.push_back(quadrilateral.getBase());
                    listOfSides.push_back(quadrilateral.getSide());
                    //// Pentagon ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (input == 5) {
                        std::cout << "The area of the pentagon is: " << std::setprecision(3) << pentagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the pentagon is: " << std::setprecision(3) << pentagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "--------------------------------------------------------------------------" << "\n";
                    //// Hexagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    } else if (input == 6) {
                        std::cout <<"The area of the hexagon is: " << std::setprecision(3) << hexagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout <<"The perimeter of the hexagon is: " << std::setprecision(3) << hexagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        Code utilizing Vertex coordinate points. 11
                        std::cout <<"--------------------------------------------------------------------------" << "\n";
                    //// Octagon //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    } else if (input == 8) {
                        std::cout << "The area of the octagon is: " << std::setprecision(3) << octagon.area(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout << "The perimeter of the octagon is: " << std::setprecision(3) << octagon.perimeter(x_1, y_1, x_2, y_2, x_3, y_3) << "\n";
                        std::cout <<"--------------------------------------------------------------------------" << "\n";
                    }
                }
            }
            // Catch wrong inputs ///////////////////////////////////////////////////////////////////////
        } catch (std::exception) {
            error = false;
            std::cout << "Wrong input. Please try again!"<< "\n";
            std::cout << "--------------------------------------------------------------------------" << "\n";
            //System.out.println();
        }
    }while(!error);
}