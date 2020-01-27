class Decoding {
    private String encodedMessage;
    private int shiftKey;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Decoding(String encodedMessage, int shiftByKey) {
        this.encodedMessage = encodedMessage;
        this.shiftKey = shiftByKey;
    }

    public String getUserInput() {
        return this.encodedMessage;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }
    public String decryptedText(String encodedMessage, int shiftKey){
        String decryptedMessage = "";
        for(int i=0; i < encodedMessage.length(); i++){
            char userInputCharacters = encodedMessage.charAt(i);
            boolean emptySpace = Character.isWhitespace(userInputCharacters);
            boolean isADigit = Character.isDigit(userInputCharacters);

            int indexOfLetter = alphabet.indexOf(userInputCharacters);
            int relativePosition = indexOfLetter - shiftKey;
            int characterPosition = 26 + relativePosition;
            if(characterPosition > 25){
                decryptedMessage += alphabet.charAt(characterPosition%26);
            }
            else if(emptySpace){
                decryptedMessage += ' ';
            }
            else if(isADigit){
                decryptedMessage += userInputCharacters;
            }
            else{
                decryptedMessage += alphabet.charAt(characterPosition);
            }
        }
        return decryptedMessage;
    }
}
