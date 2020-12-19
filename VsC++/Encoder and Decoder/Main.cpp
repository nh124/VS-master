#include <iostream>
using namespace std;
#include <bits/stdc++.h> 

class encodingFucntion{
    public:
     void Encode(string word, int key); //O(1)
     void Decode(string word, int key); //O(1)
};
/* base runtime: O(2) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 

class caesarCipher: public encodingFucntion{
    int key; //O(1)
    char encoderUpperCase[26];//O(1)
    char decoderUpperCase[26];//O(1)
    char encoderLowerCase[26];//O(1)
    char decoderLowerCase[26]; //O(1)
    /* base runtime: O(4) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 
  public:
    caesarCipher(){
        
    }
  public:
    caesarCipher(int key){
        for(int i = 0; i < 26; i++){ 
            encoderUpperCase[i] = 'A' + key; // for uppercase //O(1)
            decoderUpperCase[i] = 'A' - key; //O(1)
            encoderLowerCase[i] = 'a' + key; // for lowercase //O(1)
            decoderLowerCase[i] = 'a' - key; //O(1)
        }
        /* base runtime: O(4) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 
    }
    public:  // EncodeLowerCase
         void EncodeLowerCase(string word, int key){   
          int length = word.length();  //O(1)
          char encoding[length + 1]; //O(1)
          strcpy(encoding, word.c_str());  //O(1)

        for(int i = 0; i < length; i++){
            //  O(1)          O(n)       O(2n)
            encoderLowerCase[i] = encoding[i]; //O(n)
        }
        for(int i = 0; i < length + 1; i++){
            //  O(1)          O(n)       O(2n)
            if(encoding[i] + key > 126){ //O(1)
                encoding[i] = (char) (96 + (key - ('z' - encoding[i]))); //O(n)
            }else{ //O(n)
                encoding[i] += key; //O(n)
            }
        }
        for (int i = 0; i < length; i++){
            //  O(1)          O(n)       O(2n)
              cout << encoding[i]; //O(n)
        } /* O(13n + 7) -> O(n)(drop constants)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
        */
    }

    public: // DecodeLowerCase
        void DecodeLowerCase(string word, int key){
            int length = word.length();//O(1)
            char decoding[length + 1];//O(1)
            strcpy(decoding, word.c_str());//O(1)

            for(int i = 0; i <length; i++){
                //  O(1)          O(n)       O(2n)
                decoderLowerCase[i] = decoding[i]; //O(n)
            }
            for(int i = 0; i < length; i++){
                //  O(1)          O(n)       O(2n)
                decoderLowerCase[i] = decoding[i]; //O(n)
            }
            for(int i = 0; i < length + 1; i++){
                //  O(1)          O(n)       O(2n)
                if(decoding[i] + key > 126){ //O(n)
                    decoding[i] = (char) (96 + (key - ('z' - decoding[i]))); //O(n)
                }else{ //O(n)
                    decoding[i] -= key;//O(n)
                }
            }
            for (int i = 0; i < length; i++){ 
                //  O(1)          O(n)       O(2n)
              cout << decoding[i]; //O(n)
          } 
        }
        /* O(13n + 7) -> O(n)(drop constants)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
        */
    
    public:  // EncodeUpperCase
         void EncodeUpperCase(string word, int key){   
          int length = word.length(); //O(1)
          char encoding[length + 1];//O(1)
          strcpy(encoding, word.c_str()); //O(1)

        for(int i = 0; i < length; i++){
             //  O(1)          O(n)       O(2n)
            encoderUpperCase[i] = encoding[i]; //O(n)
        }
        for(int i = 0; i < length + 1; i++){
             //  O(1)          O(n)       O(2n)
            if(encoding[i] + key > 126){
                encoding[i] = (char) (96 + (key - ('Z' - encoding[i]))); //O(n)
            }else{
                encoding[i] += key; //O(n)
            }
        }
        for (int i = 0; i < length; i++){
             //  O(1)          O(n)       O(2n)
              cout << encoding[i]; //O(n)
        } 
    }
    /* O(13n + 7) -> O(n)(drop constants)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
        */
    public: // DecodeUpperCase
        void DecodeUpperCase(string word, int key){
            int length = word.length(); //O(1)
            char decoding[length + 1]; //O(1)
            strcpy(decoding, word.c_str()); //O(1)
            for(int i = 0; i <length; i++){ 
                //  O(1)          O(n)       O(2n)
                decoderUpperCase[i] = decoding[i]; //O(1)
            }
            for(int i = 0; i < length; i++){
                //  O(1)          O(n)       O(2n)
                decoderLowerCase[i] = decoding[i]; //O(n)
            }
            for(int i = 0; i < length + 1; i++){
                //  O(1)          O(n)       O(2n)
                if(decoding[i] + key > 126){//O(n)
                    decoding[i] = (char) (96 + (key - ('Z' - decoding[i]))); //O(n)
                }else{
                    decoding[i] -= key; //O(n)
                }
            }
            for (int i = 0; i < length; i++){
                //  O(1)          O(n)       O(2n)
              cout << decoding[i];//O(n)
          }  
        }
        /* O(13n + 7) -> O(n)(drop constants)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
        */

    
};



// main
int main() {
        caesarCipher cp = caesarCipher();
        cp.EncodeLowerCase("Hello", 5);
        std::cout << "\n";
        cp.DecodeLowerCase("Mjqqt", 5);
        std::cout << "\n";
        cp.EncodeUpperCase("HELLO", 5);
        std::cout << "\n";
        cp.DecodeUpperCase("MJQQT", 5);
        
}

