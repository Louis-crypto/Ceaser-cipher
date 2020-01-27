import java.lang.*;

public class Cipher {
    private String userInput;
    private int userKey;

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher(String userInput, int userKey) {
        this.userInput = userInput;
        this.userKey = userKey;
    }

    public String getUserInput() {
        return this.userInput;
    }

    public int getUserKey() {
        return this.userKey;
    }

    String encryptedText(String userInput, int userKey){
        String encodedMessage = "";
       for(int i=0; i < userInput.length(); i++){
           char userInputCharacters = userInput.charAt(i);
           boolean emptySpace = Character.isWhitespace(userInputCharacters);
           boolean isADigit = Character.isDigit(userInputCharacters);

           int indexOfLetter = alphabet.indexOf(userInputCharacters);
           int characterPosition = indexOfLetter + userKey;
           if(characterPosition > 25) {
               encodedMessage += alphabet.charAt(characterPosition % 26);
           }
           else if(emptySpace){
               encodedMessage += ' ';
           }
           else if(isADigit){
               encodedMessage += userInputCharacters;
           }
           else{
               encodedMessage += alphabet.charAt(characterPosition);
           }
       }
       return encodedMessage;
    }

}
