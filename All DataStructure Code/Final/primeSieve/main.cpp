#include <iostream>
/*Question 8 -------------------------------------------------------------------------------------------------
Question: (5 points) What is the worst-case time for putting n entries in an initially empty hash table, with
collisions resolved by chaining? What is the best case?
------------------------------------------------------------------------------------------------------------
Answer: For a standared hasing function since we are constantly looking up locating where data goes by using 
the hash function the time compleity remains O(1) is the best case. but if the map is  not sorted then the lookup time is  
O(n) because of the chaining function. if the map is sorted the the lookup time is O(n+n) or O(2n).
*/

// Quetion 9--------------------------------------------------------------------------------------------------
class primeSieve{
  int numb; 
  int i;
  int j;
  bool *arr;
  public:
    void sieve(int numb){
      this->numb = numb; // O(1)
      int prime = (2*numb) + 2; // O(1)
      arr =  new bool[prime]; // O(1)
      for(i = 0; i <= 2 * numb; i++){ // O(3n)
        arr[i] = true; // O(n)
      }
      for(i = 0; i * i <= 2; i++){ // O(3n)
        if(arr[i] == true){ // O(n)
          for(j = i*i; j < 2 * numb; j += i){ // O(6n^2)
            arr[j] = false; // O(n^2)
          }
        }
      }
    }    
    /*
     * O(7n^2 + 6n + 3 ) -> O(n^2) Big O: O(n^3) -> tight upper bound: O(11n^2) ->
     * loose upperBound: O(10.5n^2) Big omega: O(n) -> tight lower bound: O(1) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(n^2).
     */
  void print(){
    std::cout << "First prime between " << numb << " and " << 2 * numb << " : "; // O(1)
    for(int i = 0; i < 2* numb; i++){ // O(3n)
      if(arr[i] == true){ // O(n)
        std::cout << i << "\n"; // O(n)
        break; // O(1)
      }
    }
  }
   /* base runtime: O(5n + 2) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */  
};

int main(){
    std::cout << "Enter a number please: ";
    primeSieve sieveing = primeSieve();
    int m;
    std::cin >> m;
    sieveing.sieve(m);
    sieveing.print();

}