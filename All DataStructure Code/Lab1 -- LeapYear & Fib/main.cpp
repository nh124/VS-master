//C++
#include <iostream>
bool isLeapYear(int);
Lab 1 3
int recursiveFibonacci(int);
int iterativeFibonacci(int);

int main() {
    // leap year
    std::cout << "Leap Year" << "\n";
    std::cout << "-----------------------------" << "\n";
    int year;
    int leapYear;
    std::cout << "Please enter what year it is: ";
    std::cin >> year;
    leapYear = isLeapYear(year);
    std::cout << leapYear << "\n";
    std::cout << "-----------------------------" << "\n";
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Fib recursion
    std::cout << "\nFibonacci using Recursion" << "\n";
    std::cout << "-----------------------------" << "\n";
    int size1;
    int recursion;
    int number = 0;
    std::cout << "\nPlease enter the size of the fibonacci";
    std::cin >> size1;
    while(number < size1)
    {
        recursion = recursiveFibonacci(number);
        std::cout << recursion << " ";
        number++;
    }
    std::cout << "\n-----------------------------" << "\n";
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Fib loop
    std::cout << "\nFibonacci using loop" << "\n";
    std::cout << "-----------------------------" << "\n";
    int size2;
    int fibLoop;
    std::cout << "\nPlease enter the size of the fibonacci";
    std::cin >> size2;
    fibLoop = iterativeFibonacci(size2);
    std::cout << "\n-----------------------------" << "\n";
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
bool isLeapYear( int n ){
    if((n % 400 == 0) || ((n % 100) != 0 && (n % 4 == 0)))
    {
        return true;
    }
    return false;
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int recursiveFibonacci(int n){
    if(n == 0)
    {
        return 0;
    }
    if(n == 1)
    {
        return 1;
    }
    int fib = recursiveFibonacci(n - 1) + recursiveFibonacci(n-2);
    return fib;
    return -1;
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int iterativeFibonacci(int size){
int firstNum = 0;
int secondNum = 1;
int previousSum;
    for(int i = 1; i < size + 1 ; i++)
    {
        std::cout << firstNum << " ";
        previousSum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = previousSum;
    }
return firstNum;
return -1;
}