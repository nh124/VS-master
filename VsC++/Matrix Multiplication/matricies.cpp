#include <iostream>

class matrixOPeration
{

public:
    void add()
    {
        int rows;                //O(1)
        int columns;             //O(1)
        int matrix1[100][100];   //O(1)
        int matrix2[100][100];   //O(1)
        int sumMatrix[100][100]; //O(1)

        std::cout << "Please enter how many rows there are: "
                  << "\n"; //O(1)
        std::cin >> rows;  //O(1)
        std::cout << "Please enter how many columns there are: "
                  << "\n";   //O(1)
        std::cin >> columns; //O(1)

        std::cout << "Enter elements of the 1st matrix: " << std::endl; //O(1)
        for (int i = 0; i < rows; i++)
        {
            //O(1)         O(n)    //O(2n)
            for (int j = 0; j < columns; j++)
            {
                //O(1)         O(n*n)    //O(2n*n)
                std::cout << "Please enter Matrix1 " << i + 1 << j + 1 << " : "; //O(n*n)
                std::cin >> matrix1[i][j];                                       //O(n*n)
            }
        }
        std::cout << "Enter elements of the 2nd matrix: " << std::endl; //O(1)
        for (int i = 0; i < rows; i++)
        {
            //O(1)         O(n)    //O(2n)
            for (int j = 0; j < columns; j++)
            {
                //O(1)         O(n*n)    //O(2n*n)
                std::cout << "Please enter Matrix2 " << i + 1 << j + 1 << " : "; //O(n*n)
                std::cin >> matrix2[i][j];                                       //O(n*n)
            }
        }

        for (int i = 0; i < rows; i++)
        {
            //O(1)         O(n)    //O(2n)
            for (int j = 0; j < columns; j++)
            {
                //O(1)         O(n*n)    //O(2n*n)
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; //O(n*n)
            }
        }
        std::cout << "The matrix sum is: "
                  << "\n"; //O(1)
        for (int i = 0; i < rows; ++i)
        {
            //O(1)         O(n)    //O(2n)
            for (int j = 0; j < columns; ++j)
            {
                //O(1)         O(n*n)    //O(2n*n)
                std::cout << sumMatrix[i][j] << "  "; //O(n*n)
                if (j == columns - 1)                 //O(n*n)
                    std::cout << "\n";                //O(n*n)
            }
        }
    } /* O(18n^2 + 10n + 20) -> O(n^2)
  Big O: O(n^2) -> tight upper bound: O(20n^2) -> loose upperbound: O(100n^2)
      Big omega: O(log(n)) -> tight lower bound: (O(100log(n))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n^2).
  */
public:
    void multiply()
    {
        int rows1;    //O(1)
        int columns1; //O(1)
        int rows2;    //O(1)
        int columns2; //O(1)

        int matrix1[10][10]; //O(1)
        int matrix2[10][10]; //O(1)

        int timesMatrix[10][10]; //O(1)

        std::cout << "Please enter how many rows the first matrix has: "
                  << "\n"; //O(1)
        std::cin >> rows1; //O(1)
        std::cout << "Please enter how many columns the first matrix has: "
                  << "\n";    //O(1)
        std::cin >> columns1; //O(1)

        std::cout << "Please enter how many rows the second matrix has: "
                  << "\n"; //O(1)
        std::cin >> rows2; //O(1)
        std::cout << "Please enter how many columns the second matrix has: "
                  << "\n";    //O(1)
        std::cin >> columns2; //O(1)

        if (columns1 == rows2)
        {
            std::cout << "Enter elements of the 1st matrix: " << std::endl;
            for (int i = 0; i < rows1; i++)
            {
                //O(1)         O(n)    //O(2n)
                for (int j = 0; j < columns1; j++)
                {
                    std::cout << "Please enter Matrix1 " << i + 1 << j + 1 << " : "; //O(n*n)
                    std::cin >> matrix1[i][j];                                       //O(n*n)
                }
            }
            std::cout << "Enter elements of the 2nd matrix: " << std::endl; //O(1)
            for (int i = 0; i < rows2; i++)
            {
                //O(1)         O(n)    //O(2n)
                for (int j = 0; j < columns2; j++)
                {
                    //O(1)         O(n*n)    //O(2n*n)
                    std::cout << "Please enter Matrix2 " << i + 1 << j + 1 << " : "; //O(n*n)
                    std::cin >> matrix2[i][j];                                       //O(n*n)
                }
            }

            for (int i = 0; i < rows1; i++)
            {
                //O(1)         O(n)    //O(2n)
                for (int j = 0; j < columns2; j++)
                {
                    //O(1)         O(n*n)    //O(2n*n)
                    timesMatrix[i][j] = 0; //O(n*n)
                }
            }

            for (int i = 0; i < rows1; i++)
            {
                //O(1)         O(n)    //O(2n)
                for (int j = 0; j < columns2; j++)
                {
                    //O(1)         O(n*n)    //O(2n*n)
                    for (int k = 0; k < columns1; k++)
                    {
                        //O(1)         O(n*n*n)    //O(2n*n*n)
                        timesMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; //O(n*n*n)
                    }
                }
            }
            std::cout << "The matrix multimplication is: "
                      << "\n"; //O(1)
            for (int i = 0; i < rows1; i++)
            {
                //O(1)         O(n)    //O(2n)
                for (int j = 0; j < columns2; j++)
                {
                    //O(1)         O(n*n)    //O(2n*n)
                    std::cout << timesMatrix[i][j] << "  ";
                    if (j == columns2 - 1)
                    {                      //O(n*n)
                        std::cout << "\n"; //O(n*n)
                    }
                }
            }
            /*
        Base runtime:O(4n^3 + 19n+ 27)
        Big O: O(n^3) -> tight upper bound: O(4n^3 + 199) -> loose upperbound: O(4n^3 + 400)
      Big omega: O(n^2) -> tight lower bound: (O(4n^2 +500))) -> loose lower bound: O(n^2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n^3). 
        */
        }
        else
        {
            std::cout << "This multiplication is undefined!"
                      << "\n"; //O(1)
        }
    }
};
int main()
{
    matrixOPeration mo = matrixOPeration();
    mo.add();
    mo.multiply();
}
