/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Judy
 */
import java.util.Scanner;
public class CaesarCode {

    /**
     * @param args the command line arguments
     */public static final String letters = "abcdefghijklmnopqrstuvwxyz";
public static String encrypt(String txt, int Key) {
    txt = txt.toLowerCase();
    String cipherText = "";
    for (int i= 0; i < txt.length(); i++) {
      int charPosition = letters.indexOf(txt.charAt(i));
      int Valofkey = (Key + charPosition) % 26; //En(X)=(x+n)mod26
      char replaceVal = letters.charAt(Valofkey);
      cipherText += replaceVal;
    }
    return cipherText;
  }

public static String decrypt(String cipherText, int Key) {
      cipherText = cipherText.toLowerCase();
    String m = "";
    for (int i = 0; i < cipherText.length(); i++) {
      int charPosition = letters.indexOf(cipherText.charAt(i));
      int Valofkey = (charPosition - Key) % 26;
     if (Valofkey < 0) {
        Valofkey = letters.length() + Valofkey;
      }
      char replaceVal = letters.charAt(Valofkey);
      m += replaceVal;
    }
    return m;
  }
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    String txt = new String();
    int key = 0;
    System.out.print("Enter the txt to Encryption it :");
    txt = input.next();

    System.out.println("\n\nEnter Key for shifting key:");
    key = input.nextInt();
    System.out.println("the Encrpyted msg: "+encrypt(txt,key));
    System.out.println("do you want to decrypted it?");
     System.out.print("Enter the txt that encrybted to decrypted it:");
    txt = input.next();
    System.out.println("the Decrpyted msg: "+decrypt(txt,key));
  } 
} 
    
