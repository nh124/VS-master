public class CaesarCipher extends SubstitutionChiper {
  
  public CaesarCipher(int key) {
    super(key);
    
  }

  public char[] messageEncoder(String word, int key) {
        return super.messageEncoder(word, key);
    }
    public char [] messageDecoder(String word, int key){
        return super.messageDecoder(word, key);
      
    }
}
