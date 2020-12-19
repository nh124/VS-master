// #include<iostream>
// #include<vector>
// #include<string>
#include <iostream>
#include <cmath>
#include <iterator> 
#include <vector>
#include <iomanip>

/* Lab 3
user should be able to add to the cup
user should be able to remove from the cup
user should be able to display the cup
user should be able to search the cup
use shoud be able to check if the cup is empty 
user should be able to compare one cup to another
number of cups 3
*/

template<class T>class magic { // interface
public:
	virtual bool isEmpty() = 0;
	virtual std::vector<T> addToCup() = 0;
	virtual std::vector<T> removeFromCup() = 0;
	virtual std::vector<T> displayCup() = 0;
	virtual bool searchCup() = 0;
};

template<class T>class MagicCup1 : public magic<T>{
std::vector<T> list;

public: // empty
	bool isEmpty() {
		if (list.empty()) {
			return true;
		}
		return false;
	}

public: // add
	std::vector<T> addToCup() {
		//std::cout << "please input how many items you would like to add to cup 1 followed by the list itself." << "\n";
		std::cout << "Number of items: " << "\n";
		int numOfelements;
		std::cin >> numOfelements;
		std::cout << "Items: " << "\n";
		T elements;
		for (int i = 0; i < numOfelements; i++) {
			std::cin >> elements;
			list.push_back(elements);
		}
		return list;

	}

public: // remove
	std::vector<T> removeFromCup() {
		std::cout << "Please enter how many items you would like to remove from cup 1 followed by the items themselves:  " << "\n";
		std::cout << "Number of items being removed: " << "\n";
		int numberOfRemoval;
		std::cin >> numberOfRemoval;
		for (int i = 0; i < numberOfRemoval; i++) {
			std::cout << "Please enter item << i <<  to be removed" << "\n";
			T removal;
			std::cin >> removal;
  			if (list[i] == removal) {
  				list.erase(list.begin()+ i);
  			}
  			else {
  				std::cout << "The list is already empty." << "\n";
  			}
			}
		return list;
	};

public: // display cup
	std::vector<T> displayCup() {
		std::cout << "contents of cup 1" << "\n";
		return list;
	}

public: // searchCup
	bool searchCup() {
		std::cout << "Please input what you are looking from in the cup: " << "\n";
			T search;
		std::cin >> search;
		for(int i = 0; i < list.size(); i++){
  		if (list[i] == search) {
  			return true;
  		}
	  }
	  return false;
	}
public: 
	int compareTo(T ob1) {
		return 0;
	}
};

template<class T> class MagicCup2 : public magic<T>{
std::vector<T> list;

public: // empty
	bool isEmpty() {
		if (list.empty()) {
			return true;
		}
		return false;
	}

public: // add
	std::vector<T> addToCup() {
		std::cout << "please input how many items you would like to add to cup 2 followed by the list itself." << "\n";
		std::cout << "Number of items: " << "\n";
		int numOfelements;
		std::cin >> numOfelements;
		std::cout << "Items: " << "\n";
		T elements;
		for (int i = 0; i < numOfelements; i++) {
			std::cin >> elements;
			list.push_back(elements);
		}
		return list;

	}

public: // remove
	std::vector<T> removeFromCup() {
		std::cout << "Please enter how many items you would like to remove from cup 2 followed by the items themselves:  " << "\n";
		std::cout << "Number of items being removed: " << "\n";
		int numberOfRemoval;
		std::cin >> numberOfRemoval;
		for (int i = 0; i < numberOfRemoval; i++) {
			std::cout << "Please enter item << i <<  to be removed" << "\n";
			T removal;
			std::cin >> removal;
  			if (list[i] == removal) {
  				list.erase(list.begin()+ i);
  			}
  			else {
  				std::cout << "The list is already empty." << "\n";
  			}
			}
		return list;
	};

public: // display cup
	std::vector<T> displayCup() {
		std::cout << "contents of cup 1" << "\n";
		return list;
	}

public: // searchCup
	bool searchCup() {
		std::cout << "Please input what you are looking from in the cup: " << "\n";
			T search;
		std::cin >> search;
		for(int i = 0; i < list.size(); i++){
  		if (list[i] == search) {
  			return true;
  		}
	  }
	  return false;
	}
public: 
	int compareTo(T ob1) {
		return 0;
	}
};

template<class T> class MagicCup3 : public magic<T>{
  public: 
    std::vector<T> list;

public: // empty
	bool isEmpty() {
		if (list.empty()) {
			return true;
		}
		return false;
	}

public: // add
	std::vector<T> addToCup() {
		std::cout << "please input how many items you would like to add to cup 3 followed by the list itself." << "\n";
		std::cout << "Number of items: " << "\n";
		int numOfelements;
		std::cin >> numOfelements;
		std::cout << "Items: " << "\n";
		T elements;
		for (int i = 0; i < numOfelements; i++) {
			std::cin >> elements;
			list.push_back(elements);
		}
		return list;

	}

public: // remove
	std::vector<T> removeFromCup() {
		std::cout << "Please enter how many items you would like to remove from cup 3 followed by the items themselves:  " << "\n";
		std::cout << "Number of items being removed: " << "\n";
		int numberOfRemoval;
		std::cin >> numberOfRemoval;
		for (int i = 0; i < numberOfRemoval; i++) {
			std::cout << "Please enter item << i <<  to be removed" << "\n";
			T removal;
			std::cin >> removal;
  			if (list[i] == removal) {
  				list.erase(list.begin()+ i);
  			}
  			else {
  				std::cout << "The list is already empty." << "\n";
  			}
			}
		return list;
	};

public: // display cup
	std::vector<T> displayCup() {
		std::cout << "contents of cup 1" << "\n";
		return list;
	}

public: // searchCup
	bool searchCup() {
		std::cout << "Please input what you are looking from in the cup: " << "\n";
			T search;
		std::cin >> search;
		for(int i = 0; i < list.size(); i++){
  		if (list[i] == search) {
  			return true;
  		}
	  }
	  return false;
	}
public: 
	int compareTo(T ob1) {
		return 0;
	}
};

