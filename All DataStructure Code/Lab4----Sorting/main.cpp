#include <iostream>


template<typename T>
T sequencialSearch(T arr[] , T target, int size){
  for(int i = 0; i <= size; i++){
  //    O(1)        O(n)     O(2n)
      if(arr[i] == target){
        return i+1; //O(1)
      }
  }
  return -1; //O(1)
}
/*base run time is O(4n + 2) -> O(n)(drop constants)
      Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
    */

template<typename T>
T binarySearch(T arr [], T target, T size){
  int start = 0; //O(1)
  int end = size; //O(1)
  while(start <= end){ //O(n/2^i)
    int mid = (start + end)/2; //O(n/2^i)
    if(arr[mid] == target){ //O(n/2^i)
      return mid + 1; //O(1)
    }else if(arr[mid] < target){ //O(n/2^i)
      start =  mid + 1; //O(n/2^i)
    }else{ //O(n/2^i)
      end = mid -1; //O(n/2^i)
    }
  }
  return -1; //O(1)

}
/* 
     O(7n/(2^i)) + O(4))
        O(7n/(2^i) +  4)
        O(log(7n) + 4)
    base run time is O(log(7n) + 4) -> O(log(n))(drop constants)
    Big O: O(n) -> tight upper bound: O((1/10)n) -> loose upperbound: O(n)
      Big omega: O(1) -> tight lower bound: O(2)-> loose lower bound: O(1/10)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(log(n)).
     
*/

template<typename T>
T isEquals(T arr[] , int size){ 
  for(int i = 0; i <= size; i++){
   //  O(1)          O(n)       O(2n)
      if(arr[i] == arr[i+1]){ //o(n)
        return true; //O(1)
      }
  }
  return false; // O(1)
}
/*
    base run time is O(3n + 3) -> O(n) (drop constants)
    Big O: O(n) -> tight upper bound: O(4n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: O(100log(n))-> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
*/

int main() {
  int arrSorted [] = {1,2,2,4,5,6,7,8,9};
  int arrUnsorted [] = {2,5,3,10,2,4,6,8,1};

  std::cout << "Sequencial Search with a sorted array: "<< sequencialSearch(arrSorted, 2, 9) << "\n";
  std::cout << "Sequencial Search witn an unsorted array: "<< sequencialSearch(arrUnsorted, 2, 9) << "\n";
  std::cout << "Binary search: " << binarySearch(arrSorted, 2, 9) << "\n";
  std::cout << "Is there identical element in this array? " << isEquals(arrSorted, 9) << "\n";
  
}