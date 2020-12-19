import java.util.Random;
class RandomChiper extends SubstitutionChiper {
  Random rand = new Random();
  int randomKey = rand.nextInt();

    public RandomChiper(int key) {
        super(key);
        
    }
    /* public char [] RandomEncoder(int randKey){
    //   char [] randomEncoder = new char[26];
    //     for(int i = 0; i < 26; i++){
    //         randomEncoder[i] = (char) ('A' + randKey);
    //     }
    //     randomEncoder = super.getEncoder();
    //     return super.getEncoder();
    // }
    // public char [] RandomDecoder(int randKey){
    //   char [] randomDecoder = new char[26];
    //     for(int i = 0; i < 26; i++){
    //         randomDecoder[i] = (char) ('A' + randKey);
    //     }
    //     randomDecoder = super.getDecoder();
    //     return super.getDecoder();
    }
    */

    public char[] messageEncoder(String word) {
        char [] encode = word.toCharArray();
        encode = super.getEncoder();
        int size = word.length();
        for(int i = 0; i < size; i++){
            getEncoder()[i] = encode[i];
        }
        for(int i = 0; i < encode.length; i++){
          if(encode[i] + randomKey > 126){
              encode[i] = (char) (96 + (randomKey - ('z' - encode[i])));
          }else{
            encode[i] += randomKey;
          }  
        }
        return encode;
    }
    
    public char [] messageDecoder(String word){
      char [] decode = word.toCharArray();
      decode = super.getDecoder();
      int size = word.length();
      for(int i = 0; i < size; i++){
        getDecoder()[i] = decode[i];
      } 
      for(int i = 0; i < decode.length; i++){
        if(decode[i] - randomKey < 97 && decode[i] >= 97){
          decode[i] = (char) (123 - (randomKey - (decode[i] - 'a')));
        }else{
         decode[i] -= randomKey;
        }
      }
      return decode;
    }
    

}
