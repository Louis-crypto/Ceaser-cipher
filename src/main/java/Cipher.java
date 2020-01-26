class Cipher {
    private  String userInput;
    private int userKey;

    private String upperCaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    private String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";

public Cipher(String userInput, int userKey){
    this.userInput = userInput;
    this.userKey = userKey;
}
public String getUserInput(){
    return this.userInput;
}
public int getUserKey(){
    return this.userKey;
}

public String encodedText(String userInput, int userKey){
    for(i = 0; i < userInput.length(); i++){
    if(userKey > 25){
        System.out.println("Please enter a valid Key");
}else{
        int shiftBy = userKey + positionOfLetter
    }
}
}
//    public static void main(String[] args) {
//        Console console = System.console();
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        System.out.println("Enter your message");
//        String userInput = console.readLine();
//        String upperUserInput = userInput.toUpperCase();
//        for (int i = 0; i <= upperUserInput.length(); i++) {
//            char userInputCharacters = upperUserInput.charAt(i);
//            // System.out.println(userInputCharacters);
//            int keyOfLetter = alphabet.indexOf(userInputCharacters);
//            int userKey = keyOfLetter + 5;
//            System.out.println(userKey);
