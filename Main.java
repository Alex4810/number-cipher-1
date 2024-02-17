import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
public class Main {

public static void main(String[] args)
{
    intro();
    ask();

}
public static Scanner scan = new Scanner(System.in);
public static Random rng = new Random();
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
public static long generateKey()
{
    long min = 10L;
    long max = 99L;
    return rng.longs(min, max +1).findFirst().getAsLong();
}


public static void encrypt()
{
    long key = generateKey();
    String encryptedMessage = "";
    System.out.println("Please input the message you wish to encrypt:");
    String message = scan.nextLine().toLowerCase();
    for(int i = 0; i < message.length(); i++)
    {
        encryptedMessage += (Converter.charToInt(message.charAt(i)));
        encryptedMessage += "1";
    }

    long encryptedLong = Long.parseLong(encryptedMessage);
    encryptedLong = encryptedLong * key;

    encryptedMessage = "";
    encryptedMessage += encryptedLong;

    System.out.println("Your Symmetric Key is:" + key + "\nEncrypted Message: \n" + encryptedMessage);

}
public static void decrypt()
{

}

}

/*
w22
x23
j24
f25
b26
s27
m28
r29
v32
i33
e34
a35
l36
o37
q38
u39
p42
t43
y44
n45
h46
z47
g48
c49
k52
d53

 */


/*


 */