import java.util.ArrayList;
import java.util.Random;

public class search {
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        System.out.println(search(numbs(), 0));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " miliseconds");

        System.out.println("-------------------------------------------------------------");

        long start2 = System.currentTimeMillis();
        System.out.println(searchBetter(numbs(), 10));
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2 + " miliseconds");
    }


    public static boolean search(ArrayList<Integer> numb, int target)
    {
        for(int i = 0; i < numb.size(); i++)
        {
            if(i == target)
            {
                return true;
            }
        }
        return false;
    }



    public static boolean searchBetter(ArrayList<Integer> numbs, int target )
    {
       int mid = numbs.size()/2;
           for(int i = 0; i < mid; i++)
           {
               if(numbs.get(i) == target)
               {
                   return true;
               }else{
                   return false;
               }
           }
           for(int i = mid; i < numbs.size(); i++)
           {
               if(numbs.get(i) == target)
               {
                   return true;
               }else{
                   return false;
               }
           }
           return true;
    }



    public static ArrayList<Integer> numbs()
    {
        ArrayList<Integer> numbs = new ArrayList<>();
        Random r = new Random();
        int x = r.nextInt(10);
        for(int i = 0; i < 100000; i++)
        {
            numbs.add(x);
        }
        return numbs;
    }
}
