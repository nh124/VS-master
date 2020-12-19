class Main{
    public static void main(String[ ] args) {
       
        CaesarCipher cc = new CaesarCipher(1);
        RandomChiper rc = new RandomChiper(5);

        
        // System.out.println(cc.messageEncoder("How are you doing", 10)); 
        // System.out.println(cc.messageDecoder(String.valueOf(cc.messageEncoder("How are you doing", 10)), 10));


        System.out.println("-------------------------------------");
        System.out.println(rc.messageEncoder("Hello", 12));
        System.out.println(rc.messageDecoder("Tqxx{", 12));
        /*

        Scanner scan = new Scanner(System.in);
       
        CaesarCipher cc = new CaesarCipher(1);
        //RandomChiper rc = new RandomChiper(5);
        System.out.print("Please input the you message: ");
        String messageEncode = scan.nextLine();
        System.out.print("Please input you key: ");
        int keyE = scan.nextInt();
        System.out.println(cc.messageEncoder(messageEncode,keyE));

        System.out.print("Please input the encoded message: ");
        String messageDecode = scan.nextLine().toString();
        System.out.print("Please input you key: ");
        int keyD = scan.nextInt();
        System.out.println(cc.messageDecoder(messageDecode, keyD));
        */
     }
     /* Time complexities because the the inharited function are so similar to the parent
        The time complexity was only calculated for only one class the theme complexity for the other will be the same as
        well as big O, Omeage O, and theta O. 
     */
}
