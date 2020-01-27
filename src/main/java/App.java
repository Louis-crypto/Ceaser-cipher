import java.io.Console;

public class App {
    public static  void main(String[] args){
        Console console = System.console();
        boolean programRunning = true;

        while(programRunning){
            System.out.println("This is a Caesar Cipher encrypting app, What do you want to do?");
            System.out.println("1: encrypt");
            System.out.println("2: decrypt");
            System.out.println("3: EXIT application");
            String userSelection = console.readLine();

            if(userSelection.equals("1")){
                System.out.println("Enter the message you want encrypted");
                String userEnteredInput = console.readLine();
                String userInput = userEnteredInput.toUpperCase();
                System.out.println("By how many keys do you want your message encrypted?");
                String userEnteredKey = console.readLine();
                int userKey = Integer.parseInt(userEnteredKey);
                Cipher cipher = new Cipher(userInput, userKey);
                System.out.println("Here is your encrypted message");
                System.out.println(cipher.encryptedText(userInput, userKey));
            }
            else if(userSelection.equals("2")){
                System.out.println("Enter the message you want to decrypt");
                String userEncryptedInput = console.readLine();
                String encodedMessage = userEncryptedInput.toUpperCase();
                System.out.println("By how many keys was your message encrypted?");
                String userShiftKey = console.readLine();
                int shiftKey = Integer.parseInt(userShiftKey);
                Decoding decodedMessage = new Decoding(encodedMessage, shiftKey);
                System.out.println("Here is your actual message");
                System.out.println(decodedMessage.decryptedText(encodedMessage, shiftKey));
            }
            else if(userSelection.equals("3")){
                programRunning = false;
            }
            else{
                System.out.println("Please enter a valid number");
            }
        }
    }
}
