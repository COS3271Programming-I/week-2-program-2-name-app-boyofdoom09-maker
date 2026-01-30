package test;
import java.util.Scanner;

public class Im {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your first name:");
        String first = scanner.nextLine();
        
        System.out.println("Enter your middle name:");
        String middle = scanner.nextLine();
        
        System.out.println("Enter your last name:");
        String last = scanner.nextLine();
        
        System.out.println("Enter your age:");
        int x = Integer.parseInt(scanner.nextLine()); 
        
        System.out.println("Enter your average amount of sleep in a day:");
        float y = Float.parseFloat(scanner.nextLine());
        
        System.out.println("Full Name: " + first + " " + middle + " " + last);
        System.out.println("Age: " + x);
        System.out.println("Average amount of sleep (in hours):" + y);
        
        scanner.close(); 
