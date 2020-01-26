import java.io.Console;

public class App {
    public static  void main(String[] args){
        Console console = System.console();
        System.out.println("This is a Caesar Cipher encrypting app, Enter message you want to encrypt");
        String userEnteredInput = console.readLine();
        String userInput = userEnteredInput.toUpperCase();
        System.out.println("Enter by how many keys you want to shift your message");
        String userEnteredKey = console.readLine();
        int userKey = Integer.parseInt(userEnteredKey);
        Cipher cipher = new Cipher(userInput, userKey);
        System.out.println(cipher.encryptedText(userInput, userKey));
    }
}
