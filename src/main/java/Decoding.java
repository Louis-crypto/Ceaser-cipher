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
            int indexOfLetter = alphabet.indexOf(userInputCharacters);
            int characterPosition = indexOfLetter - shiftKey;
            if(characterPosition < 0){
                decryptedMessage += alphabet.charAt(26-characterPosition%26);
            }
            else{
                decryptedMessage += alphabet.charAt(characterPosition);
            }
        }
        return decryptedMessage;
    }
}
