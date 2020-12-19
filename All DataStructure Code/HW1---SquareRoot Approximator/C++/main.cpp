#include <iostream>

int SquareRootApproximator(int numb){
    if(numb == 0 || numb == 1){ //O(1)
      return numb; //o(1)
    } 
    int start = 1;//o(1)
    int end = numb;//o(1)
    while(start <= end){ //o(n/2^i) -> 'i' is the number of times the numarical array(i.e 1,2,3,4,5,6...) is divided in 2.
      int mid = (start + end)/2; //o(n/2^i)
        if(mid * mid == numb){ //o(n/2^i)
          return mid; //o(1)
        }else if(mid * mid > numb){ //o(n/2^i)
          end =  mid-1; //o(n/2^i)
        }else{ //o(n/2^i)
          start = mid + 1; //o(n/2^i)
        }
    }
    return end;//o(1)
  } /* Runtime = O(7n/2^i) + O(6) -> O(7n/2^i + 6)
               = O(log(7n) + 6) -> O(log(n))(drop constants)
      base runtime: O(log(7n) + 6) -> O(log(n))(drop constants)        
      Big O: O(n) -> tight upper bound: O((1/10)n) -> loose upperbound: O(n)
      Big omega: O(1) -> tight lower bound: O(2)-> loose lower bound: O(1/10)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(log(n)).        
    */
    

int nthRootApproximator(int numb, int root){
    if(numb == 0 || numb == 1){ //O(1)
      return numb; //O(1)
    } 
    int reset = root; //O(1)
    int start = 1; //O(1)
    int end = numb; //O(1)
    while(start <= end){ //O(n/2^i)
      int mid = (start + end)/2;//O(n/2^i)
      int result = 1; //O(n/2^i)
      root = reset; //O(n/2^i)
      while(root != 0){ //O(n^2/2^(2i))
        result*= mid; //O(n^2/2^(2i))
        root--; //O(n^2/2^(2i))
      }
        if(result == numb){ //O(n/2^i)
          return mid;// O(1)
        }else if(result > numb){ //O(n/2^i)
          end =  mid-1; //O(n/2^i)
        }else{ //O(n/2^i)
          start = mid + 1; //O(n/2^i)
        }
    }
    return end; //O()
  } 
  /*
  O(3n^2/2^(2i) + O(9n/(2^i))  O(6)
        O(3n^2/2^(2i) + 9n/(2^i) + 6)
        O(log(3n^2) + log(9n) + 6)
       base run time is O(log(3n^2) + log(9n) + 6) -> O(log(n^2))(drop constants)
      Big O: O(n) -> tight upper bound: O((1/10)n) -> loose upperbound: O(n)
      Big omega: O(1) -> tight lower bound: O(2)-> loose lower bound: O(1/10)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(log(n^2)).
  */

int main() {
    std::cout << "please input a number: ";
    int numb;
    std::cin >> numb;
    std::cout << "please input a root: ";
    int root;
    std::cin >> root;
    std::cout << "The square root of " << numb << " is equal to: " <<  SquareRootApproximator(numb) << "\n" ;
    std::cout << "The " << root << "th root of " << numb << " is equal to: " <<  nthRootApproximator(numb,root) << "\n";
}