package test;
import java.util.Random;

public class Im {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(256);
        
        String bi = Integer.toBinaryString((int)randomNumber); 
        String hex= Integer.toHexString((int)randomNumber);
        int ASCII = (int)randomNumber;
        
        System.out.println("Random number in Base 10: " + randomNumber);
        System.out.println("Random Number in Binary: " + bi);
        System.out.println("Random Number in Hexidecimal: " + hex);
        System.out.println("Corresponding ASCII character: " + (char)randomNumber);
      
    }
}
