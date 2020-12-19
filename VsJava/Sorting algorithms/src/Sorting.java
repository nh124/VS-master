import java.util.ArrayList;
import java.util.Random;

public class Sorting {
    public static void main(String [] args)
    {
        System.out.println(list());
        System.out.println("----------------------------------------------------------");

//        System.out.println("Mean");
//        System.out.println(meanVal(list()));
//        System.out.println("----------------------------------------------------------");

        System.out.println("Median");
        System.out.println(medianVal(list()));
        System.out.println("----------------------------------------------------------");

//        System.out.println("Min");
//        System.out.println(minVal(list()));
//        System.out.println("----------------------------------------------------------");

//        System.out.println("Max");
//        System.out.println(maxVal(list()));

    }


    public static double meanVal(ArrayList<Integer> mean)
    {
        int val = 0;
        for(int i : mean)
        {
            //val = val + mean.get(i);
            val += i;
            System.out.print(val +  " ");
        }
        System.out.println();

        return val / mean.size();

    }

    public static double medianVal(ArrayList<Integer> median)
    {
        int temp;
        boolean sorted = false;
        while(sorted == false) {
            sorted = true;
            for (int i : median) {
                temp = median.get(i + 1);
                if (median.get(i) > median.get(i + 1)) {
                    temp = median.get(i + 1);
                    median.set(i + 1, median.get(i));
                    median.set(i, temp);
                    sorted = false;
                }
            }
        }
        if(median.size() % 2 == 1)
        {
            int val = median.size()/ 2;
            return median.get(val + 1);

        }else
        {
            int val = median.size()/2;
            int ave = (median.get(val) + median.get(val + 1))/2;
            return ave;
        }
    }

    public static int minVal (ArrayList<Integer> min)
    {
        int temp;
        boolean sorted = false;
        while(sorted == false){
            sorted = true;
            for(int i : min)
            {
                if(min.get(i) > min.get(i + 1))
                {
                    return min.get(i);
//                    temp = min.get(i + 1);
//                    min.set(i + 1, min.get(i));
//                    min.set(i,temp);
//                    sorted = false;
                }
                else if(min.get(i) < min.get(i + 1))
                {
                    return 99;
                }
            }
        }
        return min.get(0);
    }

    public static int maxVal (ArrayList<Integer> max)
    {
        int temp;
        boolean sorted = false;
        while(sorted == false){
            sorted = true;
            for(int i : max)
            {
                if(max.get(i) > max.get(i + 1))
                {
                    temp = max.get(i + 1);
                    max.set(i + 1, max.get(i));
                    max.set(i,temp);
                    sorted = false;
                }
            }
        }
        return max.get(max.size() - 1);
    }
    public static ArrayList<Integer> list()
    {
        ArrayList<Integer> numbs  = new ArrayList<>();
        Random rand = new Random();
        for(int i = 1; i <= 10 ; i++)
        {
            int r = rand.nextInt(10);
            numbs.add(r);
        }
        return numbs;
    }
}
