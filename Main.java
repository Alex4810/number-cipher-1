import java.util.Scanner;
public class Main {

public static void main(String[] args)
{

}
public static Scanner scan = new Scanner(System.in);
public static void intro()
{
    System.out.println("Welcome to the Number Cipher Encryptor thing. I really like making these, apparently.");
}

public static void ask()
{
    System.out.println("Would you like to encrypt or decrypt?");
    String answer = scan.nextLine().toLowerCase();
    switch(answer)
    {
        case "encrypt":
            encrypt();
            break;
        case "decrypt":
            decrypt();
            break;
        default:
            System.out.println("Please enter 'encrypt' or 'decrypt'. Thanks.");
            ask();
    }

}

public static void encrypt()
{

}
public static void decrypt()
{

}

}
