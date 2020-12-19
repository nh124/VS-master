interface defaultChiper{
    public char [] messageEncoder(String word, int key); //O(1)
    public char [] messageDecoder(String word, int key); //O(1)
}
/* base runtime: O(2) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 
class SubstitutionChiper implements defaultChiper {
    private char [] encoder = new char[26]; //O(1)
    private char [] decoder = new char[26]; //O(1)
    private int key;//O(1)
    /* base runtime: O(3) -> O(1)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
        Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */ 
    public SubstitutionChiper(int key){
        for(int i = 0; i < 26; i++){
        //  O(1)          O(n)       O(2n)
            encoder[i] = (char)('a' + key); //O(n)
            decoder[i] = (char)('a' - key); //O(n)
            continue; //O(n)
        }
    }
    /* base runtime: O(6n+1) -> O(n)
     Big O: O(n) -> tight upper bound: O(7n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
    */

    @Override
    public char[] messageEncoder(String word, int key){
        char [] encode = word.toCharArray(); //O(1)
        int size = word.length(); //O(1)
        for(int i = 0; i < size; i++){
        //  O(1)          O(n)       O(2n)
            encoder[i] = encode[i]; //O(n)
            continue; //O(n)
        }
        for(int i = 0; i < encode.length; i++){
            //  O(1)          O(n)       O(2n)
            if(encode[i] + key > 126){ // 122 -> z O(n)
                encode[i] = (char) (96 + (key - ('z' - encode[i])));//O(n)
            }else{ //O(n)
                encode[i] += key; //O(n)
            }
        }
        return encode; //O(1)
    }
     /* base runtime: O(6n+1) -> O(n)
     Big O: O(n) -> tight upper bound: O(7n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
    */
    
    @Override
    public char[] messageDecoder(String word, int key){ 
    char [] decode = word.toCharArray(); //O(1)
      int size = word.length();//O(1)
      for(int i = 0; i < size; i++){
          //  O(1)          O(n)       O(2n)
        decoder[i] = decode[i]; //O(n)
        continue; //O(n)
      } 
      for(int i = 0; i < decode.length; i++){
          //  O(1)          O(n)       O(2n)
        if(decode[i] - key < 97 && decode[i] >= 97){ //O(n)
            decode[i] = (char) (123 - (key - (decode[i] - 'a'))); //O(n)
          }else{ //O(n)
            decode[i] -= key; //O(n)
          }
        continue; //O(n)
      }
      return decode;  // O(1)
    }
     /* base runtime: O(6n+1) -> O(n)
     Big O: O(n) -> tight upper bound: O(7n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
    */

    public char[] getEncoder(){
        return this.encoder; //  O(1)
    }

    public char[] getDecoder(){
        return this.decoder; //  O(1)
    }

    public int getKey(){
        return this.key; //  O(1)
    }

  
    
    
}