int main(){
  //std::cout << "hello" << "\n";
  MagicCup1<int> mc1 = MagicCup1<int>();
  MagicCup2<int> mc2 = MagicCup2<int>();
  MagicCup3<int> mc3 = MagicCup3<int>();
///////////////////////////////////////////////////////////////////////////////////////////////////////
	std::cout << "Please choose one of the following:  " << "\n";
	std::cout << "1. Magic Cup 1" << "\n" << "2. Magic Cup 2" << "\n" << "3. Magic Cup 3" << "\n" <<"4. Compare cup 1 to another cup." << "\n";
	int choice;
  std::cin >> choice;
  //////////////////////////////////////////
  	std::cout << "Magic Cup " << choice << "\n";
		std::cout << "------------------" << "\n";
		std::cout << "1. Add to cup" << choice << "\n";
		std::cout << "2. Remove from cup" << choice <<  "\n";
		std::cout << "3. display cup" << choice << "\n";
		std::cout << "4. Search cup" << choice << "\n";
		std::cout << "5. Check if cup" << choice << "is empty" << "\n";
		std::cout << "6. Exit." << "\n";
    int mcInput;
		std::cin >> mcInput; 
    if (choice == 1) {
        if (mcInput == 1) {
          mc1.addToCup();
        }
        else if (mcInput == 2) {
          mc1.removeFromCup();
        }
        else if (mcInput == 3) {
          mc1.displayCup();
        }
        else if (mcInput == 4) {
          mc1.searchCup();
        }
        else{
          mc1.isEmpty();
        }
    }
    else if(choice == 2){
          if (mcInput == 1) {
            mc2.addToCup();
    
          }
          else if (mcInput == 2) {
            mc2.removeFromCup();
          }
          else if (mcInput == 3) {
            mc1.displayCup();
          }
          else if (mcInput == 4) {
            mc2.searchCup();
          }
          else {
            mc2.isEmpty();
          }
      }
      else if(choice == 3) {
      int mc3Input;
        if (mcInput == 1) {
          mc1.addToCup();

        }
        else if (mcInput == 2) {
          mc1.removeFromCup();
        }
        else if (mcInput == 3) {
          mc1.displayCup();
        }
        else if (mcInput == 4) {
          mc1.searchCup();
        }
        else {
          mc1.isEmpty();
        }
  }
  else {
      std::cout << "Comparisons" << "\n";
      std::cout << "please input which comparison you would like to do" << "\n";
      std:: cout << "1. Compare cup 1 to cup 2";
      std:: cout << "2. Compare cup 2 to cup 3";
      std:: cout << "3. Compare cup 1 to cup 3";
      int comparisonChoice;
      std::cin >> comparisonChoice;
      //////////////////////////////////////////////////////////////////////////////////////////////////
      if(comparisonChoice == 1){
        // comparison after adding to cups cup 1 and 2
          if (mc1.addToCup() == mc2.addToCup()) {
            std::cout << "Cup 1 and cup 2 have the same elements after adding"  << "\n";
          }else{
            std::cout << "false" << "\n";
          }
        // comparison after removing cups 1 and 2
          if(mc1.removeFromCup() == mc2.removeFromCup()){
              std::cout << "Cup 1 and cup 2 have the same elements after removing"  << "\n";
          }else{
              std::cout << "false" << "\n";
          }
      }else if(comparisonChoice == 2){
      // comparison after adding to cups cup 2 and 3
          if (mc2.addToCup() == mc3.addToCup()) {
            std::cout << "Cup 2 and cup 3 have the same elements after adding"  << "\n";
          }else{
            std::cout << "false" << "\n";
          }
        // comparison after removing cups 2 and 3
          if(mc2.removeFromCup() == mc3.removeFromCup()){
              std::cout << "Cup 2 and cup 3 have the same elements after removing"  << "\n";
          }else{
              std::cout << "false" << "\n";
          }
    }else{
       // comparison after adding to cups cup 1 and 3
          if (mc1.addToCup() == mc3.addToCup()) {
            std::cout << "Cup 2 and cup 3 have the same elements after adding"  << "\n";
          }else{
            std::cout << "false" << "\n";
          }
        // comparison after removing cups 1 and 3
          if(mc1.removeFromCup() == mc3.removeFromCup()){
              std::cout << "Cup 2 and cup 3 have the same elements after removing"  << "\n";
          }else{
              std::cout << "false" << "\n";
          } 
    }
        
  }  
}