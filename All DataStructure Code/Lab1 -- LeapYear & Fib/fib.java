// Fibonacci class------------------------------------------------------------------------------------------------------------------
public class fib {
    // implement a fib with recursion
    public int fibRecursion(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        int fib = fibRecursion(n - 1) + fibRecursion(n-2);
        return fib;
    }
    // implement a fib with a loop
    public int fibLoop(int size)
        {
        int firstNum = 0;
        int secondNum = 1;
        int previousSum;
        for(int i = 1; i < size ; i++)
        {
            System.out.print(firstNum + " ");
            previousSum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = previousSum;
        }
        return firstNum;
    }
}
    