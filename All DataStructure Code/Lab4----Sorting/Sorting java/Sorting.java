import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args){
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        String [] arr2 = {"hello", "bye", "dog", "run", "java"};
        Integer [] unsorted = {4,2,9,1,10};
        System.out.println(sequentialSearch(arr, 9));
        System.out.println("-----------------------------------------------------");
        System.out.println(binarySearch(unsorted, 9));
        //System.out.println(Arrays.toString(sorting(unsorted)));

    }
    public static<T extends Comparable<T>> int binarySearch(T [] arr, T target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(arr[i+1]) > 0) {
                sorting(arr);
                int first = 0;
                int last = arr.length - 1;
                while(first <= last){
                    int mid = (first + last)/2;
                    if(arr[mid].equals(target)){
                        return mid + 1;
                    }else if(arr[mid].compareTo(target) < 0){
                        first = mid + 1;
                    }else{
                        last = mid - 1;
                    }
                }
                return -1;
            }else{
                int first = 0;
                int last = arr.length - 1;
                while(first <= last){
                    int mid = (first + last)/2;
                    if(arr[mid].equals(target)){
                        return mid + 1;
                    }else if(arr[mid].compareTo(target) < 0){
                        first = mid + 1;
                    }else{
                        last = mid - 1;
                    }
                }
                return -1;
            }
        }
        return -1;

    }

    public static <T extends Comparable<T>> int sequentialSearch(T [] arr, T target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(target)){
                return i + 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> T [] sorting(T [] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


}
