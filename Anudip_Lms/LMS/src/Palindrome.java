import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is palindrome:");
        int num = input.nextInt();
        int rem;
        int result = 0;
        int temp = num;
        for (int i = 1; i <= num; i++) {
            rem = num % 10;
            result = result + rem;
        }
        if (result == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}